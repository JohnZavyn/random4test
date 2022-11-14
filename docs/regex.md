# Reverse RegEx

## Java 8 Covered Expression Constructs

See [Class Pattern JavaDoc](https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html)

| Support            | Meaning              |
|:-------------------|:---------------------|
| :heavy_check_mark: | Tested and supported |
| :x:                | Unsupported          |
| :interrobang:      | Partial Support      |
| :question:         | Untested or unknown  |

### Single Characters

| Support            | Construct   | Generates                                                                                                              | Examples                                       | Notes |
|:-------------------|:------------|:-----------------------------------------------------------------------------------------------------------------------|:-----------------------------------------------|:------|
| :heavy_check_mark: | `x`         | The character 'x'                                                                                                      | `a`, `\u2700`                                  |       |
| :heavy_check_mark: | `\\`        | The backslash character                                                                                                | `\\`                                           |       |
| :heavy_check_mark: | `\0n`       | The character with octal value 0n (0 <= n <= 7)                                                                        | `\07`                                          |       |
| :heavy_check_mark: | `\0nn`      | The character with octal value 0nn (0 <= n <= 7)                                                                       | `\077`                                         |       |
| :heavy_check_mark: | `\0mnn`     | The character with octal value 0mnn (0 <= m <= 3, 0 <= n <= 7)                                                         | `\0277`                                        |       |
| :heavy_check_mark: | `\xhh`      | The character with hexadecimal value 0xhh                                                                              | `\x00`, `\xFF`                                 |       |
| :heavy_check_mark: | `\uhhhh`    | The character with hexadecimal value 0xhhhh                                                                            | `\u0000`, `\uFFFF`                             |       |
| :heavy_check_mark: | `\x{h...h}` | The character with hexadecimal value 0xh...h <br />(Character.MIN_CODE_POINT  <= 0xh...h <=  Character.MAX_CODE_POINT) | `\x{0}`, `\x{9999}`, `\x{10000}`, `\x{10FFFF}` |       |
| :heavy_check_mark: | `\t`        | The tab character ('\u0009')                                                                                           | `\t`                                           |       |
| :heavy_check_mark: | `\n`        | The newline (line feed) character ('\u000A')                                                                           | `\n`                                           |       |
| :heavy_check_mark: | `\r`        | The carriage-return character ('\u000D')                                                                               | `\r`                                           |       |
| :heavy_check_mark: | `\f`        | The form-feed character ('\u000C')                                                                                     | `\f`                                           |       |
| :heavy_check_mark: | `\a`        | The alert (bell) character ('\u0007')                                                                                  | `\a`                                           |       |
| :heavy_check_mark: | `\e`        | The escape character ('\u001B')                                                                                        | `\e`                                           |       |
| :heavy_check_mark: | `\cx`       | The control character corresponding to x                                                                               | `\ca`, `\cA`, `\cZ`                             |       |

### Character classes

| Support            | Construct       | Generates                                                  | Examples                                      | Notes                                                         |
|:-------------------|:----------------|:-----------------------------------------------------------|:----------------------------------------------|:--------------------------------------------------------------|
| :heavy_check_mark: | `[abc]`         | a, b, or c (simple class)                                  | `[jamÿµIiSsKkÅå\xFE]`, `(?iu)[JAMÿµISKÅ\xFE]` |                                                               |
| :heavy_check_mark: | `[^abc]`        | Any character except a, b, or c (negation)                 | `[^jamÿµIiSsKkÅå\xFE]`                        |                                                               |
| :heavy_check_mark: | `[a-zA-Z]`      | a through z or A through Z, inclusive (range)              | `[a-zA-Z]`                                    |                                                               |
| :heavy_check_mark: | `[a-d[m-p]]`    | a through d, or m through p: `[a-dm-p]` (union)            | `[a-d[m-p]]`                                  |                                                               |
| :heavy_check_mark: | `[a-z&&[def]]`  | d, e, or f (intersection)                                  | `[a-e&&[jam]]`                                | Throws IllegalArgumentException when intersection is empty    |
| :interrobang:      | `[a-z&&[d-f]]`  | d, e, or f (intersection)                                  | `[a-e&&[d-z]]`                                | Due to optimizations, more likely to fail if range is Unicode |
| :heavy_check_mark: | `[a-z&&[^bc]]`  | a through z, except for b and c: `[ad-z]` (subtraction)    | `[a-z&&[^bc]]`                                |                                                               |
| :interrobang:      | `[a-z&&[^m-p]]` | a through z, and not m through p: `[a-lq-z]` (subtraction) | `[a-q&&[^c-p]]`                               | Due to optimizations, more likely to fail if range is Unicode |

