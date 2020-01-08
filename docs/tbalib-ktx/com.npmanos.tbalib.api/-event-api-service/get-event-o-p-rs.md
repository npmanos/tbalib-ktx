[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [EventApiService](index.md) / [getEventOPRs](./get-event-o-p-rs.md)

# getEventOPRs

`@GET("/event/{event_key}/oprs") abstract fun getEventOPRs(@Path("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`EventOPRs`](../../com.npmanos.tbalib.model/-event-o-p-rs/index.md)`>`

Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.

### Parameters

`eventKey` - TBA Event Key, eg `2016nytr`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response

