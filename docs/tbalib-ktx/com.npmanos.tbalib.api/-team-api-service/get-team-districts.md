[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeamDistricts](./get-team-districts.md)

# getTeamDistricts

`@GET("/team/{team_key}/districts") abstract fun getTeamDistricts(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`DistrictList`](../../com.npmanos.tbalib.model/-district-list/index.md)`>>`

Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

