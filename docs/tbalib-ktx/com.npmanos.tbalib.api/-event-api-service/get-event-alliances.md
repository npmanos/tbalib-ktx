[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [EventApiService](index.md) / [getEventAlliances](./get-event-alliances.md)

# getEventAlliances

`@GET("/event/{event_key}/alliances") abstract fun getEventAlliances(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EliminationAlliance`](../../com.npmanos.tbalib.model/-elimination-alliance/index.md)`>>`

Gets a list of Elimination Alliances for the given Event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

