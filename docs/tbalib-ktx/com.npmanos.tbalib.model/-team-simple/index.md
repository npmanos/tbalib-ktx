[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamSimple](./index.md)

# TeamSimple

`data class TeamSimple`

### Parameters

`key` - TBA team key with the format `frcXXXX` with `XXXX` representing the team number.

`teamNumber` - Official team number issued by FIRST.

`name` - Official long name registered with FIRST.

`nickname` - Team nickname provided by FIRST.

`city` - City of team derived from parsing the address registered with FIRST.

`stateProv` - State of team derived from parsing the address registered with FIRST.

`country` - Country of team derived from parsing the address registered with FIRST.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TeamSimple(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, teamNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, nickname: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [city](city.md) | City of team derived from parsing the address registered with FIRST.`val city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [country](country.md) | Country of team derived from parsing the address registered with FIRST.`val country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [key](key.md) | TBA team key with the format `frcXXXX` with `XXXX` representing the team number.`val key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | Official long name registered with FIRST.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [nickname](nickname.md) | Team nickname provided by FIRST.`val nickname: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [stateProv](state-prov.md) | State of team derived from parsing the address registered with FIRST.`val stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [teamNumber](team-number.md) | Official team number issued by FIRST.`val teamNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
