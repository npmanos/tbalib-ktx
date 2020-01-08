[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeamEventsByYearSimple](./get-team-events-by-year-simple.md)

# getTeamEventsByYearSimple

`@GET("/team/{team_key}/events/{year}/simple") abstract fun getTeamEventsByYearSimple(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventSimple`](../../com.npmanos.tbalib.model/-event-simple/index.md)`>>`

Gets a short-form list of events this team has competed at in the given year.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`year` - Competition Year (or Season). Must be 4 digits.

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

