# random4test
Easily provide random numbers, strings, and collections to JUnit tests

```
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
