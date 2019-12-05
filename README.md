# random4test
Easily provide random numbers, strings, and collections to JUnit tests

## Maven dependency
Add to Maven projects with:
```xml
<dependency>
    <groupId>com.threeleaf</groupId>
    <artifactId>random4test</artifactId>
    <version>3.0.1-SNAPSHOT</version>
</dependency>
```
For more dependency options: <https://mvnrepository.com/artifact/com.threeleaf/random4test>

## Example usage
```java
/** Test {@link MyResource#update(int, int, String, String, TreeSet)}. */
@Test
public void update()
{
    final MyUploadResponse myUploadResponse = mock(MyUploadResponse.class);
    final TreeSet<String> params = randomTreeSetOf(String.class);
    when(myService.update(INTEGER, INT_SMALL, STRING_05, STRING_08, params)).thenReturn(myUploadResponse);
    final ResponseEntity<MyUploadResponse> response = myResource.update(INTEGER, INT_SMALL, STRING_05, STRING_08, params);
    assertEquals(OK, response.getStatusCode());
    assertEquals(myUploadResponse, response.getBody());
}
```

## Object types available in this library for randomization
Randomization classes and libraries are available out of the box for all the Java primitives, many basic Java Object types,
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

* have static constants for with names like `TODAY`, `YESTERDAY`, `TOMORROW`, `NEXT_WEEK`, `NEXT_YEAR`, etc.
* Have static methods for random future, past, and between last year and next year
* Have static methods for choosing a random date between two given dates

### Random objects

| Test Class             | Types included             |
| ---                    | ---                        |
| TestBoolean            | boolean, java.lang.Boolean |
| TestObject             | java.lang.Object           |
| TestString             | java.lang.String           |

* Various constants based on the type of object being randomized
* Strings of various lengths and formats are available

## Extend and make your own

The library is extendable, so you can create your own randomization classes
with your own POJO objects by extending the `AbstractTest` or `TestGeneric` classes.
You can see how this is done in any of the Test classes above, or use the
following sample as a template:

```java
public class TestObject extends AbstractTest<Object>
{

    /** The instance of {@link TestObject}. */
    public static final TestObject INSTANCE = new TestObject();

    /* Make any additional static constants you like... */

    /** A random {@link Object}. */
    public static final Object OBJECT = TestRandom.random(Object.class);

    /** Instantiate a utility to produce randomized {@link Object} objects. */
    public TestObject()
    {
        super(Object.class);
    }

    /* Add any specialized methods used for creating this object
     * or any collection you desire: */

    /**
     * Get a random {@link Object}.
     *
     * @return an object
     */
    public static Object randomObject()
    {
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


| Test Class             | General functional purpose                          |
| ---                    | ---                                                 |
| TestAddressUtil        | random US states, cities, zips, and mock addresses  |
| TestArrayUtil          | random arrays (see below)                           |
| TestCollectionUtil     | random collections (see below)                      |
| TestDateUtil           | conversions between Java Date and LocalDate         |
| TestEnumUtil           | chooseOneFrom                                       |
| TestListUtil           | random Lists of various types (see below)           |
| TestLoremIpsumUtil     | random greeking sentence and paragraph generator    |
| TestMapUtil            | random Maps of various types (see below)            |
| TestNameUtil           | random English/US male and female names             |
| TestSetUtil            | random sets of various types (see below)            |
| TestStringUtil         | several string methods                              |
| TestWordUtil           | random words (nouns, verbs, adjectives, and colors) |


Array, Collection, and Map utilities include
* randomXxxOf, randomXxxSingleOf, chooseOneFrom static methods, so you
can generate simple collections on the fly