### Predefined character classes

| Support            | Construct | Generates                                                                                 | Examples                     | Notes                                    |
|:-------------------|:----------|:------------------------------------------------------------------------------------------|:-----------------------------|:-----------------------------------------|
| :heavy_check_mark: | `.`       | Any character (may or may not match line terminators)                                     | `.`, `......`, `(?s)dot.all` |                                          |
| :interrobang:      | `(?d).`   | Any character (and Unix line terminators)                                                 | `(?d)..+`                    | Unreliable when a line feed is generated |
| :heavy_check_mark: | `\d`      | A digit: `[0-9]`                                                                          | `\d`                         |                                          |
| :heavy_check_mark: | `\D`      | A non-digit: `[^0-9]`                                                                     | `\D`                         |                                          |
| :heavy_check_mark: | `\h`      | A horizontal whitespace character: `[ \t\xA0\u1680\u180e\u2000-\u200a\u202f\u205f\u3000]` | `\h`                         |                                          |
| :heavy_check_mark: | `\H`      | A non-horizontal whitespace character: `[^\h]`                                            | `\H`                         |                                          |
| :heavy_check_mark: | `\s`      | A whitespace character: `[ \t\n\x0B\f\r]`                                                 | `\s`                         |                                          |
| :heavy_check_mark: | `\S`      | A non-whitespace character: `[^\s]`                                                       | `\S`                         |                                          |
| :heavy_check_mark: | `\v`      | A vertical whitespace character: `[\n\x0B\f\r\x85\u2028\u2029]`                           | `\v`                         |                                          |
| :heavy_check_mark: | `\V`      | A non-vertical whitespace character: `[^\v]`                                              | `\V`                         |                                          |
| :heavy_check_mark: | `\w`      | A word character: `[a-zA-Z_0-9]`                                                          | `\w`                         |                                          |
| :heavy_check_mark: | `\W`      | A non-word character: `[^\w]`                                                             | `\W`                         |                                          |

### POSIX character classes (US-ASCII only)

| Support            | Construct    | Generates                                                | Examples     | Notes |
|:-------------------|:-------------|:---------------------------------------------------------|:-------------|:------|
| :heavy_check_mark: | `\p{Lower}`  | A lower-case alphabetic character: `[a-z]`               | `\p{Lower}`  |       |
| :heavy_check_mark: | `\p{Upper}`  | An upper-case alphabetic character: `[A-Z]`              | `\p{Upper}`  |       |
| :heavy_check_mark: | `\p{ASCII}`  | All ASCII: `[\x00-\x7F]`                                 | `\p{ASCII}`  |       |
| :heavy_check_mark: | `\p{Alpha}`  | An alphabetic character: `[\p{Lower}\p{Upper}]`          | `\p{Alpha}`  |       |
| :heavy_check_mark: | `\p{Digit}`  | A decimal digit: `[0-9]`                                 | `\p{Digit}`  |       |
| :heavy_check_mark: | `\p{Alnum}`  | An alphanumeric character: `[\p{Alpha}\p{Digit}]`        | `\p{Alnum}`  |       |
| :heavy_check_mark: | `\p{Punct}`  | Punctuation: One of ``!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~`` | `\p{Punct}`  |       |
| :heavy_check_mark: | `\p{Graph}`  | A visible character: `[\p{Alnum}\p{Punct}]`              | `\p{Graph}`  |       |
| :heavy_check_mark: | `\p{Print}`  | A printable character: `[\p{Graph}\x20]`                 | `\p{Print}`  |       |
| :heavy_check_mark: | `\p{Blank}`  | A space or a tab: `[ \t]`                                | `\p{Blank}`  |       |
| :heavy_check_mark: | `\p{Cntrl}`  | A control character: `[\x00-\x1F\x7F]`                   | `\p{Cntrl}`  |       |
| :heavy_check_mark: | `\p{XDigit}` | A hexadecimal digit: `[0-9a-fA-F]`                       | `\p{XDigit}` |       |
| :heavy_check_mark: | `\p{Space}`  | A whitespace character: `[ \t\n\x0B\f\r]`                | `\p{Space}`  |       |

