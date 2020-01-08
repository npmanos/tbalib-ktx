[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventSimple](./index.md)

# EventSimple

`data class EventSimple`

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

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EventSimple(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, eventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, eventType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, startDate: LocalDate, endDate: LocalDate, year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, district: `[`DistrictList`](../-district-list/index.md)`? = null, city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [city](city.md) | City, town, village, etc. the event is located in.`val city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [country](country.md) | Country the event is located in.`val country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [district](district.md) | `val district: `[`DistrictList`](../-district-list/index.md)`?` |
| [endDate](end-date.md) | Event end date in `yyyy-mm-dd` format.`val endDate: LocalDate` |
| [eventCode](event-code.md) | Event short code, as provided by FIRST.`val eventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [eventType](event-type.md) | Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2`val eventType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [key](key.md) | TBA event key with the format yyyy[EVENT_CODE](#), where yyyy is the year, and EVENT_CODE is the event code of the event.`val key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | Official name of event on record either provided by FIRST or organizers of offseason event.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [startDate](start-date.md) | Event start date in `yyyy-mm-dd` format.`val startDate: LocalDate` |
| [stateProv](state-prov.md) | State or Province the event is located in.`val stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [year](year.md) | Year the event data is for.`val year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
