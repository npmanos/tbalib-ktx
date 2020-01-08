[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamEventStatusRankRanking](./index.md)

# TeamEventStatusRankRanking

`data class TeamEventStatusRankRanking`

### Parameters

`matchesPlayed` - Number of matches played.

`qualAverage` - For some years, average qualification score. Can be null.

`sortOrders` - Ordered list of values used to determine the rank. See the `sort_order_info` property for the name of each value.

`record` -

`rank` - Relative rank of this team.

`dq` - Number of matches the team was disqualified for.

`teamKey` - TBA team key for this rank.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TeamEventStatusRankRanking(matchesPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, qualAverage: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, sortOrders: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>? = null, record: `[`WLTRecord`](../-w-l-t-record/index.md)`? = null, rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, dq: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [dq](dq.md) | Number of matches the team was disqualified for.`val dq: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [matchesPlayed](matches-played.md) | Number of matches played.`val matchesPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [qualAverage](qual-average.md) | For some years, average qualification score. Can be null.`val qualAverage: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [rank](rank.md) | Relative rank of this team.`val rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [record](record.md) | `val record: `[`WLTRecord`](../-w-l-t-record/index.md)`?` |
| [sortOrders](sort-orders.md) | Ordered list of values used to determine the rank. See the `sort_order_info` property for the name of each value.`val sortOrders: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>?` |
| [teamKey](team-key.md) | TBA team key for this rank.`val teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
