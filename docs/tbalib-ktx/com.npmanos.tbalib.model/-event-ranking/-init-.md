[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventRanking](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`EventRanking(@Json("rankings") rankings: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingRankings`](../-event-ranking-rankings/index.md)`>, @Json("sort_order_info") sortOrderInfo: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingSortOrderInfo`](../-event-ranking-sort-order-info/index.md)`>, @Json("extra_stats_info") extraStatsInfo: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`EventRankingExtraStatsInfo`](../-event-ranking-extra-stats-info/index.md)`>? = null)`

### Parameters

`rankings` - List of rankings at the event.

`sortOrderInfo` - List of year-specific values provided in the `sort_orders` array for each team.

`extraStatsInfo` - List of special TBA-generated values provided in the `extra_stats` array for each item.