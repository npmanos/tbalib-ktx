[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [MatchApiService](index.md) / [getMatch](./get-match.md)

# getMatch

`@GET("/match/{match_key}") abstract fun getMatch(@Path("match_key") matchKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`Match`](../../com.npmanos.tbalib.model/-match/index.md)`>`

Gets a `Match` object for the given match key.

### Parameters

`matchKey` - TBA Match Key, eg `2016nytr_qm1`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response

