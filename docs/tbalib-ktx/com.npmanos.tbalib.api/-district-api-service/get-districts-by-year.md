[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [DistrictApiService](index.md) / [getDistrictsByYear](./get-districts-by-year.md)

# getDistrictsByYear

`@GET("/districts/{year}") abstract fun getDistrictsByYear(@Path("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`DistrictList`](../../com.npmanos.tbalib.model/-district-list/index.md)`>>`

Gets a list of districts and their corresponding district key, for the given year.

### Parameters

`year` - Competition Year (or Season). Must be 4 digits.

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

