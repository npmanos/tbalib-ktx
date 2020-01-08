[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Team](./index.md)

# Team

`data class Team`

### Parameters

`key` - TBA team key with the format `frcXXXX` with `XXXX` representing the team number.

`teamNumber` - Official team number issued by FIRST.

`name` - Official long name registered with FIRST.

`nickname` - Team nickname provided by FIRST.

`city` - City of team derived from parsing the address registered with FIRST.

`stateProv` - State of team derived from parsing the address registered with FIRST.

`country` - Country of team derived from parsing the address registered with FIRST.

`address` - Will be NULL, for future development.

`postalCode` - Postal code from the team address.

`gmapsPlaceId` - Will be NULL, for future development.

`gmapsUrl` - Will be NULL, for future development.

`lat` - Will be NULL, for future development.

`lng` - Will be NULL, for future development.

`locationName` - Will be NULL, for future development.

`website` - Official website associated with the team.

`rookieYear` - First year the team officially competed.

`motto` - Team's motto as provided by FIRST. This field is deprecated and will return null - will be removed at end-of-season in 2019.

`homeChampionship` - Location of the team's home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Team(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, teamNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, nickname: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, postalCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, gmapsPlaceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, gmapsUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, lat: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, lng: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, locationName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, website: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, rookieYear: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, motto: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, homeChampionship: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [address](address.md) | Will be NULL, for future development.`val address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [city](city.md) | City of team derived from parsing the address registered with FIRST.`val city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [country](country.md) | Country of team derived from parsing the address registered with FIRST.`val country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [gmapsPlaceId](gmaps-place-id.md) | Will be NULL, for future development.`val gmapsPlaceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [gmapsUrl](gmaps-url.md) | Will be NULL, for future development.`val gmapsUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [homeChampionship](home-championship.md) | Location of the team's home championship each year as a key-value pair. The year (as a string) is the key, and the city is the value.`val homeChampionship: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?` |
| [key](key.md) | TBA team key with the format `frcXXXX` with `XXXX` representing the team number.`val key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [lat](lat.md) | Will be NULL, for future development.`val lat: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [lng](lng.md) | Will be NULL, for future development.`val lng: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [locationName](location-name.md) | Will be NULL, for future development.`val locationName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [motto](motto.md) | Team's motto as provided by FIRST. This field is deprecated and will return null - will be removed at end-of-season in 2019.`val motto: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | Official long name registered with FIRST.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [nickname](nickname.md) | Team nickname provided by FIRST.`val nickname: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [postalCode](postal-code.md) | Postal code from the team address.`val postalCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [rookieYear](rookie-year.md) | First year the team officially competed.`val rookieYear: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [stateProv](state-prov.md) | State of team derived from parsing the address registered with FIRST.`val stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [teamNumber](team-number.md) | Official team number issued by FIRST.`val teamNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [website](website.md) | Official website associated with the team.`val website: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
