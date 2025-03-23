/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static com.threeleaf.test.random.TestByte.*;
import static com.threeleaf.test.random.TestInteger.*;
import static com.threeleaf.test.random.TestString.EMPTY;
import static com.threeleaf.test.random.generator.regex.Curly.REPETITIONS_MAX;
import static com.threeleaf.test.random.generator.regex.GroupHead.*;
import static com.threeleaf.test.random.generator.regex.Quantifier.*;
import static com.threeleaf.test.random.generator.regex.RegExFlags.*;
import static com.threeleaf.test.random.generator.regex.UnicodeType.*;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.util.Locale.ENGLISH;

import java.util.*;

import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;

/** Class that will generate random strings based on a regular expression. */
@Slf4j
@SuppressWarnings({"squid:S125", "fallthrough"})
public class RegExRandomStringFactory {

    /** The node initializer initializer. */
    public static final Node NODE_INITIALIZE = new Node();

    /** The original regular-expression pattern string. @serial */
    private final String pattern;

    /** Regular expression flags. */
    private final RegExFlags regExFlags;

    /** Temporary storage used by parsing pattern slice. */
    private int[] buffer;

    /**
     * The number of capturing groups in this  Used by matchers to allocate storage needed to
     * perform a match.
     */
    private int capturingGroupCount;

    /**
     * Temporary null terminated code point array used by
     * pattern compiling.
     */
    private int[] codePoints;

    /**
     * Index into the pattern string that
     * keeps track of how much has been parsed.
     */
    private int cursor;

    /** The number of groups found. */
    private int groupCount;

    /** Map the "name" of the "named capturing group" to its group id node. */
    private Map<String, Integer> namedGroups;

    /**
     * Holds the length of the pattern string.
     */
    private int patternLength;

    /**
     * The starting point of state machine for the find operation.  This allows a match to start
     * anywhere in the input.
     */
    private Node root;

    /**
     * Instantiate and initialize a new RegExRandomStringFactory.
     *
     * @param thePattern the RegEx pattern
     */
    public RegExRandomStringFactory(@NonNull final String thePattern) {
        pattern = thePattern;
        regExFlags = new RegExFlags();
        if (thePattern.length() > 0) {
            regExFlags.turnOn(UNICODE_CASE);
            parse();
        } else {
            root = new Start(new LastNode());
        }
    }

    private void append(final int ch, final int len) {
        if (len >= buffer.length) {
            final int[] tmp = new int[len + len];
            System.arraycopy(buffer, 0, tmp, 0, len);
            buffer = tmp;
        }
        buffer[len] = ch;
    }

    /**
     * Bits can only handle codepoints in [\u0000-\u00ff] range.
     * <p>Use "single" node instead of bits when dealing with unicode case folding for codepoints listed below:</p>
     * <ol>
     *     <li>Uppercase out of range: \u00ff, \u00b5 toUpperCase(\u00ff) -> \u0178 toUpperCase(\u00b5) -> \u039c</li>
     *     <li>LatinSmallLetterLongS \u017f toUpperCase(\u017f) -> \u0053</li>
     *     <li>LatinSmallLetterDotlessI \u0131 toUpperCase(\u0131) -> \u0049</li>
     *     <li>LatinCapitalLetterIWithDotAbove \u0130 toLowerCase(\u0130) -> \u0069</li>
     *     <li>KelvinSign \u212a toLowerCase(\u212a) ==> \u006B</li>
     *     <li>AngstromSign \u212b toLowerCase(\u212b) ==> \u00e5</li>
     * </ol>
     *
     * @param bits the current {@link CharBit}
     * @param ch   the character
     *
     * @return the mutated CharBit
     */
    private Char bitsOrSingle(final CharBit bits, final int ch) {
        final List<Character> specialCharacters = Arrays.asList('ÿ', 'µ', 'I', 'i', 'S', 's', 'K', 'k', 'Å', 'å');
        if (
            ch <= BYTE_UNSIGNED_MAX
                && regExFlags.isOff(CASE_INSENSITIVE)
                && regExFlags.isOff(UNICODE_CASE)
                && !specialCharacters.contains((char) ch)
        ) {
            return bits.add(ch, regExFlags);
        }

        return newCharSingle(ch);
    }

    /**
     * Processes repetition. If the next character peeked is a quantifier then new nodes must be
     * appended to handle the repetition. Prev could be a single or a group, so it could be a chain
     * of nodes.
     */
    private Node closure(final Node prev) {
        int ch = peek();
        switch (ch) {
            case '?':
                ch = next();
                if (ch == '?') {
                    next();
                    return new ZeroOrOne(prev, LAZY);
                } else if (ch == '+') {
                    next();
                    return new ZeroOrOne(prev, POSSESSIVE);
                }
                return new ZeroOrOne(prev, GREEDY);
            case '*':
                ch = next();
                if (ch == '?') {
                    next();
                    return new Curly(prev, INT_00, REPETITIONS_MAX, LAZY);
                } else if (ch == '+') {
                    next();
                    return new Curly(prev, INT_00, REPETITIONS_MAX, POSSESSIVE);
                }
                return new Curly(prev, INT_00, REPETITIONS_MAX, GREEDY);
            case '+':
                ch = next();
                if (ch == '?') {
                    next();
                    return new Curly(prev, INT_01, REPETITIONS_MAX, LAZY);
                } else if (ch == '+') {
                    next();
                    return new Curly(prev, INT_01, REPETITIONS_MAX, POSSESSIVE);
                }
                return new Curly(prev, INT_01, REPETITIONS_MAX, GREEDY);
            case '{':
                ch = codePoints[cursor + 1];
                if (AsciiType.isDigit(ch)) {
                    skip();
                    int repetitionsMin = 0;
                    do {
                        repetitionsMin = repetitionsMin * 10 + (ch - '0');
                    } while (AsciiType.isDigit(ch = read()));
                    int repetitionsMax;
                    if (ch == ',') {
                        ch = read();
                        if (ch == '}') {
                            repetitionsMax = repetitionsMin + REPETITIONS_MAX;
                        } else {
                            repetitionsMax = 0;
                            while (AsciiType.isDigit(ch)) {
                                repetitionsMax = repetitionsMax * 10 + (ch - '0');
                                ch = read();
                            }
                        }
                    } else {
                        repetitionsMax = repetitionsMin;
                    }
                    if (ch != '}') {
                        throw error("Unclosed counted closure");
                    }
                    if (((repetitionsMin) | (repetitionsMax) | (repetitionsMax - repetitionsMin)) < 0) {
                        throw error("Illegal repetition range");
                    }
                    final Curly curly;
                    ch = peek();
                    if (ch == '?') {
                        next();
                        curly = new Curly(prev, repetitionsMin, repetitionsMax, LAZY);
                    } else if (ch == '+') {
                        next();
                        curly = new Curly(prev, repetitionsMin, repetitionsMax, POSSESSIVE);
                    } else {
                        curly = new Curly(prev, repetitionsMin, repetitionsMax, GREEDY);
                    }
                    return curly;
                } else {
                    throw error("Illegal repetition");
                }
            default:
                return prev;
        }
    }

