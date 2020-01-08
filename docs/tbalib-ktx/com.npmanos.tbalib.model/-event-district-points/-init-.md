[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventDistrictPoints](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`EventDistrictPoints(@Json("points") points: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`EventDistrictPointsPoints`](../-event-district-points-points/index.md)`>, @Json("tiebreakers") tiebreakers: `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`EventDistrictPointsTiebreakers`](../-event-district-points-tiebreakers/index.md)`>? = null)`

### Parameters

`points` - Points gained for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the points as its value.

`tiebreakers` - Tiebreaker values for each team at the event. Stored as a key-value pair with the team key as the key, and an object describing the tiebreaker elements as its value.