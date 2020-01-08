[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [MatchApiService](index.md) / [getEventMatches](./get-event-matches.md)

# getEventMatches

`@GET("/event/{event_key}/matches") abstract fun getEventMatches(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Match`](../../com.npmanos.tbalib.model/-match/index.md)`>>`

Gets a list of matches for the given event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

