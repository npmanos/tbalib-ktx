[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventInsights2017](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`EventInsights2017(@Json("average_foul_score") averageFoulScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_fuel_points") averageFuelPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_fuel_points_auto") averageFuelPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_fuel_points_teleop") averageFuelPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_high_goals") averageHighGoals: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_high_goals_auto") averageHighGoalsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_high_goals_teleop") averageHighGoalsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_low_goals") averageLowGoals: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_low_goals_auto") averageLowGoalsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_low_goals_teleop") averageLowGoalsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_mobility_points_auto") averageMobilityPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_points_auto") averagePointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_points_teleop") averagePointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_rotor_points") averageRotorPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_rotor_points_auto") averageRotorPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_rotor_points_teleop") averageRotorPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_score") averageScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_takeoff_points_teleop") averageTakeoffPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_win_margin") averageWinMargin: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_win_score") averageWinScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("high_kpa") highKpa: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, @Json("high_score") highScore: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, @Json("kpa_achieved") kpaAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("mobility_counts") mobilityCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("rotor_1_engaged") rotor1Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("rotor_1_engaged_auto") rotor1EngagedAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("rotor_2_engaged") rotor2Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("rotor_2_engaged_auto") rotor2EngagedAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("rotor_3_engaged") rotor3Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("rotor_4_engaged") rotor4Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("takeoff_counts") takeoffCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("unicorn_matches") unicornMatches: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>)`

Insights for FIRST STEAMWORKS qualification and elimination matches.

### Parameters

`averageFoulScore` - Average foul score.

`averageFuelPoints` - Average fuel points scored.

`averageFuelPointsAuto` - Average fuel points scored during auto.

`averageFuelPointsTeleop` - Average fuel points scored during teleop.

`averageHighGoals` - Average points scored in the high goal.

`averageHighGoalsAuto` - Average points scored in the high goal during auto.

`averageHighGoalsTeleop` - Average points scored in the high goal during teleop.

`averageLowGoals` - Average points scored in the low goal.

`averageLowGoalsAuto` - Average points scored in the low goal during auto.

`averageLowGoalsTeleop` - Average points scored in the low goal during teleop.

`averageMobilityPointsAuto` - Average mobility points scored during auto.

`averagePointsAuto` - Average points scored during auto.

`averagePointsTeleop` - Average points scored during teleop.

`averageRotorPoints` - Average rotor points scored.

`averageRotorPointsAuto` - Average rotor points scored during auto.

`averageRotorPointsTeleop` - Average rotor points scored during teleop.

`averageScore` - Average score.

`averageTakeoffPointsTeleop` - Average takeoff points scored during teleop.

`averageWinMargin` - Average margin of victory.

`averageWinScore` - Average winning score.

`highKpa` - An array with three values, kPa scored, match key from the match with the high kPa, and the name of the match

`highScore` - An array with three values, high score, match key from the match with the high score, and the name of the match

`kpaAchieved` - An array with three values, number of times kPa bonus achieved, number of opportunities to bonus, and percentage.

`mobilityCounts` - An array with three values, number of times mobility bonus achieved, number of opportunities to bonus, and percentage.

`rotor1Engaged` - An array with three values, number of times rotor 1 engaged, number of opportunities to engage, and percentage.

`rotor1EngagedAuto` - An array with three values, number of times rotor 1 engaged in auto, number of opportunities to engage in auto, and percentage.

`rotor2Engaged` - An array with three values, number of times rotor 2 engaged, number of opportunities to engage, and percentage.

`rotor2EngagedAuto` - An array with three values, number of times rotor 2 engaged in auto, number of opportunities to engage in auto, and percentage.

`rotor3Engaged` - An array with three values, number of times rotor 3 engaged, number of opportunities to engage, and percentage.

`rotor4Engaged` - An array with three values, number of times rotor 4 engaged, number of opportunities to engage, and percentage.

`takeoffCounts` - An array with three values, number of times takeoff was counted, number of opportunities to takeoff, and percentage.

`unicornMatches` - An array with three values, number of times a unicorn match (Win + kPa &amp; Rotor Bonuses) occured, number of opportunities to have a unicorn match, and percentage.