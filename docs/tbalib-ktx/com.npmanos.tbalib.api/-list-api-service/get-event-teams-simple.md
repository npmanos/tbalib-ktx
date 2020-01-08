[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [ListApiService](index.md) / [getEventTeamsSimple](./get-event-teams-simple.md)

# getEventTeamsSimple

`@GET("/event/{event_key}/teams/simple") abstract fun getEventTeamsSimple(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TeamSimple`](../../com.npmanos.tbalib.model/-team-simple/index.md)`>>`

Gets a short-form list of `Team` objects that competed in the given event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