    /**
     * Parse a character class, and return the node that matches it. Consumes a ] on the way out if
     * consume is true. Usually consume is true except for the case of [abc&&def] where def is a
     * separate right-hand node with "understood" brackets.
     */
    private Char createCharNode(final boolean consume) {
        Char prev = null;
        Char node = null;
        final CharBit bits = new CharBit();
        boolean include = true;
        boolean firstInClass = true;
        boolean isIntersection = false;
        boolean isNegated = false;
        int ch = next();
        for (; ; ) {
            switch (ch) {
                case '^':
                    /* Negates if first character in a class */
                    if (firstInClass && codePoints[cursor - 1] == '[') {
                        ch = next();
                        isNegated = true;
                        continue;
                    }
                    break;
                case '[':
                    firstInClass = false;
                    node = createCharNode(true);
                    if (prev == null) {
                        prev = node;
                    } else {
                        if (isIntersection) {
                            prev = new CharIntersection(prev, node);
                            isIntersection = false;
                        } else {
                            prev = new CharUnion(prev, node);
                        }
                    }
                    ch = peek();
                    continue;
                case '&':
                    if (peek() == '&') {
                        next(); // Skip second &
                        isIntersection = true;
                        ch = next();
                        continue;
                    }
                    break;
                case ']':
                    firstInClass = false;
                    if (prev != null) {
                        if (consume) {
                            next();
                        }
                        /* For negated character classes, complement the entire result */
                        return isNegated ? prev.complement() : prev;
                    }
                    break;
                default:
                    firstInClass = false;
                    break;
            }
            node = range(bits);
            if (prev == null) {
                prev = node;
            } else {
                if (isIntersection) {
                    prev = new CharIntersection(prev, node);
                    isIntersection = false;
                } else {
                    prev = new CharUnion(prev, node);
                }
            }
            ch = peek();
        }
    }

    /**
     * Parse a new Char or Slice {@link Node}.
     *
     * @return the Node
     */
    private Node createCharOrSliceNode() {
        int length = 0;
        int cursorStart = -1;
        boolean hasSupplementary = false;
        int ch = peek();
        for (; ; ) {
            switch (ch) {
                case '*':
                case '+':
                case '?':
                case '{':
                    if (length > 1) {
                        cursor = cursorStart;
                        /* Unwind one character */
                        length--;
                    }
                    break;
                case '$':
                case '.':
                case '^':
                case '(':
                case '[':
                case '|':
                case ')':
                    break;
                case '\\':
                    ch = codePoints[++cursor];
                    if (ch == 'p' || ch == 'P') {
                        /* Property */
                        if (length > 0) {
                            /* Slice is waiting; handle it first */
                            cursor--;
                            break;
                        } else {
                            return createUnicodeNode(ch);
                        }
                    }
                    cursor--;
                    cursorStart = cursor;
                    ch = escape(false, length == 0, false);
                    if (ch >= 0) {
                        append(ch, length);
                        length++;
                        hasSupplementary = hasSupplementary || isSupplementary(ch);
                        ch = peek();
                        continue;
                    } else if (length == 0) {
                        return root;
                    }
                    /* Unwind meta escape sequence */
                    cursor = cursorStart;
                    break;
                case 0:
                    if (cursor >= patternLength) {
                        break;
                    }
                default:
                    cursorStart = cursor;
                    append(ch, length);
                    length++;
                    hasSupplementary = hasSupplementary || isSupplementary(ch);
                    ch = next();
                    continue;
            }
            break;
        }
        return length == 1
            ? newCharSingle(buffer[0])
            : newSlice(buffer, length, hasSupplementary);
    }

    /**
     * Create group head and tail nodes using double return. If the group is created with anonymous
     * true then it is a pure group and should not affect group counting.
     */
    private Node createGroupNode(final boolean anonymous, final String name) {
        final int groupIndex = groupCount++;
        int capturingGroupIndex = 0;
        if (!anonymous) {
            capturingGroupIndex = ++capturingGroupCount;
        }
        final GroupHead head = new GroupHead(groupIndex, capturingGroupIndex, name);
        root = new GroupTail(groupIndex, capturingGroupIndex, name);

        return head;
    }

