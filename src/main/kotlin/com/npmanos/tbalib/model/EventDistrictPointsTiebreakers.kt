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
package com.npmanos.tbalib.model


/**
 * 
 * @param highestQualScores 
 * @param qualWins 
 */

data class EventDistrictPointsTiebreakers (
    val highestQualScores: kotlin.collections.List<kotlin.Int>? = null,
    val qualWins: kotlin.Int? = null
) 



