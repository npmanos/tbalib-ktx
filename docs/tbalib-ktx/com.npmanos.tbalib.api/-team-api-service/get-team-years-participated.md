[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeamYearsParticipated](./get-team-years-participated.md)

# getTeamYearsParticipated

`@GET("/team/{team_key}/years_participated") abstract fun getTeamYearsParticipated(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>`

Gets a list of years in which the team participated in at least one competition.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&lt;kotlin.Int&gt;&gt;

