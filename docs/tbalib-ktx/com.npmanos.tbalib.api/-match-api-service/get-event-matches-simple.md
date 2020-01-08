[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [MatchApiService](index.md) / [getEventMatchesSimple](./get-event-matches-simple.md)

# getEventMatchesSimple

`@GET("/event/{event_key}/matches/simple") abstract fun getEventMatchesSimple(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MatchSimple`](../../com.npmanos.tbalib.model/-match-simple/index.md)`>>`

Gets a short-form list of matches for the given event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

