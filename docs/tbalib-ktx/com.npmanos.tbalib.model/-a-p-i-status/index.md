[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [APIStatus](./index.md)

# APIStatus

`data class APIStatus`

### Parameters

`currentSeason` - Year of the current FRC season.

`maxSeason` - Maximum FRC season year for valid queries.

`isDatafeedDown` - True if the entire FMS API provided by FIRST is down.

`downEvents` - An array of strings containing event keys of any active events that are no longer updating.

`ios` -

`android` -

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `APIStatus(currentSeason: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, maxSeason: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, isDatafeedDown: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, downEvents: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, ios: `[`APIStatusAppVersion`](../-a-p-i-status-app-version/index.md)`, android: `[`APIStatusAppVersion`](../-a-p-i-status-app-version/index.md)`)` |

### Properties

| Name | Summary |
|---|---|
| [android](android.md) | `val android: `[`APIStatusAppVersion`](../-a-p-i-status-app-version/index.md) |
| [currentSeason](current-season.md) | Year of the current FRC season.`val currentSeason: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [downEvents](down-events.md) | An array of strings containing event keys of any active events that are no longer updating.`val downEvents: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [ios](ios.md) | `val ios: `[`APIStatusAppVersion`](../-a-p-i-status-app-version/index.md) |
| [isDatafeedDown](is-datafeed-down.md) | True if the entire FMS API provided by FIRST is down.`val isDatafeedDown: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [maxSeason](max-season.md) | Maximum FRC season year for valid queries.`val maxSeason: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