    /**
     * Parses a group and returns the head node of a set of nodes that process the group. Sometimes
     * a double return system is used where the tail is returned in root.
     */
    private Node createGroupNode() {
        boolean isCapturingGroup = false;
        final String groupName;
        Node head;
        Node tail;
        final int originalFlags = regExFlags.getFlags();
        root = null;
        int ch = next();
        if (ch == '?') {
            ch = skip();
            switch (ch) {
                case ':':
                    /* (?:regex) non-capturing group  */
                    groupName = "Non-capturing group #" + (groupCount + 1);
                    head = createGroupNode(TRUE, groupName);
                    tail = root;
                    head.setNext(parse(tail));
                    break;
                case '=':
                case '!':
                    /* (?<[=!]regex) zero-width [positive|negative] lookahead group */
                    groupName = (ch == '=' ? "Positive" : "Negative") + " lookahead group #" + (groupCount + 1);
                    head = createGroupNode(TRUE, groupName);
                    tail = root;
                    head.setNext(parse(tail));
                    if (ch == '=') {
                        head = tail = new LookaheadPositive(head);
                    } else {
                        head = tail = new LookaheadNegative(head);
                    }
                    break;
                case '>':
                    /* (?>regex) Atomic, independent, non-capturing group */
                    groupName = "Independent group #" + (groupCount + 1);
                    head = createGroupNode(FALSE, groupName);
                    tail = root;
                    head.setNext(parse(tail));
                    break;
                case '<':
                    ch = read();
                    if (AsciiType.isLower(ch) || AsciiType.isUpper(ch)) {
                        /* (?<name>regex): named captured group */
                        final String name = groupName(ch);
                        if (namedGroups().containsKey(name)) {
                            throw error("Named capturing group <" + name + "> is already defined");
                        }
                        isCapturingGroup = true;
                        groupName = "Named <" + name + "> group #" + (groupCount + 1);
                        head = createGroupNode(FALSE, groupName);
                        tail = root;
                        namedGroups().put(name, capturingGroupCount);
                        head.setNext(parse(tail));
                    } else {
                        /* (?<[=!]regex) zero-width [positive|negative] lookbehind group */
                        groupName = (ch == '=' ? "Positive" : "Negative") + " lookbehind group #" + (groupCount + 1);
                        head = createGroupNode(TRUE, groupName);
                        tail = root;
                        head.setNext(parse(tail));
                        tail.setNext(new LookbehindEnd());
                        final NodeInfo info = new NodeInfo();
                        head.updateNodeInfo(info);
                        if (ch == '=') {
                            head = tail = new LookbehindPositive(head);
                        } else if (ch == '!') {
                            head = tail = new LookbehindNegative(head);
                        } else {
                            throw error("Unknown lookbehind group");
                        }
                    }
                    break;
                case '$':
                case '@':
                    throw error("Unknown group type");
                default:
                    /* (?[[imsducxU]+|-[imsducxU]+]) inlined modifier flags */
                    cursor--;
                    flagsSet();
                    ch = read();
                    if (ch == ')') {
                        /* Inline modifier only */
                        return null;
                    }
                    if (ch != ':') {
                        throw error("Unknown inline modifier");
                    }
                    /* (?xxx:regex) Non-capturing group with the inlined modifiers applied */
                    groupName = "Non-capturing inlined group with custom inline modifier flags #" + (groupCount + 1);
                    head = createGroupNode(TRUE, groupName);
                    tail = root;
                    head.setNext(parse(tail));
                    break;
            }
        } else {
            /* (regex) a regular group */
            isCapturingGroup = true;
            groupName = "Capturing group #" + (groupCount + 1);
            head = createGroupNode(FALSE, groupName);
            tail = root;
            head.setNext(parse(tail));
        }
        groupClose();
        regExFlags.setFlags(originalFlags);
        /* Check for quantifiers */
        final Node node = closure(head);
        if (node == head) {
            /* No closure */
            root = tail;

            /* Dual return */
            return node;
        }
        if (head == tail) {
            /* Zero length assertion */
            root = node;
            /* Dual return */
            return node;
        }
        if (node instanceof ZeroOrOne) {
            final ZeroOrOne zeroOrOne = (ZeroOrOne) node;
            if (zeroOrOne.getQuantifier() == POSSESSIVE) {
                root = node;
                return node;
            }
            tail.setNext(new BranchConnector());
            tail = tail.getNext();
            if (zeroOrOne.getQuantifier() == GREEDY) {
                head = new Branch(head, NODE_INITIALIZE, tail);
            } else {
                /* Reluctant quantifier */
                head = new Branch(NODE_INITIALIZE, head, tail);
            }
            root = tail;
            return head;
        } else if (node instanceof Curly) {
            final Curly curly = (Curly) node;
            if (curly.getQuantifier() == POSSESSIVE) {
                root = node;
                return node;
            }
            /* Discover if the group is deterministic */
            final NodeInfo info = new NodeInfo();
            head.updateNodeInfo(info);
            if (info.isDeterministic()) {
                /* Deterministic */
                final GroupTail groupTail = (GroupTail) tail;
                head = root = new GroupCurly(
                    head.getNext(),
                    curly.getMin(),
                    curly.getMax(),
                    curly.getQuantifier(),
                    groupTail.getGroupIndex(),
                    groupTail.getCapturingGroupReference(),
                    groupTail.getName(),
                    isCapturingGroup
                );

                return head;
            } else {
                /* Non-deterministic */
                final int groupHeadIndex = ((GroupHead) head).getGroupIndex();
                final GroupLoop groupLoop;
                if (curly.getQuantifier() == GREEDY) {
                    groupLoop = new GroupLoop(head, curly.getMin(), curly.getMax(), groupCount, groupHeadIndex);
                } else {
                    /* Reluctant Curly */
                    groupLoop = new GroupLoopLazy(head, curly.getMin(), curly.getMax(), groupCount, groupHeadIndex);
                }
                final GroupProlog groupProlog = new GroupProlog(groupLoop);
                groupCount += 1;
                root = groupLoop;

                /* Dual return */
                return groupProlog;
            }
        }
        throw error("Internal logic error");
    }