### java.lang.Character classes (simple java character type)

| Support       | Construct            | Generates                                        | Examples             | Notes                                                                               |
|:--------------|:---------------------|:-------------------------------------------------|:---------------------|:------------------------------------------------------------------------------------|
| :interrobang: | `\p{javaLowerCase}`  | Equivalent to java.lang.Character.isLowerCase()  | `\p{javaLowerCase}`  | Fails occasionally when RegEx character sets are out of sync with Java's Characters |
| :interrobang: | `\p{javaUpperCase}`  | Equivalent to java.lang.Character.isUpperCase()  | `\p{javaUpperCase}`  | Fails occasionally when RegEx character sets are out of sync with Java's Characters |
| :interrobang: | `\p{javaWhitespace}` | Equivalent to java.lang.Character.isWhitespace() | `\p{javaWhitespace}` | Fails occasionally when RegEx character sets are out of sync with Java's Characters |
| :x:           | `\p{javaMirrored}`   | Equivalent to java.lang.Character.isMirrored()   | `\p{javaMirrored}`   | This and others may be addressed in a future release                                |

### Classes for Unicode scripts, blocks, categories and binary properties

| Support            | Construct            | Generates                                              | Examples                         | Notes                                                                               |
|:-------------------|:---------------------|:-------------------------------------------------------|:---------------------------------|:------------------------------------------------------------------------------------|
| :interrobang:      | `\p{IsLatin}`        | A Latin script character (script)                      | `\p{IsLatin}\p{IsBRAI}`          | Fails occasionally when RegEx character sets are out of sync with Java's Characters |
| :heavy_check_mark: | `\p{InGreek}`        | A character in the Greek block (block)                 | `\p{InHangulJamo}`               |                                                                                     |
| :interrobang:      | `\p{Lu}`             | An uppercase letter (category)                         | `\p{L}`                          | Fails occasionally when RegEx character sets are out of sync with Java's Characters |
| :heavy_check_mark: | `\p{IsAlphabetic}`   | An alphabetic character (binary property)              | `\{IsIdeographic}\p{IsHexDigit}` |                                                                                     |
| :interrobang:      | `\p{Sc}`             | A currency symbol                                      | `\p{Sc}`                         | Fails occasionally when RegEx character sets are out of sync with Java's Characters |
| :heavy_check_mark: | `\P{InGreek}`        | Any character except one in the Greek block (negation) | `\P{InSmallFormVariants}`        |                                                                                     |
| :interrobang:      | `[\p{L}&&[^\p{Lu}]]` | Any letter except an uppercase letter (subtraction)    | `[\p{L}&&[^\p{Lu}]]`             | Named category sometimes fails, but the intersection more likely to work            |

### Boundary matchers

