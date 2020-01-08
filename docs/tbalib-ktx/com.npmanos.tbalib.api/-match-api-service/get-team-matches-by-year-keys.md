[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [MatchApiService](index.md) / [getTeamMatchesByYearKeys](./get-team-matches-by-year-keys.md)

# getTeamMatchesByYearKeys

`@GET("/team/{team_key}/matches/{year}/keys") abstract fun getTeamMatchesByYearKeys(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>`

Gets a list of match keys for matches for the given team and year.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`year` - Competition Year (or Season). Must be 4 digits.

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&lt;kotlin.String&gt;&gt;

