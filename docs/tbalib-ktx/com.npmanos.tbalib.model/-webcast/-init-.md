[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Webcast](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Webcast(@Json("type") type: Type, @Json("channel") channel: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("file") file: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

### Parameters

`type` - Type of webcast, typically descriptive of the streaming provider.

`channel` - Type specific channel information. May be the YouTube stream, or Twitch channel name. In the case of iframe types, contains HTML to embed the stream in an HTML iframe.

`file` - File identification as may be required for some types. May be null.