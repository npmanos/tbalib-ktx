[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getDistrictTeamsSimple](./get-district-teams-simple.md)

# getDistrictTeamsSimple

`@GET("/district/{district_key}/teams/simple") abstract fun getDistrictTeamsSimple(@Path("district_key") districtKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`TeamSimple`](../../com.npmanos.tbalib.model/-team-simple/index.md)`>>`

Gets a short-form list of `Team` objects that competed in events in the given district.

### Parameters

`districtKey` - TBA District Key, eg `2016fim`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

