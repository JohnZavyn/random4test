# random4test
Easily provide random numbers, strings, and collections to JUnit tests

Add to Maven projects with:
```xml
<dependency>
    <groupId>com.threeleaf</groupId>
    <artifactId>random4test</artifactId>
    <version>1.0.6-SNAPSHOT</version>
</dependency>
```
For more dependency options: https://mvnrepository.com/artifact/com.threeleaf/random4test

```java
/** Test {@link MyResource#update(int, int, String, String, TreeSet)}. */
@Test
public void update()
{
    final MyUploadResponse myUploadResponse = mock(MyUploadResponse.class);
    when(myService.update(INTEGER, INTEGER_SMALL, CHAR_05, CHAR_08, null)).thenReturn(myUploadResponse);
    final ResponseEntity<MyUploadResponse> response = myResource.update(INTEGER, INTEGER_SMALL, CHAR_05, CHAR_08, null);
    assertEquals(OK, response.getStatusCode());
    assertEquals(myUploadResponse, response.getBody());
}
```

