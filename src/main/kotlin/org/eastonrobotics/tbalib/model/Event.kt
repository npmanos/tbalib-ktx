/**
* The Blue Alliance API v3
* # Overview    Information and statistics about FIRST Robotics Competition teams and events.   # Authentication   All endpoints require an Auth Key to be passed in the header `X-TBA-Auth-Key`. If you do not have an auth key yet, you can obtain one from your [Account Page](/account).    A `User-Agent` header may need to be set to prevent a 403 Unauthorized error.
*
* The version of the OpenAPI document: 3.5.1
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.eastonrobotics.tbalib.model

import org.eastonrobotics.tbalib.model.DistrictList
import org.eastonrobotics.tbalib.model.Webcast

import com.squareup.moshi.Json
/**
 * 
 * @param key TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event.
 * @param name Official name of event on record either provided by FIRST or organizers of offseason event.
 * @param eventCode Event short code, as provided by FIRST.
 * @param eventType Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2
 * @param startDate Event start date in `yyyy-mm-dd` format.
 * @param endDate Event end date in `yyyy-mm-dd` format.
 * @param year Year the event data is for.
 * @param eventTypeString Event Type, eg Regional, District, or Offseason.
 * @param district 
 * @param city City, town, village, etc. the event is located in.
 * @param stateProv State or Province the event is located in.
 * @param country Country the event is located in.
 * @param shortName Same as `name` but doesn't include event specifiers, such as 'Regional' or 'District'. May be null.
 * @param week Week of the event relative to the first official season event, zero-indexed. Only valid for Regionals, Districts, and District Championships. Null otherwise. (Eg. A season with a week 0 'preseason' event does not count, and week 1 events will show 0 here. Seasons with a week 0.5 regional event will show week 0 for those event(s) and week 1 for week 1 events and so on.)
 * @param address Address of the event's venue, if available.
 * @param postalCode Postal code from the event address.
 * @param gmapsPlaceId Google Maps Place ID for the event address.
 * @param gmapsUrl Link to address location on Google Maps.
 * @param lat Latitude for the event address.
 * @param lng Longitude for the event address.
 * @param locationName Name of the location at the address for the event, eg. Blue Alliance High School.
 * @param timezone Timezone name.
 * @param website The event's website, if any.
 * @param firstEventId The FIRST internal Event ID, used to link to the event on the FRC webpage.
 * @param firstEventCode Public facing event code used by FIRST (on frc-events.firstinspires.org, for example)
 * @param webcasts 
 * @param divisionKeys An array of event keys for the divisions at this event.
 * @param parentEventKey The TBA Event key that represents the event's parent. Used to link back to the event from a division event. It is also the inverse relation of `divison_keys`.
 * @param playoffType Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null.
 * @param playoffTypeString String representation of the `playoff_type`, or null.
 */

data class Event (
    /* TBA event key with the format yyyy[EVENT_CODE], where yyyy is the year, and EVENT_CODE is the event code of the event. */
    @Json(name = "key")
    val key: kotlin.String,
    /* Official name of event on record either provided by FIRST or organizers of offseason event. */
    @Json(name = "name")
    val name: kotlin.String,
    /* Event short code, as provided by FIRST. */
    @Json(name = "event_code")
    val eventCode: kotlin.String,
    /* Event Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/event_type.py#L2 */
    @Json(name = "event_type")
    val eventType: kotlin.Int,
    /* Event start date in `yyyy-mm-dd` format. */
    @Json(name = "start_date")
    val startDate: org.threeten.bp.LocalDate,
    /* Event end date in `yyyy-mm-dd` format. */
    @Json(name = "end_date")
    val endDate: org.threeten.bp.LocalDate,
    /* Year the event data is for. */
    @Json(name = "year")
    val year: kotlin.Int,
    /* Event Type, eg Regional, District, or Offseason. */
    @Json(name = "event_type_string")
    val eventTypeString: kotlin.String,
    @Json(name = "district")
    val district: DistrictList? = null,
    /* City, town, village, etc. the event is located in. */
    @Json(name = "city")
    val city: kotlin.String? = null,
    /* State or Province the event is located in. */
    @Json(name = "state_prov")
    val stateProv: kotlin.String? = null,
    /* Country the event is located in. */
    @Json(name = "country")
    val country: kotlin.String? = null,
    /* Same as `name` but doesn't include event specifiers, such as 'Regional' or 'District'. May be null. */
    @Json(name = "short_name")
    val shortName: kotlin.String? = null,
    /* Week of the event relative to the first official season event, zero-indexed. Only valid for Regionals, Districts, and District Championships. Null otherwise. (Eg. A season with a week 0 'preseason' event does not count, and week 1 events will show 0 here. Seasons with a week 0.5 regional event will show week 0 for those event(s) and week 1 for week 1 events and so on.) */
    @Json(name = "week")
    val week: kotlin.Int? = null,
    /* Address of the event's venue, if available. */
    @Json(name = "address")
    val address: kotlin.String? = null,
    /* Postal code from the event address. */
    @Json(name = "postal_code")
    val postalCode: kotlin.String? = null,
    /* Google Maps Place ID for the event address. */
    @Json(name = "gmaps_place_id")
    val gmapsPlaceId: kotlin.String? = null,
    /* Link to address location on Google Maps. */
    @Json(name = "gmaps_url")
    val gmapsUrl: kotlin.String? = null,
    /* Latitude for the event address. */
    @Json(name = "lat")
    val lat: kotlin.Double? = null,
    /* Longitude for the event address. */
    @Json(name = "lng")
    val lng: kotlin.Double? = null,
    /* Name of the location at the address for the event, eg. Blue Alliance High School. */
    @Json(name = "location_name")
    val locationName: kotlin.String? = null,
    /* Timezone name. */
    @Json(name = "timezone")
    val timezone: kotlin.String? = null,
    /* The event's website, if any. */
    @Json(name = "website")
    val website: kotlin.String? = null,
    /* The FIRST internal Event ID, used to link to the event on the FRC webpage. */
    @Json(name = "first_event_id")
    val firstEventId: kotlin.String? = null,
    /* Public facing event code used by FIRST (on frc-events.firstinspires.org, for example) */
    @Json(name = "first_event_code")
    val firstEventCode: kotlin.String? = null,
    @Json(name = "webcasts")
    val webcasts: kotlin.collections.List<Webcast>? = null,
    /* An array of event keys for the divisions at this event. */
    @Json(name = "division_keys")
    val divisionKeys: kotlin.collections.List<kotlin.String>? = null,
    /* The TBA Event key that represents the event's parent. Used to link back to the event from a division event. It is also the inverse relation of `divison_keys`. */
    @Json(name = "parent_event_key")
    val parentEventKey: kotlin.String? = null,
    /* Playoff Type, as defined here: https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/playoff_type.py#L4, or null. */
    @Json(name = "playoff_type")
    val playoffType: kotlin.Int? = null,
    /* String representation of the `playoff_type`, or null. */
    @Json(name = "playoff_type_string")
    val playoffTypeString: kotlin.String? = null
) 



