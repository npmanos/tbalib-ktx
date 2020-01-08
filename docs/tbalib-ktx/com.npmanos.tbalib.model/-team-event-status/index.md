[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamEventStatus](./index.md)

# TeamEventStatus

`data class TeamEventStatus`

### Parameters

`qual` -

`alliance` -

`playoff` -

`allianceStatusStr` - An HTML formatted string suitable for display to the user containing the team's alliance pick status.

`playoffStatusStr` - An HTML formatter string suitable for display to the user containing the team's playoff status.

`overallStatusStr` - An HTML formatted string suitable for display to the user containing the team's overall status summary of the event.

`nextMatchKey` - TBA match key for the next match the team is scheduled to play in at this event, or null.

`lastMatchKey` - TBA match key for the last match the team played in at this event, or null.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TeamEventStatus(qual: `[`TeamEventStatusRank`](../-team-event-status-rank/index.md)`? = null, alliance: `[`TeamEventStatusAlliance`](../-team-event-status-alliance/index.md)`? = null, playoff: `[`TeamEventStatusPlayoff`](../-team-event-status-playoff/index.md)`? = null, allianceStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, playoffStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, overallStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, nextMatchKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, lastMatchKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [alliance](alliance.md) | `val alliance: `[`TeamEventStatusAlliance`](../-team-event-status-alliance/index.md)`?` |
| [allianceStatusStr](alliance-status-str.md) | An HTML formatted string suitable for display to the user containing the team's alliance pick status.`val allianceStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [lastMatchKey](last-match-key.md) | TBA match key for the last match the team played in at this event, or null.`val lastMatchKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [nextMatchKey](next-match-key.md) | TBA match key for the next match the team is scheduled to play in at this event, or null.`val nextMatchKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [overallStatusStr](overall-status-str.md) | An HTML formatted string suitable for display to the user containing the team's overall status summary of the event.`val overallStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [playoff](playoff.md) | `val playoff: `[`TeamEventStatusPlayoff`](../-team-event-status-playoff/index.md)`?` |
| [playoffStatusStr](playoff-status-str.md) | An HTML formatter string suitable for display to the user containing the team's playoff status.`val playoffStatusStr: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [qual](qual.md) | `val qual: `[`TeamEventStatusRank`](../-team-event-status-rank/index.md)`?` |