| Support            | Construct | Generates                                                 | Examples             | Notes                                                                                       |
|:-------------------|:----------|:----------------------------------------------------------|:---------------------|:--------------------------------------------------------------------------------------------|
| :heavy_check_mark: | `^`       | The beginning of a line                                   | `^.+`                |                                                                                             |
| :heavy_check_mark: | `$`       | The end of a line                                         | `\p{IsPunctuation}$` |                                                                                             |
| :interrobang:      | `\b`      | A word boundary                                           | `\bJohn\b `          | Only works at beginning and/or end of an expression                                         |
| :interrobang:      | `\B`      | A non-word boundary                                       | `\BMarsh\B`          | Works reliably at beginning and/or end of an expression, but will rarely work in the middle |
| :heavy_check_mark: | `\A`      | The beginning of the input                                | `\A\p{IsLisu}`       |                                                                                             |
| :heavy_check_mark: | `\G`      | The end of the previous match                             | `\Gdog`              | Matches values, but I have not found good documentation on how this actually works          |
| :heavy_check_mark: | `\Z`      | The end of the input but for the final terminator, if any | `\p{IsBraille}\Z`    |                                                                                             |
| :heavy_check_mark: | `\z`      | The end of the input                                      | `a\z`                |                                                                                             |

### Linebreak matcher

| Support            | Construct | Generates                                                                                                          | Examples   | Notes |
|:-------------------|:----------|:-------------------------------------------------------------------------------------------------------------------|:-----------|:------|
| :heavy_check_mark: | `\R`      | Any Unicode linebreak sequence, is equivalent to<br /> `\u000D\u000A|[\u000A\u000B\u000C\u000D\u0085\u2028\u2029]` | `examples` |       |

### Greedy quantifiers

| Support            | Construct | Generates                               | Examples   | Notes |
|:-------------------|:----------|:----------------------------------------|:-----------|:------|
| :heavy_check_mark: | `X?`      | X, once or not at all                   | `a?`       |       |
| :heavy_check_mark: | `X*`      | X, zero or more times                   | `b*`       |       |
| :heavy_check_mark: | `X+`      | X, one or more times                    | `c+`       |       |
| :heavy_check_mark: | `X{n}`    | X, exactly n times                      | `d{3}`     |       |
| :heavy_check_mark: | `X{n,}`   | X, at least n times                     | `e{7,}`    |       |
| :heavy_check_mark: | `X{n,m}`  | X, at least n but not more than m times | `f{11,13}` |       |

### Reluctant quantifiers

| Support            | Construct | Generates                               | Examples   | Notes |
|:-------------------|:----------|:----------------------------------------|:-----------|:------|
| :heavy_check_mark: | `X??`     | X, once or not at all                   | `a??`      |       |
| :heavy_check_mark: | `X*?`     | X, zero or more times                   | `b*?`      |       |
| :heavy_check_mark: | `X+?`     | X, one or more times                    | `c+?`      |       |
| :heavy_check_mark: | `X{n}?`   | X, exactly n times                      | `d{3}`     |       |
| :heavy_check_mark: | `X{n,}?`  | X, at least n times                     | `e{7,}`    |       |
| :heavy_check_mark: | `X{n,m}?` | X, at least n but not more than m times | `f{11,13}` |       |

### Possessive quantifiers

| Support            | Construct | Generates                               | Examples    | Notes |
|:-------------------|:----------|:----------------------------------------|:------------|:------|
| :heavy_check_mark: | `X?+`     | X, once or not at all                   | `a?+`       |       |
| :heavy_check_mark: | `X*+`     | X, zero or more times                   | `b*+`       |       |
| :heavy_check_mark: | `X++`     | X, one or more times                    | `c++`       |       |
| :heavy_check_mark: | `X{n}+`   | X, exactly n times                      | `d{3}+`     |       |
| :heavy_check_mark: | `X{n,}+`  | X, at least n times                     | `e{7,}+`    |       |
| :heavy_check_mark: | `X{n,m}+` | X, at least n but not more than m times | `f{11,13}+` |       |