    /**
     * Parses a Unicode category and returns its representative node.
     * Categories follow a {@code \p} or {@code \P} token, where {@code \P} indicates
     * that the compliment of the category is desired.
     *
     * @param categoryToken the category token
     *
     * @return the Unicode node
     *
     * @see <a href="https://www.regular-expressions.info/unicode.html">Unicode Categories</a>
     */
    private Char createUnicodeNode(final int categoryToken) {
        Char node = null;
        String name = parseUnicodeCategoryName();
        final int i = name.indexOf('=');
        if (i == -1) {
            if (name.startsWith("In")) {
                /* \p{InBlockName} */
                node = new CharRangeUnicodeBlock(name.substring(2));
            } else if (name.startsWith("Is")) {
                /* \p{IsGeneralCategoryName} and \p{IsScriptName} */
                name = name.substring(2);
                node = Optional.ofNullable(forName(name))
                    .map(CharUnicodeType::new)
                    .orElse(null);
                if (node == null) {
                    try {
                        node = CharNames.charNodeFor(name);
                    } catch (final IllegalArgumentException ignored) {
                        node = new CharRangeUnicodeScript(name);
                    }
                }
            } else {
                if (regExFlags.isOn(UNICODE_CHARACTER_CLASS)) {
                    node = Optional.ofNullable(forPosixName(name))
                        .map(CharUnicodeType::new)
                        .orElse(null);
                }
                if (node == null) {
                    node = CharNames.charNodeFor(name);
                }
            }
        } else {
            /* property construct \p{property=name} */
            final String property = name.substring(0, i).toLowerCase(ENGLISH);
            final String propertyName = name.substring(i + 1);
            switch (property) {
                case "sc":
                case "script":
                    node = new CharRangeUnicodeScript(propertyName);
                    break;
                case "blk":
                case "block":
                    node = new CharRangeUnicodeBlock(propertyName);
                    break;
                case "gc":
                case "general_category":
                    node = CharNames.charNodeFor(propertyName);
                    break;
                default:
                    break;
            }
            if (node == null) {
                throw error("Unknown Unicode property {property=<" + property + ">, name=<" + name + ">}");
            }
        }
        if (categoryToken == 'P') {
            node = node.complement();
        }

        return node;
    }

    /**
     * Internal method used for handling all syntax errors. The pattern is displayed with a pointer
     * to aid in locating the syntax error.
     */
    private PatternSyntaxException error(final String s) {
        return new PatternSyntaxException(s, pattern, cursor - 1);
    }

    /**
     * Parses an escape sequence to determine the actual value that needs to be matched. If -1 is
     * returned and create was true a new object was added to the tree to handle the escape
     * sequence. If the returned value is greater than zero, it is the value that matches the escape
     * sequence.
     */
    private int escape(final boolean isInClass, final boolean create, final boolean isRange) {
        final int ch = skip();
        switch (ch) {
            case '0':
                return parseOctal();
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                if (isInClass) {
                    break;
                }
                if (create) {
                    root = ref(ch - '0');
                }
                return -1;
            case 'A':
                /* The beginning of the input */
                if (isInClass) {
                    break;
                }
                if (create) {
                    root = new Begin();
                }
                return -1;
            case 'B':
                /* Non-word boundary */
                if (isInClass) {
                    break;
                }
                if (create) {
                    root = new WordBoundary(false);
                }
                return -1;
            case 'C':
                break;
            case 'D':
                if (create) {
                    root = regExFlags.isOn(UNICODE_CHARACTER_CLASS)
                        ? new CharUnicodeType(UnicodeType.DIGIT).complement()
                        : new CharAscii(AsciiType.DIGIT).complement();
                }
                return -1;
            case 'E':
            case 'F':
                break;
            case 'G':
                /* Previous match */
                if (isInClass) {
                    break;
                }
                if (create) {
                    root = new LastMatch();
                }
                return -1;
            case 'H':
                if (create) {
                    root = new WhitespaceHorizontal().complement();
                }
                return -1;
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
                break;
            case 'R':
                if (isInClass) {
                    break;
                }
                if (create) {
                    root = new LineEnding();
                }
                return -1;
            case 'S':
                if (create) {
                    root = regExFlags.isOn(UNICODE_CHARACTER_CLASS)
                        ? new CharUnicodeType(WHITE_SPACE).complement()
                        : new CharAscii(AsciiType.SPACE).complement();
                }
                return -1;
            case 'T':
            case 'U':
                break;
            case 'V':
                if (create) {
                    root = new WhitespaceVertical().complement();
                }
                return -1;
            case 'W':
                if (create) {
                    root = regExFlags.isOn(UNICODE_CHARACTER_CLASS)
                        ? new CharUnicodeType(UnicodeType.WORD).complement()
                        : new CharAscii(AsciiType.WORD).complement();
                }
                return -1;
            case 'X':
            case 'Y':
                break;
            case 'Z':
                /* The Quotemeta end token */
                if (isInClass) {
                    break;
                }
                if (create) {
                    root = regExFlags.isOn(UNIX_LINES)
                        ? new EndUnix(false)
                        : new End(false);
                }
                return -1;
            case 'a':
                /* The alert (bell) character ('\u0007') */
                return '\007';
            case 'b':
                /* Word Boundary */
                if (isInClass) {
                    break;
                }
                if (create) {
                    root = new WordBoundary(true);
                }
                return -1;
            case 'c':
                /* The control character corresponding to x (example: \cx) */
                return parseControlCharacter();
            case 'd':
                if (create) {
                    root = regExFlags.isOn(UNICODE_CHARACTER_CLASS)
                        ? new CharUnicodeType(UnicodeType.DIGIT)
                        : new CharAscii(AsciiType.DIGIT);
                }
                return -1;
            case 'e': /* The escape character ('\u001B') */
                return '\033';
            case 'f': /* The form-feed character ('\u000C') */
                return '\f';
            case 'g':
                break;
            case 'h':
                if (create) {
                    root = new WhitespaceHorizontal();
                }
                return -1;
            case 'i':
            case 'j':
                break;
            case 'k':
                if (isInClass) {
                    break;
                }
                if (read() != '<') {
                    throw error("\\k is not followed by '<' for named capturing group");
                }
                final String name = groupName(read());
                if (!namedGroups().containsKey(name)) {
                    throw error("Capturing group <" + name + "> does not exit");
                }
                if (create) {
                    root = regExFlags.isOn(CASE_INSENSITIVE)
                        ? new BackReferenceInsensitive(namedGroups().get(name))
                        : new BackReference(namedGroups().get(name));
                }
                return -1;
            case 'l':
            case 'm':
                break;
            case 'n':
                /* The newline (line feed) character ('\u000A') */
                return '\n';
            case 'o':
            case 'p':
            case 'q':
                break;
            case 'r':
                /* The carriage-return character ('\u000D') */
                return '\r';
            case 's':
                if (create) {
                    root = regExFlags.isOn(UNICODE_CHARACTER_CLASS)
                        ? new CharUnicodeType(WHITE_SPACE)
                        : new CharAscii(AsciiType.SPACE);
                }
                return -1;
            case 't': /* The tab character ('\u0009') */
                return '\t';
            case 'u':
                return parseUnicode();
            case 'v':
                /* vertical whitespace characters */
                if (isRange) {
                    return '\013';
                }
                if (create) {
                    root = new WhitespaceVertical();
                }
                return -1;
            case 'w':
                if (create) {
                    root = regExFlags.isOn(UNICODE_CHARACTER_CLASS)
                        ? new CharUnicodeType(UnicodeType.WORD)
                        : new CharAscii(AsciiType.WORD);
                }
                return -1;
            case 'x':
                return parseHexadecimal();
            case 'y':
                break;
            case 'z':
                if (isInClass) {
                    break;
                }
                if (create) {
                    root = new EndAbsolute();
                }
                return -1;
            default:
                return ch;
        }
        throw error("Illegal/unsupported escape sequence");
    }

