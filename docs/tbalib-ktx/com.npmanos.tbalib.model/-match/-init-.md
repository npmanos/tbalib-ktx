[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Match](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Match(@Json("key") key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("comp_level") compLevel: CompLevel, @Json("set_number") setNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("match_number") matchNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("alliances") alliances: `[`MatchSimpleAlliances`](../-match-simple-alliances/index.md)`? = null, @Json("winning_alliance") winningAlliance: WinningAlliance? = null, @Json("time") time: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, @Json("actual_time") actualTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, @Json("predicted_time") predictedTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, @Json("post_result_time") postResultTime: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`? = null, @Json("score_breakdown") scoreBreakdown: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`? = null, @Json("videos") videos: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`MatchVideos`](../-match-videos/index.md)`>? = null)`

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