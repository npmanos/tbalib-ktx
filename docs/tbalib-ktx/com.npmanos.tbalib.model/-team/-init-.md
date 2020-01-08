[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Team](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Team(@Json("key") key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("team_number") teamNumber: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("name") name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("nickname") nickname: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("city") city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("state_prov") stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("country") country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("address") address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("postal_code") postalCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("gmaps_place_id") gmapsPlaceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("gmaps_url") gmapsUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("lat") lat: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, @Json("lng") lng: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, @Json("location_name") locationName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("website") website: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("rookie_year") rookieYear: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("motto") motto: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("home_championship") homeChampionship: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`? = null)`

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