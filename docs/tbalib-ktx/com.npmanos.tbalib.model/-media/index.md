[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Media](./index.md)

# Media

`data class Media`

The `Media` object contains a reference for most any media associated with a team or event on TBA.

### Parameters

`type` - String type of the media element.

`foreignKey` - The key used to identify this media on the media site.

`details` - If required, a JSON dict of additional media information.

`preferred` - True if the media is of high quality.

`directUrl` - Direct URL to the media.

`viewUrl` - The URL that leads to the full web page for the media, if one exists.

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | String type of the media element. Values: youtube,cdphotothread,imgur,facebookProfile,youtubeChannel,twitterProfile,githubProfile,instagramProfile,periscopeProfile,grabcad,instagramImage,externalLink,avatar`enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | The `Media` object contains a reference for most any media associated with a team or event on TBA.`Media(type: Type, foreignKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, details: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`? = null, preferred: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, directUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, viewUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [details](details.md) | If required, a JSON dict of additional media information.`val details: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?` |
| [directUrl](direct-url.md) | Direct URL to the media.`val directUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [foreignKey](foreign-key.md) | The key used to identify this media on the media site.`val foreignKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [preferred](preferred.md) | True if the media is of high quality.`val preferred: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [type](type.md) | String type of the media element.`val type: Type` |
| [viewUrl](view-url.md) | The URL that leads to the full web page for the media, if one exists.`val viewUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
