[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [MatchAlliance](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`MatchAlliance(@Json("score") score: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("team_keys") teamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, @Json("surrogate_team_keys") surrogateTeamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, @Json("dq_team_keys") dqTeamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null)`

### Parameters

`score` - Score for this alliance. Will be null or -1 for an unplayed match.

`teamKeys` -

`surrogateTeamKeys` - TBA team keys (eg `frc254`) of any teams playing as a surrogate.

`dqTeamKeys` - TBA team keys (eg `frc254`) of any disqualified teams.