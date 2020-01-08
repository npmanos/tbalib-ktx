[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [DistrictRanking](./index.md)

# DistrictRanking

`data class DistrictRanking`

Rank of a team in a district.

### Parameters

`teamKey` - TBA team key for the team.

`rank` - Numerical rank of the team, 1 being top rank.

`pointTotal` - Total district points for the team.

`rookieBonus` - Any points added to a team as a result of the rookie bonus.

`eventPoints` - List of events that contributed to the point total for the team.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Rank of a team in a district.`DistrictRanking(teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, pointTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, rookieBonus: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, eventPoints: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`DistrictRankingEventPoints`](../-district-ranking-event-points/index.md)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [eventPoints](event-points.md) | List of events that contributed to the point total for the team.`val eventPoints: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`DistrictRankingEventPoints`](../-district-ranking-event-points/index.md)`>?` |
| [pointTotal](point-total.md) | Total district points for the team.`val pointTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [rank](rank.md) | Numerical rank of the team, 1 being top rank.`val rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [rookieBonus](rookie-bonus.md) | Any points added to a team as a result of the rookie bonus.`val rookieBonus: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teamKey](team-key.md) | TBA team key for the team.`val teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
