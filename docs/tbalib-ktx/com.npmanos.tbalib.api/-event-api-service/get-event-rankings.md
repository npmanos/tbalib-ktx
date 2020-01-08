[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [EventApiService](index.md) / [getEventRankings](./get-event-rankings.md)

# getEventRankings

`@GET("/event/{event_key}/rankings") abstract fun getEventRankings(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`EventRanking`](../../com.npmanos.tbalib.model/-event-ranking/index.md)`>`

Gets a list of team rankings for the Event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response

