# random4test

Easily provide random numbers, strings, and collections to JUnit tests.

[![Build Status](https://travis-ci.org/JohnZavyn/random4test.svg)](https://travis-ci.org/JohnZavyn/random4test)
&nbsp;
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.threeleaf/random4test/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.threeleaf/random4test)
&nbsp;
[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-brightgreen.svg)](https://www.gnu.org/licenses/gpl-3.0)
&nbsp;
[![JavaDoc](https://javadoc.io/badge2/com.threeleaf/random4test/javadoc.svg)](https://javadoc.io/doc/com.threeleaf/random4test)

## Maven dependency

Add to Maven projects with:

```xml

<dependency>
    <groupId>com.threeleaf</groupId>
    <artifactId>random4test</artifactId>
    <version>5.1.2</version>
</dependency>
```

For more dependency options: <https://mvnrepository.com/artifact/com.threeleaf/random4test>

## Example usage

[//]: # (@formatter:off)
```java
/** Test {@link MyResource#update(int, int, String, String, TreeSet)}. */
@Test
public void update()
{
    final MyUploadResponse myUploadResponse=mock(MyUploadResponse.class);
    final TreeSet<String> params=randomTreeSetOf(String.class);
    
    when(myService.update(INTEGER,INT_SMALL,STRING_05,STRING_08,params)).thenReturn(myUploadResponse);
    
    final ResponseEntity<MyUploadResponse> response=myResource.update(INTEGER,INT_SMALL,STRING_05,STRING_08,params);
    
    assertEquals(OK,response.getStatusCode());
    assertEquals(myUploadResponse,response.getBody());
}
```
[//]: # (@formatter:on)

## Object types available in this library for randomization

Randomization classes and libraries are available out of the box for all the Java primitives, many
basic Java Object types,
and a few extras:

### Random numbers

| Test Class            | Types included            |
| ---                   | ---                       |
| TestBigDecimal        | java.math.BigDecimal      |
| TestBigInteger        | java.math.BigInteger      |
| TestByte              | byte, java.lang.Byte      |
| TestCharacter         | char, java.lang.Character |
| TestDouble            | double, java.lang.Double  |
| TestFloat             | float, java.lang.Float    |
| TestInteger           | int, java.lang.Integer    |
| TestLong              | long, java.lang.Long      |
| TestShort             | short, java.lang.Short    |

* Have static constants for values 0-100 (ranges vary) to avoid "magic number" warnings
* Have random positive and negative static methods
* Have random percentage static method

### Random dates

| Test Class             | Types included              |
| ---                    | ---                         |
| TestDate               | java.util.Date              |
| TestJodaLocalDate      | org.joda.time.LocalDate     |
| TestJodaLocalDateTime  | org.joda.time.LocalDateTime |
| TestLocalDate          | java.time.LocalDate         |
| TestLocalDateTime      | java.time.LocalDateTime     |

* have static constants for with names like `TODAY`, `YESTERDAY`, `TOMORROW`, `NEXT_WEEK`
  , `NEXT_YEAR`, etc.
* Have static methods for random future, past, and between last year and next year
* Have static methods for choosing a random date between two specified dates

### Random objects

| Test Class   | Types included             |
|:-------------|:---------------------------|
| TestBoolean  | boolean, java.lang.Boolean |
| TestDomain   | java.lang.String           |
| TestEmail    | java.lang.String           |
| TestIp       | java.lang.String           |
| TestObject   | java.lang.Object           |
| TestPassword | java.lang.String           |
| TestString   | java.lang.String           |
| TestUrl      | java.lang.String           |

* Various constants based on the type of object to be randomized
* Strings of various lengths and formats are available

### Random Regular Expressions

TestRegEx gives you the ability to pass in regular expressions to use as a template for
generating random strings.

For example, if you need to generate random strings that match password complexity requirements:

[//]: # (@formatter:off)
```java
/** Test {@link RegExGenerator#random()} for complex expressions. */
@Test
void password(){
    /* If you have developed a password complexity regular expression like the following,
     * it might be tedious to generate one or many of them for your tests. */
    final String passwordRegEx="(?=(.*[0-9]))(?=.*[\\!@#$%^&*()\\[\\]{}\\-_+=~`|:;\"'<>,.\\/?])(?=.*[a-z])(?=(.*[A-Z]))(?=(.*)).{8,}";
    final RegExGenerator passwordGenerator=new RegExGenerator(passwordRegEx);
    final String password=passwordGenerator.random();
    /* Note that a generator can be instantiated once and used many times. */
    final String password2=passwordGenerator.random();

    assertNotEquals(password,password2);
}
```
[//]: # (@formatter:on)

See [Java 8 Covered Expression Constructs](docs/regex.md) for specific pattern support limitations.

## Extend and make your own

The library is extendable, so you can create your own randomization classes
with your own POJO objects by extending the `AbstractTest` or `TestGeneric` classes.
You can see how this is done in any of the Test classes above, or use the
following sample as a template:

```java
public class TestObject extends AbstractTest<Object> {

    /** The instance of {@link TestObject}. */
    public static final TestObject INSTANCE = new TestObject();

    /* Make any additional static constants you like... */

    /** A random {@link Object}. */
    public static final Object OBJECT = TestRandom.random(Object.class);

    /** Instantiate a utility to produce randomized {@link Object} objects. */
    public TestObject() {
        super(Object.class);
    }

    /* Add any specialized methods used for creating this object
     * or any collection you desire: */

    /**
     * Get a random {@link Object}.
     *
     * @return an object
     */
    public static Object randomObject() {
        return INSTANCE.random();
    }
}
```

This will give you access to the rich set of methods available in `AbstractTest`:

* random instances (including the ability to limit randomization to specific fields)
* random arrays, collections, lists, sets, and more.

# Utilities

In addition to the constants and randomizers available from the Test classes above,
there are also a number of helpful utilities available through the following:

| Test Class         | General functional purpose                          |
|:-------------------|:----------------------------------------------------|
| TestAddressUtil    | random US states, cities, zips, and mock addresses  |
| TestArrayUtil      | random arrays (see below)                           |
| TestCharacterUtil  | character helper methods                            |
| TestCollectionUtil | random collections (see below)                      |
| TestDateUtil       | conversions between Java Date and LocalDate         |
| TestEnumUtil       | chooseOneFrom                                       |
| TestInternetUtil   | random e-mail, URL, and IP addresses                |
| TestListUtil       | random Lists of various types (see below)           |
| TestLoremIpsumUtil | random greeking sentence and paragraph generator    |
| TestMapUtil        | random Maps of various types (see below)            |
| TestNameUtil       | random English/US male and female names             |
| TestSetUtil        | random sets of various types (see below)            |
| TestStringUtil     | several string methods                              |
| TestWordUtil       | random words (nouns, verbs, adjectives, and colors) |

Array, Collection, and Map utilities include

* randomXxxOf, randomXxxSingleOf, chooseOneFrom static methods, so you can generate simple
  collections on the fly.
