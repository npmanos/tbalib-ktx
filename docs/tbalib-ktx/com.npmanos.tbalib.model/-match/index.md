[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Match](./index.md)

# Match

`data class Match`

### Parameters

`key` - TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may be appended to the competition level if more than one match in required per set.

`compLevel` - The competition level the match was played at.

`setNumber` - The set number in a series of matches where more than one match is required in the match series.

`matchNumber` - The match number of the match in the competition level.

`eventKey` - Event key of the event the match was played at.

`alliances` -

`winningAlliance` - The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.

`time` - UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.

`actualTime` - UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.

`predictedTime` - UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.

`postResultTime` - UNIX timestamp (seconds since 1-Jan-1970 00:00:00) when the match result was posted.

`scoreBreakdown` - Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null.

`videos` - Array of video objects associated with this match.

### Types

| Name | Summary |
|---|---|
| [CompLevel](-comp-level/index.md) | The competition level the match was played at. Values: qm,ef,qf,sf,f`enum class CompLevel` |
| [WinningAlliance](-winning-alliance/index.md) | The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie. Values: red,blue,eMPTY`enum class WinningAlliance` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Match(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, compLevel: CompLevel, setNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, matchNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, alliances: `[`MatchSimpleAlliances`](../-match-simple-alliances/index.md)`? = null, winningAlliance: WinningAlliance? = null, time: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, actualTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, predictedTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, postResultTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, scoreBreakdown: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`? = null, videos: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MatchVideos`](../-match-videos/index.md)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [actualTime](actual-time.md) | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.`val actualTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [alliances](alliances.md) | `val alliances: `[`MatchSimpleAlliances`](../-match-simple-alliances/index.md)`?` |
| [compLevel](comp-level.md) | The competition level the match was played at.`val compLevel: CompLevel` |
| [eventKey](event-key.md) | Event key of the event the match was played at.`val eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [key](key.md) | TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may be appended to the competition level if more than one match in required per set.`val key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [matchNumber](match-number.md) | The match number of the match in the competition level.`val matchNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [postResultTime](post-result-time.md) | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) when the match result was posted.`val postResultTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [predictedTime](predicted-time.md) | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.`val predictedTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [scoreBreakdown](score-breakdown.md) | Score breakdown for auto, teleop, etc. points. Varies from year to year. May be null.`val scoreBreakdown: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?` |
| [setNumber](set-number.md) | The set number in a series of matches where more than one match is required in the match series.`val setNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [time](time.md) | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.`val time: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [videos](videos.md) | Array of video objects associated with this match.`val videos: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MatchVideos`](../-match-videos/index.md)`>?` |
| [winningAlliance](winning-alliance.md) | The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.`val winningAlliance: WinningAlliance?` |
