[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventRankingRankings](./index.md)

# EventRankingRankings

`data class EventRankingRankings`

### Parameters

`matchesPlayed` - Number of matches played by this team.

`record` -

`rank` - The team's rank at the event as provided by FIRST.

`dq` - Number of times disqualified.

`teamKey` - The team with this rank.

`qualAverage` - The average match score during qualifications. Year specific. May be null if not relevant for a given year.

`extraStats` - Additional special data on the team's performance calculated by TBA.

`sortOrders` - Additional year-specific information, may be null. See parent `sort_order_info` for details.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EventRankingRankings(matchesPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, record: `[`WLTRecord`](../-w-l-t-record/index.md)`, rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, dq: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, qualAverage: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, extraStats: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>? = null, sortOrders: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [dq](dq.md) | Number of times disqualified.`val dq: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [extraStats](extra-stats.md) | Additional special data on the team's performance calculated by TBA.`val extraStats: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>?` |
| [matchesPlayed](matches-played.md) | Number of matches played by this team.`val matchesPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [qualAverage](qual-average.md) | The average match score during qualifications. Year specific. May be null if not relevant for a given year.`val qualAverage: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [rank](rank.md) | The team's rank at the event as provided by FIRST.`val rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [record](record.md) | `val record: `[`WLTRecord`](../-w-l-t-record/index.md) |
| [sortOrders](sort-orders.md) | Additional year-specific information, may be null. See parent `sort_order_info` for details.`val sortOrders: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>?` |
| [teamKey](team-key.md) | The team with this rank.`val teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