### Logical operators

| Support            | Construct | Generates               | Examples | Notes |
|:-------------------|:----------|:------------------------|:---------|:------|
| :heavy_check_mark: | `XY`      | X followed by Y         | `ab`     |       |
| :heavy_check_mark: | `X|Y`     | Either X or Y           | `c|d`    |       |
| :heavy_check_mark: | `(X)`     | X, as a capturing group | `(f)`    |       |

### Back references

| Support            | Construct  | Generates                                           | Examples                                         | Notes |
|:-------------------|:-----------|:----------------------------------------------------|:-------------------------------------------------|:------|
| :heavy_check_mark: | `\n`       | Whatever the nth capturing group matched            | `(a)(b)(c)\2(d)`                                 |       |
| :heavy_check_mark: | `\k<name>` | Whatever the named-capturing group "name" matched   | `(?<one>a)(?<two>b)(?<three>c)\k<one>(?<four>d)` |       |

### Quotation

| Support            | Construct | Generates                                   | Examples             | Notes |
|:-------------------|:----------|:--------------------------------------------|:---------------------|:------|
| :heavy_check_mark: | `\`       | Nothing, but quotes the following character | `ab\(c\)d`           |       |
| :heavy_check_mark: | `\Q`      | Nothing, but quotes all characters until \E | `a+\Q(b[c]+)\E[0-9]` |       |
| :heavy_check_mark: | `\E`      | Nothing, but ends quoting started by \Q     | `a+\Q(b[c]+)\E[0-9]` |       |

### Special constructs (named-capturing and non-capturing)

| Support            | Construct            | Generates                                                             | Examples                                     | Notes                                                                                                                      |
|:-------------------|:---------------------|:----------------------------------------------------------------------|:---------------------------------------------|:---------------------------------------------------------------------------------------------------------------------------|
| :heavy_check_mark: | `(?<name>X)`         | X, as a named-capturing group                                         | `(?<MAJOR>0|[1-9]\d*)\.(?<MINOR>0|[1-9]\d*)` |                                                                                                                            |
| :heavy_check_mark: | `(?:X)`              | X, as a non-capturing group                                           | `a(?:-)z`                                    |                                                                                                                            |
| :heavy_check_mark: | `(?idmsuxU-idmsuxU)` | Nothing, but turns match flags i d m s u x U on - off                 | `(?iU)[\u1E3F-\u1E3F]`                       | Java 8 Pattern has bug that throws error for `(?-U)`                                                                       |
| :heavy_check_mark: | `(?idmsux-idmsux:X)` | X, as a non-capturing group with the given flags i d m s u x on - off | `examples`                                   |                                                                                                                            |
| :interrobang:      | `(?=X)`              | X, via zero-width positive lookahead                                  | `M(?=m)m+`                                   | Successful when the RegEx structure guarantees a match<br>`Y(?=y)` creates match, but not a find, for example              |
| :interrobang:      | `(?!X)`              | X, via zero-width negative lookahead                                  | `A(?!b)[c-f]`                                | `A(?!b).*` can fail if a dot char generates the letter b                                                                   |
| :interrobang:      | `(?<=X)`             | X, via zero-width positive lookbehind                                 | `a+(?<=a)h!`, `a(?<=a)h!`, `(?<=one)two `    | Successful when the RegEx structure guarantees a match<br>Creates match, but not a find in several circumstances           |
| :interrobang:      | `(?<!X)`             | X, via zero-width negative lookbehind                                 | `[c-f](?<!b)[a-z]`                           | Success depends on expression.<br>`[a-f](?<!b)[a-z]` will fail if the letter b is generated on the left side, for example. |
| :interrobang:      | `(?>X)`              | X, as an independent, non-capturing group                             | `a(?>bc|d)c`                                 | Success depends on expression.<br>`a(?>bc|d)c` is one that will fail frequently, for example.                              |
