[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeamEventStatus](./get-team-event-status.md)

# getTeamEventStatus

`@GET("/team/{team_key}/event/{event_key}/status") abstract fun getTeamEventStatus(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`TeamEventStatus`](../../com.npmanos.tbalib.model/-team-event-status/index.md)`>`

Gets the competition rank and status of the team at the given event.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response

