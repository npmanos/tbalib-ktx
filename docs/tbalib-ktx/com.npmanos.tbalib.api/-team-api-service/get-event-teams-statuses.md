[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getEventTeamsStatuses](./get-event-teams-statuses.md)

# getEventTeamsStatuses

`@GET("/event/{event_key}/teams/statuses") abstract fun getEventTeamsStatuses(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`TeamEventStatus`](../../com.npmanos.tbalib.model/-team-event-status/index.md)`>>`

Gets a key-value list of the event statuses for teams competing at the given event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.Map&lt;kotlin.String, TeamEventStatus&gt;&gt;

