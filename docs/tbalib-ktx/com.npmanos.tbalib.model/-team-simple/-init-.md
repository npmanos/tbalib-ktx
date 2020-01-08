[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamSimple](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TeamSimple(@Json("key") key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("team_number") teamNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("name") name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("nickname") nickname: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("city") city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("state_prov") stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("country") country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

### Parameters

`key` - TBA team key with the format `frcXXXX` with `XXXX` representing the team number.

`teamNumber` - Official team number issued by FIRST.

`name` - Official long name registered with FIRST.

`nickname` - Team nickname provided by FIRST.

`city` - City of team derived from parsing the address registered with FIRST.

`stateProv` - State of team derived from parsing the address registered with FIRST.

`country` - Country of team derived from parsing the address registered with FIRST.