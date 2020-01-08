[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Media](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Media(@Json("type") type: Type, @Json("foreign_key") foreignKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("details") details: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`? = null, @Json("preferred") preferred: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, @Json("direct_url") directUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("view_url") viewUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

The `Media` object contains a reference for most any media associated with a team or event on TBA.

### Parameters

`type` - String type of the media element.

`foreignKey` - The key used to identify this media on the media site.

`details` - If required, a JSON dict of additional media information.

`preferred` - True if the media is of high quality.

`directUrl` - Direct URL to the media.

`viewUrl` - The URL that leads to the full web page for the media, if one exists.