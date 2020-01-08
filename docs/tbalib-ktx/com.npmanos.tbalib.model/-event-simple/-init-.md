[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventSimple](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`EventSimple(@Json("key") key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("name") name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("event_code") eventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("event_type") eventType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("start_date") startDate: LocalDate, @Json("end_date") endDate: LocalDate, @Json("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("district") district: `[`DistrictList`](../-district-list/index.md)`? = null, @Json("city") city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("state_prov") stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("country") country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

### Parameters

`key` - TBA event key with the format yyyy[EVENT_CODE](#), where yyyy is the year, and EVENT_CODE is the event code of the event.

`name` - Official name of event on record either provided by FIRST or organizers of offseason event.

`eventCode` - Event short code, as provided by FIRST.

`eventType` - Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2

`startDate` - Event start date in `yyyy-mm-dd` format.

`endDate` - Event end date in `yyyy-mm-dd` format.

`year` - Year the event data is for.

`district` -

`city` - City, town, village, etc. the event is located in.

`stateProv` - State or Province the event is located in.

`country` - Country the event is located in.