[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [ListApiService](index.md) / [getEventTeams](./get-event-teams.md)

# getEventTeams

`@GET("/event/{event_key}/teams") abstract fun getEventTeams(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Team`](../../com.npmanos.tbalib.model/-team/index.md)`>>`

Gets a list of `Team` objects that competed in the given event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