    /**
     * Escape all the characters between "quotemeta" {@code \Q} and {@code \E} markers
     * so as not to process any regular expression code that is between them. The
     * quotemeta markers are removed in this process.
     *
     * @see <a href="https://perldoc.perl.org/functions/quotemeta">Perl quotemeta</a>
     */
    private void escapeQuotemetaBlocks() {
        int i = 0;
        while (i < patternLength - 1) {
            /* Search for \Q token */
            if (codePoints[i] != '\\') {
                i += 1;
            } else if (codePoints[i + 1] != 'Q') {
                i += 2;
            } else {
                break;
            }
        }
        if (i >= patternLength - 1) {
            /* No \Q token found */
            return;
        }
        int j = i;
        i += 2;
        /* Escaped sequence may be up to 3x size of original. */
        final int[] escaped = new int[j + 3 * (patternLength - i) + 2];
        System.arraycopy(codePoints, 0, escaped, 0, j);
        boolean inQuote = true;
        boolean beginQuote = true;
        while (i < patternLength) {
            final int character = codePoints[i++];
            if (!AsciiType.isAscii(character) || AsciiType.isAlpha(character)) {
                escaped[j++] = character;
            } else if (AsciiType.isDigit(character)) {
                if (beginQuote) {
                    /* A unicode escape \[0xu] could be before this quote,
                    and we don't want this numeric char to processed as part of the escape. */
                    escaped[j++] = '\\';
                    escaped[j++] = 'x';
                    escaped[j++] = '3';
                }
                escaped[j++] = character;
            } else if (character != '\\') {
                if (inQuote) {
                    /* Add escape here. */
                    escaped[j++] = '\\';
                }
                escaped[j++] = character;
            } else if (inQuote) {
                if (codePoints[i] == 'E') {
                    /* End of quotemeta (\E) found - drop marker */
                    i++;
                    inQuote = false;
                } else {
                    /* Escape this escape marker. */
                    escaped[j++] = '\\';
                    escaped[j++] = '\\';
                }
            } else {
                if (codePoints[i] == 'Q') {
                    /* Beginning of another quotemeta (\Q) found - drop marker */
                    i++;
                    inQuote = true;
                    beginQuote = true;
                    continue;
                } else {
                    escaped[j++] = character;
                    if (i != patternLength) {
                        escaped[j++] = codePoints[i++];
                    }
                }
            }
            beginQuote = false;
        }
        patternLength = j;
        /* double zero termination */
        codePoints = Arrays.copyOf(escaped, j + 2);
    }

    /** Parses inlined match flags and set them appropriately. */
    private void flagsSet() {
        int ch = peek();
        for (; ; ) {
            if (ch == '-') {
                next();
                flagsUnset();
                break;
            } else {
                if (regExFlags.flagOn(ch)) {
                    ch = next();
                } else {
                    break;
                }
            }
        }
    }

    /** Parses the second part of inlined match flags and turns off flags appropriately. */
    private void flagsUnset() {
        int ch = peek();
        for (; ; ) {
            if (regExFlags.flagOff(ch)) {
                ch = next();
            } else {
                break;
            }
        }
    }

    /**
     * Ensures that the cursor is at the end of the group.
     * In extended mode (x-mode), skip past any whitespace and comments.
     */
    private void groupClose() {
        int ch = codePoints[cursor++];
        if (regExFlags.isOn(COMMENTS)) {
            ch = parsePastWhitespace(ch);
        }
        if (')' != ch) {
            throw error("Unclosed group");
        }
    }

    /**
     * Parses and returns the name of a "named capturing group", the trailing ">" is consumed after
     * parsing.
     */
    private String groupName(int ch) {
        if (ch == '>') {
            throw error("Capturing group has 0 length name");
        }
        final StringBuilder sb = new StringBuilder().append(Character.toChars(ch));
        while (AsciiType.isLower(ch = read()) || AsciiType.isUpper(ch) || AsciiType.isDigit(ch)) {
            sb.append(Character.toChars(ch));
        }
        if (ch != '>') {
            throw error("Capturing group is missing trailing '>'");
        }
        return sb.toString();
    }

    /**
     * Determines if character is not a line separator in the current mode.
     *
     * @param ch the current character
     *
     * @return true if not a line separator
     */
    private boolean isNotLineSeparator(final int ch) {
        return regExFlags.isOn(UNIX_LINES)
            ? ch != '\n'
            : !(ch == '\n' || ch == '\r' || (ch | 1) == '\u2029' || ch == '\u0085');
    }

