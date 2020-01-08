[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamEventStatusRankRanking](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TeamEventStatusRankRanking(@Json("matches_played") matchesPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("qual_average") qualAverage: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, @Json("sort_orders") sortOrders: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`BigDecimal`](https://docs.oracle.com/javase/6/docs/api/java/math/BigDecimal.html)`>? = null, @Json("record") record: `[`WLTRecord`](../-w-l-t-record/index.md)`? = null, @Json("rank") rank: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("dq") dq: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("team_key") teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

### Parameters

`matchesPlayed` - Number of matches played.

`qualAverage` - For some years, average qualification score. Can be null.

`sortOrders` - Ordered list of values used to determine the rank. See the `sort_order_info` property for the name of each value.

`record` -

`rank` - Relative rank of this team.

`dq` - Number of matches the team was disqualified for.

`teamKey` - TBA team key for this rank.