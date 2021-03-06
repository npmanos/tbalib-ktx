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
 * @param matchesPlayed Number of matches played by this team.
 * @param record 
 * @param rank The team's rank at the event as provided by FIRST.
 * @param dq Number of times disqualified.
 * @param teamKey The team with this rank.
 * @param qualAverage The average match score during qualifications. Year specific. May be null if not relevant for a given year.
 * @param extraStats Additional special data on the team's performance calculated by TBA.
 * @param sortOrders Additional year-specific information, may be null. See parent `sort_order_info` for details.
 */

data class EventRankingRankings (
    /* Number of matches played by this team. */
    val matchesPlayed: kotlin.Int,
    val record: WLTRecord,
    /* The team's rank at the event as provided by FIRST. */
    val rank: kotlin.Int,
    /* Number of times disqualified. */
    val dq: kotlin.Int,
    /* The team with this rank. */
    val teamKey: kotlin.String,
    /* The average match score during qualifications. Year specific. May be null if not relevant for a given year. */
    val qualAverage: kotlin.Int? = null,
    /* Additional special data on the team's performance calculated by TBA. */
    val extraStats: kotlin.collections.List<java.math.BigDecimal>? = null,
    /* Additional year-specific information, may be null. See parent `sort_order_info` for details. */
    val sortOrders: kotlin.collections.List<java.math.BigDecimal>? = null
) 