    /**
     * Determines if the specified code point is a supplementary character or unpaired surrogate.
     *
     * @param ch the character
     *
     * @return true if supplementary or surrogate
     */
    private boolean isSupplementary(final int ch) {
        return Character.isSupplementaryCodePoint(ch) || Character.isSurrogate((char) ch);
    }

    /** Mark the end of pattern with a specific character. */
    private void mark(final int c) {
        codePoints[patternLength] = c;
    }

    Map<String, Integer> namedGroups() {
        if (namedGroups == null) {
            namedGroups = new HashMap<>(2);
        }

        return namedGroups;
    }

    /**
     * Return a single character generator for the specified character.
     *
     * @param character the character
     *
     * @return the Char class that will generate the character
     */
    private Char newCharSingle(final int character) {
        if (regExFlags.isOn(CASE_INSENSITIVE)) {
            final int lowerCaseCharacter;
            final int upperCaseCharacter;
            if (regExFlags.isOn(UNICODE_CASE)) {
                upperCaseCharacter = Character.toUpperCase(character);
                lowerCaseCharacter = Character.toLowerCase(upperCaseCharacter);
                return upperCaseCharacter == lowerCaseCharacter
                    ? new CharSingleUnicode((char) lowerCaseCharacter)
                    : new CharSingleUnicodeInsensitive((char) lowerCaseCharacter, (char) upperCaseCharacter);
            } else if (AsciiType.isAscii(character)) {
                lowerCaseCharacter = AsciiType.toLower(character);
                upperCaseCharacter = AsciiType.toUpper(character);
                return lowerCaseCharacter == upperCaseCharacter
                    ? new CharSingle((char) lowerCaseCharacter)
                    : new CharSingleInsensitive((char) lowerCaseCharacter, (char) upperCaseCharacter);
            }
        }

        return isSupplementary(character)
            ? new CharSingleSupplementary(character)
            : new CharSingle((char) character);
    }

    /** Utility method for creating a string slice matcher. */
    private Node newSlice(final int[] characters, final int count, final boolean hasSupplementary) {
        final int[] charactersProcessed = new int[count];
        if (regExFlags.isOn(CASE_INSENSITIVE)) {
            if (regExFlags.isOn(UNICODE_CASE)) {
                for (int i = 0; i < count; i++) {
                    charactersProcessed[i] = Character.toLowerCase(Character.toUpperCase(characters[i]));
                }
                return hasSupplementary ? new SliceUnicodeSupplementaryInsensitive(charactersProcessed) : new SliceUnicodeInsensitive(charactersProcessed);
            }
            for (int i = 0; i < count; i++) {
                charactersProcessed[i] = AsciiType.toLower(characters[i]);
            }
            return hasSupplementary ? new SliceSupplementaryInsensitive(charactersProcessed) : new SliceInsensitive(charactersProcessed);
        }
        System.arraycopy(characters, 0, charactersProcessed, 0, count);

        return hasSupplementary ? new SliceSupplementary(charactersProcessed) : new Slice(charactersProcessed);
    }

    /**
     * Advance the cursor and return the character at that position.
     *
     * @return the next character
     */
    private int next() {
        int ch = codePoints[++cursor];
        if (regExFlags.isOn(COMMENTS)) {
            ch = peekPastWhitespace(ch);
        }

        return ch;
    }

    /**
     * Copies regular expression to a char point (int) array
     * and invokes the parsing of the expression into a linked list.
     */
    private void parse() {
        patternLength = pattern.length();
        /* Copy pattern to int array for convenience. Use double zero to terminate pattern */
        codePoints = new int[patternLength + 2];
        int character;
        int count = 0;
        /* Convert all chars into code points */
        for (int x = 0; x < patternLength; x += Character.charCount(character)) {
            character = pattern.codePointAt(x);
            codePoints[count++] = character;
        }
        escapeQuotemetaBlocks();
        /* Allocate all temporary objects here. */
        buffer = new int[INT_32];
        namedGroups = null;
        /* Start recursive parsing */
        final Node parsedRegex = parse(new LastNode());
        /* Check extra pattern characters */
        if (patternLength != cursor) {
            if (peek() == ')') {
                throw error("Unmatched closing ')'");
            } else {
                throw error("Unexpected internal error");
            }
        }
        root = parsedRegex instanceof Begin
            ? parsedRegex
            : new Start(parsedRegex);

        /* Release temporary storage */
        codePoints = null;
        buffer = null;
        patternLength = 0;
    }

    /**
     * Parse to a linked list, accounting for branching that may occur.
     *
     * @param end the Node to place at the end of the list
     *
     * @return the first node of the linked list
     */
    private Node parse(final Node end) {
        Node previousNode = null;
        Node firstTail = null;
        Branch branch = null;
        Node branchConnector = null;
        for (; ; ) {
            final Node node = sequence(end);
            /* double return */
            final Node nodeTail = root;
            if (previousNode == null) {
                previousNode = node;
                firstTail = nodeTail;
            } else {
                /* Branch */
                if (branchConnector == null) {
                    branchConnector = new BranchConnector();
                    branchConnector.setNext(end);
                }
                if (previousNode == branch) {
                    branch.add(node);
                } else {
                    if (previousNode == end) {
                        previousNode = null;
                    } else {
                        /* replace the "end" with "branchConnector" at its tail. */
                        firstTail.setNext(branchConnector);
                    }
                    previousNode = branch = new Branch(previousNode, node, branchConnector);
                }
                if (node != end) {
                    /* the "tail.next" of each atom goes to branchConn */
                    nodeTail.setNext(branchConnector);
                }
            }
            if (peek() != '|') {
                return previousNode;
            }
            next();
        }
    }

    /** Utility method for parsing control escape sequences. */
    private int parseControlCharacter() {
        if (cursor < patternLength) {
            return read() ^ B_64;
        }
        throw error("Illegal control escape sequence");
    }

