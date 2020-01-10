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
 * A Win-Loss-Tie record for a team, or an alliance.
 * @param losses Number of losses.
 * @param wins Number of wins.
 * @param ties Number of ties.
 */

data class WLTRecord (
    /* Number of losses. */
    val losses: kotlin.Int,
    /* Number of wins. */
    val wins: kotlin.Int,
    /* Number of ties. */
    val ties: kotlin.Int
) 



