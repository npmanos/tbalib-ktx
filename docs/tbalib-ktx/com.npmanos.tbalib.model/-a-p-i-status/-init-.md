[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [APIStatus](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`APIStatus(@Json("current_season") currentSeason: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("max_season") maxSeason: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("is_datafeed_down") isDatafeedDown: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, @Json("down_events") downEvents: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, @Json("ios") ios: `[`APIStatusAppVersion`](../-a-p-i-status-app-version/index.md)`, @Json("android") android: `[`APIStatusAppVersion`](../-a-p-i-status-app-version/index.md)`)`

### Parameters

`currentSeason` - Year of the current FRC season.

`maxSeason` - Maximum FRC season year for valid queries.

`isDatafeedDown` - True if the entire FMS API provided by FIRST is down.

`downEvents` - An array of strings containing event keys of any active events that are no longer updating.

`ios` -

`android` - 