    /** Utility method for parsing hexadecimal escape sequences. */
    private int parseHexadecimal() {
        int n = read();
        if (AsciiType.isHexDigit(n)) {
            final int m = read();
            if (AsciiType.isHexDigit(m)) {
                return AsciiType.toDigit(n) * B_16 + AsciiType.toDigit(m);
            }
        } else if (n == '{' && AsciiType.isHexDigit(peek())) {
            int ch = 0;
            while (AsciiType.isHexDigit(n = read())) {
                ch = (ch << 4) + AsciiType.toDigit(n);
                if (ch > Character.MAX_CODE_POINT) {
                    throw error("Hexadecimal codepoint is too big");
                }
            }
            if (n != '}') {
                throw error("Unclosed hexadecimal escape sequence");
            }

            return ch;
        }
        throw error("Illegal hexadecimal escape sequence");
    }

    /** Utility method for parsing octal escape sequences. */
    private int parseOctal() {
        final int n = read();
        if (((n - '0') | ('7' - n)) >= 0) {
            final int m = read();
            if (((m - '0') | ('7' - m)) >= 0) {
                final int octal = read();
                if ((((octal - '0') | ('7' - octal)) >= 0) && (((n - '0') | ('3' - n)) >= 0)) {
                    return (n - '0') * B_64 + (m - '0') * B_08 + (octal - '0');
                }
                cursor--;
                return (n - '0') * B_08 + (m - '0');
            }
            cursor--;

            return (n - '0');
        }
        throw error("Illegal octal escape sequence");
    }

    /**
     * In extended mode (x-mode), return the next character, skipping any line separators.
     *
     * @return the next character
     */
    private int parsePastComment() {
        int ch = codePoints[cursor++];
        while (ch != 0 && isNotLineSeparator(ch)) {
            ch = codePoints[cursor++];
        }
        if (ch == 0 && cursor > patternLength) {
            cursor = patternLength;
            ch = codePoints[cursor++];
        }

        return ch;
    }

    /**
     * In extended mode (x-mode) parse past whitespace and comments.
     *
     * @param ch the current character
     *
     * @return the original character if not a whitespace or start of a comment,
     *     otherwise, the first character after whitespace or comment
     */
    private int parsePastWhitespace(int ch) {
        while (AsciiType.isSpace(ch) || ch == '#') {
            while (AsciiType.isSpace(ch)) {
                ch = codePoints[cursor++];
            }
            if (ch == '#') {
                ch = parsePastComment();
            }
        }

        return ch;
    }

    /**
     * Get the Unicode value.
     *
     * @return the Unicode value as an integer
     */
    private int parseUnicode() {
        final int unicode = parseUnicodeValue();
        if (Character.isHighSurrogate((char) unicode)) {
            final int currentCursor = cursor;
            if (read() == '\\' && read() == 'u') {
                final int unicode2 = parseUnicodeValue();
                if (Character.isLowSurrogate((char) unicode2)) {
                    return Character.toCodePoint((char) unicode, (char) unicode2);
                }
            }
            cursor = currentCursor;
        }

        return unicode;
    }

    /**
     * Parse the Unicode category name after a {@code \p} or {@code \P} token.
     *
     * @return the category name.
     */
    private String parseUnicodeCategoryName() {
        /* Some category names may be single characters, like "\pL" for letter,
         * or a category name may be enclosed in braces, like "\p{Letter}". */
        boolean singleLetter = true;
        int ch = next();
        if (ch == '{') {
            singleLetter = false;
        } else {
            cursor--;
        }
        next();
        final String name;
        if (singleLetter) {
            final int c = codePoints[cursor];
            if (Character.isSupplementaryCodePoint(c)) {
                name = new String(codePoints, cursor, 1);
            } else {
                name = String.valueOf((char) c);
            }
            read();
        } else {
            final int i = cursor;
            mark('}');
            do {
                ch = read();
            } while (ch != '}');
            mark('\000');
            final int j = cursor;
            if (j > patternLength) {
                throw error("Unclosed Unicode category name");
            }
            if (i + 1 >= j) {
                throw error("Empty Unicode category name");
            }
            name = new String(codePoints, i, j - i - 1);
        }

        return name;
    }

    /**
     * Get Unicode value.
     *
     * @return Unicode value as integer
     */
    private int parseUnicodeValue() {
        int unicode = 0;
        for (int i = 0; i < 4; i++) {
            final int ch = read();
            if (!AsciiType.isHexDigit(ch)) {
                throw error("Illegal Unicode escape sequence");
            }
            unicode = unicode * B_16 + AsciiType.toDigit(ch);
        }

        return unicode;
    }

    /**
     * Retrieve the character at the cursor.
     * If extended mode (x-mode) is active, advance the cursor past whitespace and comments
     * and return the character at that position.
     *
     * @return the next character.
     */
    private int peek() {
        int ch = codePoints[cursor];
        if (regExFlags.isOn(COMMENTS)) {
            ch = peekPastWhitespace(ch);
        }

        return ch;
    }

    /**
     * Starting at the current character, advance to the end of the line or the end of the pattern.
     * Specifically for use when skipping over a comment within the regular expression in extended mode (x-mode).
     *
     * @return the last character of the line or pattern
     */
    private int peekPastComment() {
        int ch = codePoints[++cursor];
        while (ch != 0 && isNotLineSeparator(ch)) {
            ch = codePoints[++cursor];
        }

        return ch;
    }

    /**
     * Starting at the current character, advance past any whitespace and comments.
     * For use in extended mode (x-mode)
     *
     * @param ch the character at the current cursor position
     *
     * @return the next non-whitespace character not in a comment.
     */
    private int peekPastWhitespace(int ch) {
        while (AsciiType.isSpace(ch) || ch == '#') {
            while (AsciiType.isSpace(ch)) {
                ch = codePoints[++cursor];
            }
            if (ch == '#') {
                ch = peekPastComment();
            }
        }

        return ch;
    }

