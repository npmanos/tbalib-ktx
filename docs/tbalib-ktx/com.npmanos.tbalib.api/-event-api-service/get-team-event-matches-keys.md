[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [EventApiService](index.md) / [getTeamEventMatchesKeys](./get-team-event-matches-keys.md)

# getTeamEventMatchesKeys

`@GET("/team/{team_key}/event/{event_key}/matches/keys") abstract fun getTeamEventMatchesKeys(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>`

Gets a list of match keys for matches for the given team and event.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&lt;kotlin.String&gt;&gt;

