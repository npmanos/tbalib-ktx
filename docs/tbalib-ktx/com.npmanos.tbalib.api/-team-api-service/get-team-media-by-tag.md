[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.api](../index.md) / [TeamApiService](index.md) / [getTeamMediaByTag](./get-team-media-by-tag.md)

# getTeamMediaByTag

`@GET("/team/{team_key}/media/tag/{media_tag}") abstract fun getTeamMediaByTag(@Path("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Path("media_tag") mediaTag: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Header("If-Modified-Since") ifModifiedSince: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null): Response<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Media`](../../com.npmanos.tbalib.model/-media/index.md)`>>`

Gets a list of Media (videos / pictures) for the given team and tag.

### Parameters

`teamKey` - TBA Team Key, eg `frc254`

`mediaTag` - Media Tag which describes the Media.

`ifModifiedSince` - Value of the `Last-Modified` header in the most recently cached response by the client.

**Return**
Response&lt;kotlin.collections.List&gt;

