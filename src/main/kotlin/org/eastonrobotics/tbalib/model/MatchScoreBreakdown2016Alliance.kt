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
 * 
 * @param autoPoints 
 * @param teleopPoints 
 * @param breachPoints 
 * @param foulPoints 
 * @param capturePoints 
 * @param adjustPoints 
 * @param totalPoints 
 * @param robot1Auto 
 * @param robot2Auto 
 * @param robot3Auto 
 * @param autoReachPoints 
 * @param autoCrossingPoints 
 * @param autoBouldersLow 
 * @param autoBouldersHigh 
 * @param autoBoulderPoints 
 * @param teleopCrossingPoints 
 * @param teleopBouldersLow 
 * @param teleopBouldersHigh 
 * @param teleopBoulderPoints 
 * @param teleopDefensesBreached 
 * @param teleopChallengePoints 
 * @param teleopScalePoints 
 * @param teleopTowerCaptured 
 * @param towerFaceA 
 * @param towerFaceB 
 * @param towerFaceC 
 * @param towerEndStrength 
 * @param techFoulCount 
 * @param foulCount 
 * @param position2 
 * @param position3 
 * @param position4 
 * @param position5 
 * @param position1crossings 
 * @param position2crossings 
 * @param position3crossings 
 * @param position4crossings 
 * @param position5crossings 
 */

data class MatchScoreBreakdown2016Alliance (
    @Json(name = "autoPoints")
    val autoPoints: kotlin.Int? = null,
    @Json(name = "teleopPoints")
    val teleopPoints: kotlin.Int? = null,
    @Json(name = "breachPoints")
    val breachPoints: kotlin.Int? = null,
    @Json(name = "foulPoints")
    val foulPoints: kotlin.Int? = null,
    @Json(name = "capturePoints")
    val capturePoints: kotlin.Int? = null,
    @Json(name = "adjustPoints")
    val adjustPoints: kotlin.Int? = null,
    @Json(name = "totalPoints")
    val totalPoints: kotlin.Int? = null,
    @Json(name = "robot1Auto")
    val robot1Auto: MatchScoreBreakdown2016Alliance.Robot1Auto? = null,
    @Json(name = "robot2Auto")
    val robot2Auto: MatchScoreBreakdown2016Alliance.Robot2Auto? = null,
    @Json(name = "robot3Auto")
    val robot3Auto: MatchScoreBreakdown2016Alliance.Robot3Auto? = null,
    @Json(name = "autoReachPoints")
    val autoReachPoints: kotlin.Int? = null,
    @Json(name = "autoCrossingPoints")
    val autoCrossingPoints: kotlin.Int? = null,
    @Json(name = "autoBouldersLow")
    val autoBouldersLow: kotlin.Int? = null,
    @Json(name = "autoBouldersHigh")
    val autoBouldersHigh: kotlin.Int? = null,
    @Json(name = "autoBoulderPoints")
    val autoBoulderPoints: kotlin.Int? = null,
    @Json(name = "teleopCrossingPoints")
    val teleopCrossingPoints: kotlin.Int? = null,
    @Json(name = "teleopBouldersLow")
    val teleopBouldersLow: kotlin.Int? = null,
    @Json(name = "teleopBouldersHigh")
    val teleopBouldersHigh: kotlin.Int? = null,
    @Json(name = "teleopBoulderPoints")
    val teleopBoulderPoints: kotlin.Int? = null,
    @Json(name = "teleopDefensesBreached")
    val teleopDefensesBreached: kotlin.Boolean? = null,
    @Json(name = "teleopChallengePoints")
    val teleopChallengePoints: kotlin.Int? = null,
    @Json(name = "teleopScalePoints")
    val teleopScalePoints: kotlin.Int? = null,
    @Json(name = "teleopTowerCaptured")
    val teleopTowerCaptured: kotlin.Int? = null,
    @Json(name = "towerFaceA")
    val towerFaceA: kotlin.String? = null,
    @Json(name = "towerFaceB")
    val towerFaceB: kotlin.String? = null,
    @Json(name = "towerFaceC")
    val towerFaceC: kotlin.String? = null,
    @Json(name = "towerEndStrength")
    val towerEndStrength: kotlin.Int? = null,
    @Json(name = "techFoulCount")
    val techFoulCount: kotlin.Int? = null,
    @Json(name = "foulCount")
    val foulCount: kotlin.Int? = null,
    @Json(name = "position2")
    val position2: kotlin.String? = null,
    @Json(name = "position3")
    val position3: kotlin.String? = null,
    @Json(name = "position4")
    val position4: kotlin.String? = null,
    @Json(name = "position5")
    val position5: kotlin.String? = null,
    @Json(name = "position1crossings")
    val position1crossings: kotlin.Int? = null,
    @Json(name = "position2crossings")
    val position2crossings: kotlin.Int? = null,
    @Json(name = "position3crossings")
    val position3crossings: kotlin.Int? = null,
    @Json(name = "position4crossings")
    val position4crossings: kotlin.Int? = null,
    @Json(name = "position5crossings")
    val position5crossings: kotlin.Int? = null
) 


{
    /**
    * 
    * Values: crossed,reached,none
    */
    
    enum class Robot1Auto(val value: kotlin.String){
        @Json(name = "Crossed") crossed("Crossed"),
        @Json(name = "Reached") reached("Reached"),
        @Json(name = "None") none("None");
    }
    /**
    * 
    * Values: crossed,reached,none
    */
    
    enum class Robot2Auto(val value: kotlin.String){
        @Json(name = "Crossed") crossed("Crossed"),
        @Json(name = "Reached") reached("Reached"),
        @Json(name = "None") none("None");
    }
    /**
    * 
    * Values: crossed,reached,none
    */
    
    enum class Robot3Auto(val value: kotlin.String){
        @Json(name = "Crossed") crossed("Crossed"),
        @Json(name = "Reached") reached("Reached"),
        @Json(name = "None") none("None");
    }
}

