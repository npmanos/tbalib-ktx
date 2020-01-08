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


import com.squareup.moshi.Json
/**
 * An `Award_Recipient` object represents the team and/or person who received an award at an event.
 * @param teamKey The TBA team key for the team that was given the award. May be null.
 * @param awardee The name of the individual given the award. May be null.
 */

data class AwardRecipient (
    /* The TBA team key for the team that was given the award. May be null. */
    @Json(name = "team_key")
    val teamKey: kotlin.String? = null,
    /* The name of the individual given the award. May be null. */
    @Json(name = "awardee")
    val awardee: kotlin.String? = null
) 



