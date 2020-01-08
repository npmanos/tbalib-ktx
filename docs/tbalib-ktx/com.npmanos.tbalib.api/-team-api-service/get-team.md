[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeam](./get-team.md)

# getTeam

`@GET("/team/{team_key}") abstract fun getTeam(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`Team`](../../com.npmanos.tbalib.model/-team/index.md)`>`

Gets a `Team` object for the team referenced by the given key.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response

