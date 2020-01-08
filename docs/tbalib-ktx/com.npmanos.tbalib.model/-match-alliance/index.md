[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [MatchAlliance](./index.md)

# MatchAlliance

`data class MatchAlliance`

### Parameters

`score` - Score for this alliance. Will be null or -1 for an unplayed match.

`teamKeys` -

`surrogateTeamKeys` - TBA team keys (eg `frc254`) of any teams playing as a surrogate.

`dqTeamKeys` - TBA team keys (eg `frc254`) of any disqualified teams.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MatchAlliance(score: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, teamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, surrogateTeamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, dqTeamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [dqTeamKeys](dq-team-keys.md) | TBA team keys (eg `frc254`) of any disqualified teams.`val dqTeamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [score](score.md) | Score for this alliance. Will be null or -1 for an unplayed match.`val score: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [surrogateTeamKeys](surrogate-team-keys.md) | TBA team keys (eg `frc254`) of any teams playing as a surrogate.`val surrogateTeamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [teamKeys](team-keys.md) | `val teamKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
