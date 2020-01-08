[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeamsByYear](./get-teams-by-year.md)

# getTeamsByYear

`@GET("/teams/{year}/{page_num}") abstract fun getTeamsByYear(@Path("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Path("page_num") pageNum: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Team`](../../com.npmanos.tbalib.model/-team/index.md)`>>`

Gets a list of `Team` objects that competed in the given year, paginated in groups of 500.

### Parameters

`year` - Competition Year (or Season). Must be 4 digits.

`pageNum` - Page number of results to return, zero-indexed

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

