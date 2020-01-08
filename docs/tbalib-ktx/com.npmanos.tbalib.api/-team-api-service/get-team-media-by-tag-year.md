[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeamMediaByTagYear](./get-team-media-by-tag-year.md)

# getTeamMediaByTagYear

`@GET("/team/{team_key}/media/tag/{media_tag}/{year}") abstract fun getTeamMediaByTagYear(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("media_tag") mediaTag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Media`](../../com.npmanos.tbalib.model/-media/index.md)`>>`

Gets a list of Media (videos / pictures) for the given team, tag and year.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`mediaTag` - Media Tag which describes the Media.

`year` - Competition Year (or Season). Must be 4 digits.

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

