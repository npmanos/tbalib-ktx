[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [MatchSimple](./index.md)

# MatchSimple

`data class MatchSimple`

### Parameters

`key` - TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may append the competition level if more than one match in required per set.

`compLevel` - The competition level the match was played at.

`setNumber` - The set number in a series of matches where more than one match is required in the match series.

`matchNumber` - The match number of the match in the competition level.

`eventKey` - Event key of the event the match was played at.

`alliances` -

`winningAlliance` - The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.

`time` - UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.

`predictedTime` - UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.

`actualTime` - UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.

### Types

| Name | Summary |
|---|---|
| [CompLevel](-comp-level/index.md) | The competition level the match was played at. Values: qm,ef,qf,sf,f`enum class CompLevel` |
| [WinningAlliance](-winning-alliance/index.md) | The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie. Values: red,blue,eMPTY`enum class WinningAlliance` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MatchSimple(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, compLevel: CompLevel, setNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, matchNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, alliances: `[`MatchSimpleAlliances`](../-match-simple-alliances/index.md)`? = null, winningAlliance: WinningAlliance? = null, time: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, predictedTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, actualTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [actualTime](actual-time.md) | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of actual match start time.`val actualTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [alliances](alliances.md) | `val alliances: `[`MatchSimpleAlliances`](../-match-simple-alliances/index.md)`?` |
| [compLevel](comp-level.md) | The competition level the match was played at.`val compLevel: CompLevel` |
| [eventKey](event-key.md) | Event key of the event the match was played at.`val eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [key](key.md) | TBA match key with the format `yyyy[EVENT_CODE]_[COMP_LEVEL]m[MATCH_NUMBER]`, where `yyyy` is the year, and `EVENT_CODE` is the event code of the event, `COMP_LEVEL` is (qm, ef, qf, sf, f), and `MATCH_NUMBER` is the match number in the competition level. A set number may append the competition level if more than one match in required per set.`val key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [matchNumber](match-number.md) | The match number of the match in the competition level.`val matchNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [predictedTime](predicted-time.md) | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the TBA predicted match start time.`val predictedTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [setNumber](set-number.md) | The set number in a series of matches where more than one match is required in the match series.`val setNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [time](time.md) | UNIX timestamp (seconds since 1-Jan-1970 00:00:00) of the scheduled match time, as taken from the published schedule.`val time: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`?` |
| [winningAlliance](winning-alliance.md) | The color (red/blue) of the winning alliance. Will contain an empty string in the event of no winner, or a tie.`val winningAlliance: WinningAlliance?` |
