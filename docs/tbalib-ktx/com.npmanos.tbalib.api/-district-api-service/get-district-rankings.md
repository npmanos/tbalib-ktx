[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [DistrictApiService](index.md) / [getDistrictRankings](./get-district-rankings.md)

# getDistrictRankings

`@GET("/district/{district_key}/rankings") abstract fun getDistrictRankings(@Path("district_key") districtKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`DistrictRanking`](../../com.npmanos.tbalib.model/-district-ranking/index.md)`>>`

Gets a list of team district rankings for the given district.

### Parameters

`districtKey` - TBA District Key, eg `2016fim`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

