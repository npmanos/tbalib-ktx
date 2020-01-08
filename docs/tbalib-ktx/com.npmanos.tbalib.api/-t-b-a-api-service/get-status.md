[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TBAApiService](index.md) / [getStatus](./get-status.md)

# getStatus

`@GET("/status") abstract fun getStatus(@Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`APIStatus`](../../com.npmanos.tbalib.model/-a-p-i-status/index.md)`>`

Returns API status, and TBA status information.

### Parameters

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response

