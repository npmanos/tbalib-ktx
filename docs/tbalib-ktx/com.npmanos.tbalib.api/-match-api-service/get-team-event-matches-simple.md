[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [MatchApiService](index.md) / [getTeamEventMatchesSimple](./get-team-event-matches-simple.md)

# getTeamEventMatchesSimple

`@GET("/team/{team_key}/event/{event_key}/matches/simple") abstract fun getTeamEventMatchesSimple(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Match`](../../com.npmanos.tbalib.model/-match/index.md)`>>`

Gets a short-form list of matches for the given team and event.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

