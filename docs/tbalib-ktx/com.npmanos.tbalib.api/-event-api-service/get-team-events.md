[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [EventApiService](index.md) / [getTeamEvents](./get-team-events.md)

# getTeamEvents

`@GET("/team/{team_key}/events") abstract fun getTeamEvents(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Event`](../../com.npmanos.tbalib.model/-event/index.md)`>>`

Gets a list of all events this team has competed at.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

