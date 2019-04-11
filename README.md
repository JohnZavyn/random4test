# random4test
Easily provide random numbers, strings, and collections to JUnit tests

Add to Maven projects with:
```xml
<dependency>
    <groupId>com.threeleaf</groupId>
    <artifactId>random4test</artifactId>
    <version>1.1.0</version>
</dependency>
```
For more dependency options: <https://mvnrepository.com/artifact/com.threeleaf/random4test>

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

