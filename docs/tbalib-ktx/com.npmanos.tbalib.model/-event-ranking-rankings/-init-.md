[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventRankingRankings](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`EventRankingRankings(@Json("matches_played") matchesPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("record") record: `[`WLTRecord`](../-w-l-t-record/index.md)`, @Json("rank") rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("dq") dq: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("qual_average") qualAverage: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("extra_stats") extraStats: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>? = null, @Json("sort_orders") sortOrders: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>? = null)`

### Parameters

`matchesPlayed` - Number of matches played by this team.

`record` -

`rank` - The team's rank at the event as provided by FIRST.

`dq` - Number of times disqualified.

`teamKey` - The team with this rank.

`qualAverage` - The average match score during qualifications. Year specific. May be null if not relevant for a given year.

`extraStats` - Additional special data on the team's performance calculated by TBA.

`sortOrders` - Additional year-specific information, may be null. See parent `sort_order_info` for details.