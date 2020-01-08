[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamEventStatus](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TeamEventStatus(@Json("qual") qual: `[`TeamEventStatusRank`](../-team-event-status-rank/index.md)`? = null, @Json("alliance") alliance: `[`TeamEventStatusAlliance`](../-team-event-status-alliance/index.md)`? = null, @Json("playoff") playoff: `[`TeamEventStatusPlayoff`](../-team-event-status-playoff/index.md)`? = null, @Json("alliance_status_str") allianceStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("playoff_status_str") playoffStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("overall_status_str") overallStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("next_match_key") nextMatchKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("last_match_key") lastMatchKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

### Parameters

`qual` -

`alliance` -

`playoff` -

`allianceStatusStr` - An HTML formatted string suitable for display to the user containing the team's alliance pick status.

`playoffStatusStr` - An HTML formatter string suitable for display to the user containing the team's playoff status.

`overallStatusStr` - An HTML formatted string suitable for display to the user containing the team's overall status summary of the event.

`nextMatchKey` - TBA match key for the next match the team is scheduled to play in at this event, or null.

`lastMatchKey` - TBA match key for the last match the team played in at this event, or null.