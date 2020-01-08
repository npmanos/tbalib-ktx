[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [MatchApiService](index.md) / [getMatchSimple](./get-match-simple.md)

# getMatchSimple

`@GET("/match/{match_key}/simple") abstract fun getMatchSimple(@Path("match_key") matchKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`MatchSimple`](../../com.npmanos.tbalib.model/-match-simple/index.md)`>`

Gets a short-form `Match` object for the given match key.

### Parameters

`matchKey` - TBA Match Key, eg `2016nytr_qm1`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response

