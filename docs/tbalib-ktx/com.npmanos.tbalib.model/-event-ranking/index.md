[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventRanking](./index.md)

# EventRanking

`data class EventRanking`

### Parameters

`rankings` - List of rankings at the event.

`sortOrderInfo` - List of year-specific values provided in the `sort_orders` array for each team.

`extraStatsInfo` - List of special TBA-generated values provided in the `extra_stats` array for each item.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EventRanking(rankings: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingRankings`](../-event-ranking-rankings/index.md)`>, sortOrderInfo: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingSortOrderInfo`](../-event-ranking-sort-order-info/index.md)`>, extraStatsInfo: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingExtraStatsInfo`](../-event-ranking-extra-stats-info/index.md)`>? = null)` |

### Properties

| Name | Summary |
|---|---|
| [extraStatsInfo](extra-stats-info.md) | List of special TBA-generated values provided in the `extra_stats` array for each item.`val extraStatsInfo: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingExtraStatsInfo`](../-event-ranking-extra-stats-info/index.md)`>?` |
| [rankings](rankings.md) | List of rankings at the event.`val rankings: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingRankings`](../-event-ranking-rankings/index.md)`>` |
| [sortOrderInfo](sort-order-info.md) | List of year-specific values provided in the `sort_orders` array for each team.`val sortOrderInfo: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingSortOrderInfo`](../-event-ranking-sort-order-info/index.md)`>` |
