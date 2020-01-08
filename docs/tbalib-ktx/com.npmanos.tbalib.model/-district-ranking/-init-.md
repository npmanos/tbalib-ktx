[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [DistrictRanking](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`DistrictRanking(@Json("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("rank") rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("point_total") pointTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("rookie_bonus") rookieBonus: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("event_points") eventPoints: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`DistrictRankingEventPoints`](../-district-ranking-event-points/index.md)`>? = null)`

Rank of a team in a district.

### Parameters

`teamKey` - TBA team key for the team.

`rank` - Numerical rank of the team, 1 being top rank.

`pointTotal` - Total district points for the team.

`rookieBonus` - Any points added to a team as a result of the rookie bonus.

`eventPoints` - List of events that contributed to the point total for the team.