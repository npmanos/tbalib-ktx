[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [DistrictApiService](index.md) / [getDistrictEvents](./get-district-events.md)

# getDistrictEvents

`@GET("/district/{district_key}/events") abstract fun getDistrictEvents(@Path("district_key") districtKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Event`](../../com.npmanos.tbalib.model/-event/index.md)`>>`

Gets a list of events in the given district.

### Parameters

`districtKey` - TBA District Key, eg `2016fim`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

