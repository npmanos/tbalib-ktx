[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeamEventsStatusesByYear](./get-team-events-statuses-by-year.md)

# getTeamEventsStatusesByYear

`@GET("/team/{team_key}/events/{year}/statuses") abstract fun getTeamEventsStatusesByYear(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`TeamEventStatus`](../../com.npmanos.tbalib.model/-team-event-status/index.md)`>>`

Gets a key-value list of the event statuses for events this team has competed at in the given year.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`year` - Competition Year (or Season). Must be 4 digits.

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt;&gt;

