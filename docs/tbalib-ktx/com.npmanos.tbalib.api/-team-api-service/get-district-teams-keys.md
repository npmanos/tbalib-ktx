[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getDistrictTeamsKeys](./get-district-teams-keys.md)

# getDistrictTeamsKeys

`@GET("/district/{district_key}/teams/keys") abstract fun getDistrictTeamsKeys(@Path("district_key") districtKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>`

Gets a list of `Team` objects that competed in events in the given district.

### Parameters

`districtKey` - TBA District Key, eg `2016fim`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&lt;kotlin.String&gt;&gt;

