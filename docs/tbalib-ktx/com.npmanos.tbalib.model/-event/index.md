[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Event](./index.md)

# Event

`data class Event`

### Parameters

`key` - TBA event key with the format yyyy[EVENT_CODE](#), where yyyy is the year, and EVENT_CODE is the event code of the event.

`name` - Official name of event on record either provided by FIRST or organizers of offseason event.

`eventCode` - Event short code, as provided by FIRST.

`eventType` - Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2

`startDate` - Event start date in `yyyy-mm-dd` format.

`endDate` - Event end date in `yyyy-mm-dd` format.

`year` - Year the event data is for.

`eventTypeString` - Event Type, eg Regional, District, or Offseason.

`district` -

`city` - City, town, village, etc. the event is located in.

`stateProv` - State or Province the event is located in.

`country` - Country the event is located in.

`shortName` - Same as `name` but doesn't include event specifiers, such as 'Regional' or 'District'. May be null.

`week` - Week of the event relative to the first official season event, zero-indexed. Only valid for Regionals, Districts, and District Championships. Null otherwise. (Eg. A season with a week 0 'preseason' event does not count, and week 1 events will show 0 here. Seasons with a week 0.5 regional event will show week 0 for those event(s) and week 1 for week 1 events and so on.)

`address` - Address of the event's venue, if available.

`postalCode` - Postal code from the event address.

`gmapsPlaceId` - Google Maps Place ID for the event address.

`gmapsUrl` - Link to address location on Google Maps.

`lat` - Latitude for the event address.

`lng` - Longitude for the event address.

`locationName` - Name of the location at the address for the event, eg. Blue Alliance High School.

`timezone` - Timezone name.

`website` - The event's website, if any.

`firstEventId` - The FIRST internal Event ID, used to link to the event on the FRC webpage.

`firstEventCode` - Public facing event code used by FIRST (on frc-events.firstinspires.org, for example)

`webcasts` -

`divisionKeys` - An array of event keys for the divisions at this event.

`parentEventKey` - The TBA Event key that represents the event's parent. Used to link back to the event from a division event. It is also the inverse relation of `divison_keys`.

`playoffType` - Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null.

`playoffTypeString` - String representation of the `playoff_type`, or null.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Event(key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, eventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, eventType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, startDate: LocalDate, endDate: LocalDate, year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, eventTypeString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, district: `[`DistrictList`](../-district-list/index.md)`? = null, city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, shortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, week: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, postalCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, gmapsPlaceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, gmapsUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, lat: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, lng: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, locationName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, timezone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, website: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, firstEventId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, firstEventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, webcasts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Webcast`](../-webcast/index.md)`>? = null, divisionKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, parentEventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, playoffType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, playoffTypeString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [address](address.md) | Address of the event's venue, if available.`val address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [city](city.md) | City, town, village, etc. the event is located in.`val city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [country](country.md) | Country the event is located in.`val country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [district](district.md) | `val district: `[`DistrictList`](../-district-list/index.md)`?` |
| [divisionKeys](division-keys.md) | An array of event keys for the divisions at this event.`val divisionKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [endDate](end-date.md) | Event end date in `yyyy-mm-dd` format.`val endDate: LocalDate` |
| [eventCode](event-code.md) | Event short code, as provided by FIRST.`val eventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [eventType](event-type.md) | Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2`val eventType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [eventTypeString](event-type-string.md) | Event Type, eg Regional, District, or Offseason.`val eventTypeString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [firstEventCode](first-event-code.md) | Public facing event code used by FIRST (on frc-events.firstinspires.org, for example)`val firstEventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [firstEventId](first-event-id.md) | The FIRST internal Event ID, used to link to the event on the FRC webpage.`val firstEventId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [gmapsPlaceId](gmaps-place-id.md) | Google Maps Place ID for the event address.`val gmapsPlaceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [gmapsUrl](gmaps-url.md) | Link to address location on Google Maps.`val gmapsUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [key](key.md) | TBA event key with the format yyyy[EVENT_CODE](#), where yyyy is the year, and EVENT_CODE is the event code of the event.`val key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [lat](lat.md) | Latitude for the event address.`val lat: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [lng](lng.md) | Longitude for the event address.`val lng: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`?` |
| [locationName](location-name.md) | Name of the location at the address for the event, eg. Blue Alliance High School.`val locationName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [name](name.md) | Official name of event on record either provided by FIRST or organizers of offseason event.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [parentEventKey](parent-event-key.md) | The TBA Event key that represents the event's parent. Used to link back to the event from a division event. It is also the inverse relation of `divison_keys`.`val parentEventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [playoffType](playoff-type.md) | Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null.`val playoffType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [playoffTypeString](playoff-type-string.md) | String representation of the `playoff_type`, or null.`val playoffTypeString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [postalCode](postal-code.md) | Postal code from the event address.`val postalCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [shortName](short-name.md) | Same as `name` but doesn't include event specifiers, such as 'Regional' or 'District'. May be null.`val shortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [startDate](start-date.md) | Event start date in `yyyy-mm-dd` format.`val startDate: LocalDate` |
| [stateProv](state-prov.md) | State or Province the event is located in.`val stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [timezone](timezone.md) | Timezone name.`val timezone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [webcasts](webcasts.md) | `val webcasts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Webcast`](../-webcast/index.md)`>?` |
| [website](website.md) | The event's website, if any.`val website: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [week](week.md) | Week of the event relative to the first official season event, zero-indexed. Only valid for Regionals, Districts, and District Championships. Null otherwise. (Eg. A season with a week 0 'preseason' event does not count, and week 1 events will show 0 here. Seasons with a week 0.5 regional event will show week 0 for those event(s) and week 1 for week 1 events and so on.)`val week: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [year](year.md) | Year the event data is for.`val year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
