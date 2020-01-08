[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Webcast](./index.md)

# Webcast

`data class Webcast`

### Parameters

`type` - Type of webcast, typically descriptive of the streaming provider.

`channel` - Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.

`file` - File identification as may be required for some types. May be null.

### Types

| Name | Summary |
|---|---|
| [Type](-type/index.md) | Type of webcast, typically descriptive of the streaming provider. Values: youtube,twitch,ustream,iframe,html5,rtmp,livestream,directLink,mms,justin,stemtv,dacast`enum class Type` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Webcast(type: Type, channel: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, file: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [channel](channel.md) | Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.`val channel: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [file](file.md) | File identification as may be required for some types. May be null.`val file: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [type](type.md) | Type of webcast, typically descriptive of the streaming provider.`val type: Type` |
