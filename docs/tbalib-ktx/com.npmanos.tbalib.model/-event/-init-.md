[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Event](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Event(@Json("key") key: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("name") name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("event_code") eventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("event_type") eventType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("start_date") startDate: LocalDate, @Json("end_date") endDate: LocalDate, @Json("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("event_type_string") eventTypeString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("district") district: `[`DistrictList`](../-district-list/index.md)`? = null, @Json("city") city: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("state_prov") stateProv: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("country") country: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("short_name") shortName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("week") week: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("address") address: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("postal_code") postalCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("gmaps_place_id") gmapsPlaceId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("gmaps_url") gmapsUrl: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("lat") lat: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, @Json("lng") lng: `[`Double`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)`? = null, @Json("location_name") locationName: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("timezone") timezone: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("website") website: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("first_event_id") firstEventId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("first_event_code") firstEventCode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("webcasts") webcasts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Webcast`](../-webcast/index.md)`>? = null, @Json("division_keys") divisionKeys: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, @Json("parent_event_key") parentEventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("playoff_type") playoffType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("playoff_type_string") playoffTypeString: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)`

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