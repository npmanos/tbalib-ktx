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

import org.eastonrobotics.tbalib.model.TeamEventStatusAlliance
import org.eastonrobotics.tbalib.model.TeamEventStatusPlayoff
import org.eastonrobotics.tbalib.model.TeamEventStatusRank

import com.squareup.moshi.Json
/**
 * 
 * @param qual 
 * @param alliance 
 * @param playoff 
 * @param allianceStatusStr An HTML formatted string suitable for display to the user containing the team's alliance pick status.
 * @param playoffStatusStr An HTML formatter string suitable for display to the user containing the team's playoff status.
 * @param overallStatusStr An HTML formatted string suitable for display to the user containing the team's overall status summary of the event.
 * @param nextMatchKey TBA match key for the next match the team is scheduled to play in at this event, or null.
 * @param lastMatchKey TBA match key for the last match the team played in at this event, or null.
 */

data class TeamEventStatus (
    @Json(name = "qual")
    val qual: TeamEventStatusRank? = null,
    @Json(name = "alliance")
    val alliance: TeamEventStatusAlliance? = null,
    @Json(name = "playoff")
    val playoff: TeamEventStatusPlayoff? = null,
    /* An HTML formatted string suitable for display to the user containing the team's alliance pick status. */
    @Json(name = "alliance_status_str")
    val allianceStatusStr: kotlin.String? = null,
    /* An HTML formatter string suitable for display to the user containing the team's playoff status. */
    @Json(name = "playoff_status_str")
    val playoffStatusStr: kotlin.String? = null,
    /* An HTML formatted string suitable for display to the user containing the team's overall status summary of the event. */
    @Json(name = "overall_status_str")
    val overallStatusStr: kotlin.String? = null,
    /* TBA match key for the next match the team is scheduled to play in at this event, or null. */
    @Json(name = "next_match_key")
    val nextMatchKey: kotlin.String? = null,
    /* TBA match key for the last match the team played in at this event, or null. */
    @Json(name = "last_match_key")
    val lastMatchKey: kotlin.String? = null
) 



