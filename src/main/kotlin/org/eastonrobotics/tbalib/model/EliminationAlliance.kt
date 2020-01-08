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

import org.eastonrobotics.tbalib.model.EliminationAllianceBackup
import org.eastonrobotics.tbalib.model.EliminationAllianceStatus

import com.squareup.moshi.Json
/**
 * 
 * @param picks List of team keys picked for the alliance. First pick is captain.
 * @param name Alliance name, may be null.
 * @param backup 
 * @param declines List of teams that declined the alliance.
 * @param status 
 */

data class EliminationAlliance (
    /* List of team keys picked for the alliance. First pick is captain. */
    @Json(name = "picks")
    val picks: kotlin.collections.List<kotlin.String>,
    /* Alliance name, may be null. */
    @Json(name = "name")
    val name: kotlin.String? = null,
    @Json(name = "backup")
    val backup: EliminationAllianceBackup? = null,
    /* List of teams that declined the alliance. */
    @Json(name = "declines")
    val declines: kotlin.collections.List<kotlin.String>? = null,
    @Json(name = "status")
    val status: EliminationAllianceStatus? = null
) 



