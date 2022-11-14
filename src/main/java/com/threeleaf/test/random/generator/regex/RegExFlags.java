/*
 * Copyright 2022, ThreeLeaf.com
 */

package com.threeleaf.test.random.generator.regex;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import lombok.Data;

/** Class to handle regular expression flags. */
@Data
public class RegExFlags {

    /**
     * Enables canonical equivalence.
     * <p>When this flag is specified then two characters will be
     * considered to match if, and only if, their full canonical decompositions match. The
     * expression <code>"a&#92;u030A"</code>, for example, will match the string <code>"&#92;u00E5"</code>
     * when this flag is specified.  By default, matching does not take canonical equivalence into
     * account.</p>
     * <p>There is no embedded flag character for enabling canonical equivalence. <p>
     * Specifying this flag may impose a performance penalty.</p>
     */
    public static final int CANON_EQ = 0x80;

    /**
     * Enables case-insensitive matching.
     * <p>By default, case-insensitive matching assumes that
     * only characters in the US-ASCII charset are being matched.  Unicode-aware case-insensitive
     * matching can be enabled by specifying the {@link #UNICODE_CASE} flag in conjunction with this
     * flag.</p>
     * <p>Case-insensitive matching can also be enabled via the embedded flag
     * expression&nbsp;<code>(?i)</code>. <p>Specifying this flag may impose a slight performance
     * penalty.</p>
     */
    public static final int CASE_INSENSITIVE = 0x02;

    /**
     * Permits whitespace and comments.
     * <p>In this mode, whitespace is ignored, and embedded
     * comments starting with <code>#</code> are ignored until the end of a line.</p>
     * <p>Comments mode can
     * also be enabled via the embedded flag expression&nbsp;<code>(?x)</code>.</p>
     */
    public static final int COMMENTS = 0x04;

    /**
     * Enables dotall mode.
     * <p>In dotall mode, the expression
     * <code>.</code> matches any character, including a line terminator.  By default, this expression does not match line terminators.</p>
     * <p>Dotall mode can also be enabled via the embedded flag expression
     * <code>(?s)</code>.  (The <code>s</code> is a mnemonic for "single-line" mode, which is what this is called in Perl.)</p>
     */
    public static final int DOTALL = 0x20;

    /**
     * Enables multiline mode.
     * <p>In multiline mode the expressions <code>^</code> and <code>$</code> match
     * just after or just before, respectively, a line terminator or the end of the input sequence.
     * By default, these expressions only match at the beginning and the end of the entire input
     * sequence.</p>
     * <p>Multiline mode can also be enabled via the embedded flag
     * expression&nbsp;<code>(?m)</code>.</p>
     */
    public static final int MULTILINE = 0x08;

    /**
     * Enables Unicode-aware case folding.
     * <p>When this flag is specified then case-insensitive
     * matching, when enabled by the {@link #CASE_INSENSITIVE} flag, is done in a manner consistent
     * with the Unicode Standard.  By default, case-insensitive matching assumes that only
     * characters in the US-ASCII charset are being matched.</p>
     * <p>Unicode-aware case folding can also
     * be enabled via the embedded flag expression&nbsp;<code>(?u)</code>. <p>Specifying this flag may
     * impose a performance penalty.</p>
     */
    public static final int UNICODE_CASE = 0x40;

    /**
     * Enables the Unicode version of <i>Predefined character classes</i> and <i>POSIX character
     * classes</i>.
     * <p>When this flag is specified then the (US-ASCII only) <i>Predefined character
     * classes</i> and <i>POSIX character classes</i> are in conformance with <a
     * href="http://www.unicode.org/reports/tr18/"><i>Unicode Technical Standard #18: Unicode
     * Regular Expression</i></a> <i>Annex C: Compatibility Properties</i>.
     * <p>The UNICODE_CHARACTER_CLASS mode can also be enabled via the embedded flag
     * expression&nbsp;<code>(?U)</code>.</p>
     * <p>The flag implies UNICODE_CASE, that is, it enables
     * Unicode-aware case folding. <p>Specifying this flag may impose a performance penalty.</p>
     *
     * @since 1.7
     */
    public static final int UNICODE_CHARACTER_CLASS = 0x100;

    /**
     * Enables Unix lines mode.
     * <p>In this mode, only the <code>'\n'</code> line terminator is
     * recognized in the behavior of <code>.</code>, <code>^</code>, and <code>$</code>.</p>
     * <p>Unix lines mode can
     * also be enabled via the embedded flag expression&nbsp;<code>(?d)</code>.</p>
     */
    public static final int UNIX_LINES = 0x01;

    /** The RegEx flags. */
    private int flags;

    /**
     * Turn a flag off based on a character flag.
     *
     * @param flagCharacter the character flag
     *
     * @return true if the flag was valid and was turned aff
     */
    public boolean flagOff(final int flagCharacter) {
        boolean turnedOff = TRUE;
        switch (flagCharacter) {
            case 'i':
                turnOff(CASE_INSENSITIVE);
                break;
            case 'm':
                turnOff(MULTILINE);
                break;
            case 's':
                turnOff(DOTALL);
                break;
            case 'd':
                turnOff(UNIX_LINES);
                break;
            case 'u':
                turnOff(UNICODE_CASE);
                break;
            case 'c':
                turnOff(CANON_EQ);
                break;
            case 'x':
                turnOff(COMMENTS);
                break;
            case 'U':
                turnOff(UNICODE_CHARACTER_CLASS | UNICODE_CASE);
                break;
            default:
                turnedOff = FALSE;
        }

        return turnedOff;
    }

    /**
     * Turn a flag on based on a character flag.
     *
     * @param flagCharacter the character flag
     *
     * @return true if the flag was valid and was turned on
     */
    public boolean flagOn(final int flagCharacter) {
        boolean turnedOn = TRUE;

        switch (flagCharacter) {
            case 'i':
                turnOn(CASE_INSENSITIVE);
                break;
            case 'm':
                turnOn(MULTILINE);
                break;
            case 's':
                turnOn(DOTALL);
                break;
            case 'd':
                turnOn(UNIX_LINES);
                break;
            case 'u':
                turnOn(UNICODE_CASE);
                break;
            case 'c':
                turnOn(CANON_EQ);
                break;
            case 'x':
                turnOn(COMMENTS);
                break;
            case 'U':
                turnOn(UNICODE_CHARACTER_CLASS | UNICODE_CASE);
                break;
            default:
                turnedOn = FALSE;
        }

        return turnedOn;
    }

    /**
     * Indicates whether a particular flag is off.
     *
     * @param flag the flag
     *
     * @return true if flag is off
     */
    public boolean isOff(final int flag) {
        return (flags & flag) == 0;
    }

    /**
     * Indicates whether a particular flag is on.
     *
     * @param flag the flag
     *
     * @return true if flag is on
     */
    public boolean isOn(final int flag) {
        return !isOff(flag);
    }

    /**
     * Turn off a flag.
     *
     * @param flag the flag
     */
    public void turnOff(final int flag) {
        flags &= ~flag;
    }

    /**
     * Turn on a flag.
     *
     * @param flag the flag
     */
    public void turnOn(final int flag) {
        flags |= flag;
    }
}
