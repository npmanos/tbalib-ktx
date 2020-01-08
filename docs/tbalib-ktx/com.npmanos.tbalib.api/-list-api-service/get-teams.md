[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [ListApiService](index.md) / [getTeams](./get-teams.md)

# getTeams

`@GET("/teams/{page_num}") abstract fun getTeams(@Path("page_num") pageNum: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Team`](../../com.npmanos.tbalib.model/-team/index.md)`>>`

Gets a list of `Team` objects, paginated in groups of 500.

### Parameters

`pageNum` - Page number of results to return, zero-indexed

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