    public String random() {
        BackReference.clear();
        String value = root.random(null);
        for (int captureGroupNumber = 0; captureGroupNumber < capturingGroupCount; captureGroupNumber++) {
            final char captureGroupIndex = (char) ((captureGroupNumber + 1) * 2);
            final String groupRegEx = EMPTY
                + GROUP_SEPARATOR
                + TEXT_START
                + captureGroupIndex
                + ".*?"
                + TEXT_END
                + GROUP_SEPARATOR
                + captureGroupIndex;
            value = value.replaceAll(groupRegEx, EMPTY);
        }

        return value;
    }

    /**
     * Parse a single character or a character range in a character class and return its
     * representative node.
     */
    private Char range(final CharBit bits) {
        int ch = peek();
        if (ch == '\\') {
            ch = codePoints[++cursor];
            if (ch == 'p' || ch == 'P') {
                return createUnicodeNode(ch);
            } else {
                /* ordinary escape */
                final boolean isRange = codePoints[cursor + 1] == '-';
                cursor--;
                ch = escape(true, true, isRange);
                if (ch == -1) {
                    return (Char) root;
                }
            }
        } else {
            next();
        }
        if (ch >= 0) {
            if (peek() == '-') {
                final int endRange = codePoints[cursor + 1];
                if (endRange == '[') {
                    return bitsOrSingle(bits, ch);
                }
                if (endRange != ']') {
                    next();
                    int m = peek();
                    if (m == '\\') {
                        m = escape(true, false, true);
                    } else {
                        next();
                    }
                    if (m < ch) {
                        throw error("Illegal character range");
                    }
                    if (regExFlags.isOn(CASE_INSENSITIVE)) {
                        return regExFlags.isOn(UNICODE_CASE) ?
                            new CharRangeUnicodeInsensitive((char) ch, (char) m) :
                            new CharRangeInsensitive((char) ch, (char) m)
                            ;
                    } else {
                        return new CharRange((char) ch, (char) m);
                    }
                }
            }
            return bitsOrSingle(bits, ch);
        }
        throw error("Unexpected character '" + ((char) ch) + "'");
    }

    /**
     * Read the next character, and advance the cursor by one.
     *
     * @return the next character
     */
    private int read() {
        int ch = codePoints[cursor++];
        if (regExFlags.isOn(COMMENTS)) {
            ch = parsePastWhitespace(ch);
        }

        return ch;
    }

    /**
     * Parses a back reference greedily, taking as many numbers as it can. The first digit is always
     * treated as a backref, but multi digit numbers are only treated as a backref if at least that
     * many back references exist at this point in the regex.
     */
    private Node ref(int refNum) {
        boolean done = false;
        while (!done) {
            final int ch = peek();
            switch (ch) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    /* Add another number if it doesn't make a group that doesn't exist */
                    final int newRefNum = (refNum * 10) + (ch - '0');
                    if (capturingGroupCount < newRefNum) {
                        done = true;
                        break;
                    }
                    refNum = newRefNum;
                    read();
                    break;
                default:
                    done = true;
                    break;
            }
        }
        if (regExFlags.isOn(CASE_INSENSITIVE)) {
            return new BackReferenceInsensitive(refNum);
        } else {
            return new BackReference(refNum);
        }
    }

    /** Parsing of sequences between alternations. */
    private Node sequence(final Node end) {
        Node head = null;
        Node tail = null;
        Node node;
        LOOP:
        for (; ; ) {
            final int ch = peek();
            switch (ch) {
                case '(':
                    /* Because group handles its own closure, we need to treat it differently */
                    node = createGroupNode();
                    /* Check for comment or flag group */
                    if (node == null) {
                        continue;
                    }
                    if (head == null) {
                        head = node;
                    } else {
                        tail.setNext(node);
                    }
                    /* Double return: Tail was returned in root */
                    tail = root;
                    continue;
                case '[':
                    node = createCharNode(true);
                    break;
                case '\\':
                    /* An escape token will result in a single character or slice of characters */
                    node = createCharOrSliceNode();
                    break;
                case '^':
                    /* The Beginning of a line. */
                    next();
                    if (regExFlags.isOn(MULTILINE)) {
                        node = regExFlags.isOn(UNIX_LINES)
                            ? new CaretUnix()
                            : new Caret();
                    } else {
                        node = new Begin();
                    }
                    break;
                case '$':
                    /* The end of a line */
                    next();
                    node = regExFlags.isOn(UNIX_LINES)
                        ? new EndUnix(regExFlags.isOn(MULTILINE))
                        : new End(regExFlags.isOn(MULTILINE));
                    break;
                case '.':
                    next();
                    if (regExFlags.isOn(DOTALL)) {
                        node = new DotAll();
                    } else {
                        node = regExFlags.isOn(UNIX_LINES)
                            ? new DotUnix()
                            : new Dot();
                    }
                    break;
                case '|':
                case ')':
                    break LOOP;
                case ']':
                case '}':
                    /* Interpret dangling ] and } as literals */
                    node = createCharOrSliceNode();
                    break;
                case '?':
                case '*':
                case '+':
                    next();
                    throw error("Dangling meta character '" + ((char) ch) + "'");
                case 0:
                    if (cursor >= patternLength) {
                        break LOOP;
                    }
                default:
                    node = createCharOrSliceNode();
                    break;
            }
            node = closure(node);
            if (head == null) {
                head = node;
            } else {
                tail.setNext(node);
            }
            tail = node;
        }
        if (head == null) {
            return end;
        }
        tail.setNext(end);
        root = tail;
        /* double return */
        return head;
    }

    /** Read the character after the next one, and advance the cursor by two. */
    private int skip() {
        final int i = cursor;
        final int ch = codePoints[i + 1];
        cursor = i + 2;

        return ch;
    }

    /**
     * Returns the original regular expression.
     *
     * @return The regular expression
     */
    @Override
    public String toString() {
        return pattern;
    }

}
