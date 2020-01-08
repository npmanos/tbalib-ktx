[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [EventApiService](index.md) / [getEventAwards](./get-event-awards.md)

# getEventAwards

`@GET("/event/{event_key}/awards") abstract fun getEventAwards(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Award`](../../com.npmanos.tbalib.model/-award/index.md)`>>`

Gets a list of awards from the given event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

