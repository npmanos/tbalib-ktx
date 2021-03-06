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
 * @param autoPoints 
 * @param teleopPoints 
 * @param foulPoints 
 * @param adjustPoints 
 * @param totalPoints 
 * @param robot1Auto 
 * @param robot2Auto 
 * @param robot3Auto 
 * @param rotor1Auto 
 * @param rotor2Auto 
 * @param autoFuelLow 
 * @param autoFuelHigh 
 * @param autoMobilityPoints 
 * @param autoRotorPoints 
 * @param autoFuelPoints 
 * @param teleopFuelPoints 
 * @param teleopFuelLow 
 * @param teleopFuelHigh 
 * @param teleopRotorPoints 
 * @param kPaRankingPointAchieved 
 * @param teleopTakeoffPoints 
 * @param kPaBonusPoints 
 * @param rotorBonusPoints 
 * @param rotor1Engaged 
 * @param rotor2Engaged 
 * @param rotor3Engaged 
 * @param rotor4Engaged 
 * @param rotorRankingPointAchieved 
 * @param techFoulCount 
 * @param foulCount 
 * @param touchpadNear 
 * @param touchpadMiddle 
 * @param touchpadFar 
 */

data class MatchScoreBreakdown2017Alliance (
    val autoPoints: kotlin.Int? = null,
    val teleopPoints: kotlin.Int? = null,
    val foulPoints: kotlin.Int? = null,
    val adjustPoints: kotlin.Int? = null,
    val totalPoints: kotlin.Int? = null,
    val robot1Auto: MatchScoreBreakdown2017Alliance.Robot1Auto? = null,
    val robot2Auto: MatchScoreBreakdown2017Alliance.Robot2Auto? = null,
    val robot3Auto: MatchScoreBreakdown2017Alliance.Robot3Auto? = null,
    val rotor1Auto: kotlin.Boolean? = null,
    val rotor2Auto: kotlin.Boolean? = null,
    val autoFuelLow: kotlin.Int? = null,
    val autoFuelHigh: kotlin.Int? = null,
    val autoMobilityPoints: kotlin.Int? = null,
    val autoRotorPoints: kotlin.Int? = null,
    val autoFuelPoints: kotlin.Int? = null,
    val teleopFuelPoints: kotlin.Int? = null,
    val teleopFuelLow: kotlin.Int? = null,
    val teleopFuelHigh: kotlin.Int? = null,
    val teleopRotorPoints: kotlin.Int? = null,
    val kPaRankingPointAchieved: kotlin.Boolean? = null,
    val teleopTakeoffPoints: kotlin.Int? = null,
    val kPaBonusPoints: kotlin.Int? = null,
    val rotorBonusPoints: kotlin.Int? = null,
    val rotor1Engaged: kotlin.Boolean? = null,
    val rotor2Engaged: kotlin.Boolean? = null,
    val rotor3Engaged: kotlin.Boolean? = null,
    val rotor4Engaged: kotlin.Boolean? = null,
    val rotorRankingPointAchieved: kotlin.Boolean? = null,
    val techFoulCount: kotlin.Int? = null,
    val foulCount: kotlin.Int? = null,
    val touchpadNear: kotlin.String? = null,
    val touchpadMiddle: kotlin.String? = null,
    val touchpadFar: kotlin.String? = null
) 


{
    /**
    * 
    * Values: unknown,mobility,none
    */

    enum class Robot1Auto(val value: kotlin.String)

    /**
    * 
    * Values: unknown,mobility,none
    */

    enum class Robot2Auto(val value: kotlin.String)

    /**
    * 
    * Values: unknown,mobility,none
    */

    enum class Robot3Auto(val value: kotlin.String)
}

