[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [MatchSimple](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`MatchSimple(@Json("key") key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("comp_level") compLevel: CompLevel, @Json("set_number") setNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("match_number") matchNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("alliances") alliances: `[`MatchSimpleAlliances`](../-match-simple-alliances/index.md)`? = null, @Json("winning_alliance") winningAlliance: WinningAlliance? = null, @Json("time") time: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, @Json("predicted_time") predictedTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, @Json("actual_time") actualTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null)`

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