[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventInsights2017](./index.md)

# EventInsights2017

`data class EventInsights2017`

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

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Insights for FIRST STEAMWORKS qualification and elimination matches.`EventInsights2017(averageFoulScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageFuelPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageFuelPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageFuelPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageHighGoals: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageHighGoalsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageHighGoalsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageLowGoals: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageLowGoalsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageLowGoalsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageMobilityPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averagePointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averagePointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageRotorPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageRotorPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageRotorPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageTakeoffPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageWinMargin: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageWinScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, highKpa: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, highScore: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, kpaAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, mobilityCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, rotor1Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, rotor1EngagedAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, rotor2Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, rotor2EngagedAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, rotor3Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, rotor4Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, takeoffCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, unicornMatches: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>)` |

### Properties

| Name | Summary |
|---|---|
| [averageFoulScore](average-foul-score.md) | Average foul score.`val averageFoulScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageFuelPoints](average-fuel-points.md) | Average fuel points scored.`val averageFuelPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageFuelPointsAuto](average-fuel-points-auto.md) | Average fuel points scored during auto.`val averageFuelPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageFuelPointsTeleop](average-fuel-points-teleop.md) | Average fuel points scored during teleop.`val averageFuelPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageHighGoals](average-high-goals.md) | Average points scored in the high goal.`val averageHighGoals: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageHighGoalsAuto](average-high-goals-auto.md) | Average points scored in the high goal during auto.`val averageHighGoalsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageHighGoalsTeleop](average-high-goals-teleop.md) | Average points scored in the high goal during teleop.`val averageHighGoalsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageLowGoals](average-low-goals.md) | Average points scored in the low goal.`val averageLowGoals: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageLowGoalsAuto](average-low-goals-auto.md) | Average points scored in the low goal during auto.`val averageLowGoalsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageLowGoalsTeleop](average-low-goals-teleop.md) | Average points scored in the low goal during teleop.`val averageLowGoalsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageMobilityPointsAuto](average-mobility-points-auto.md) | Average mobility points scored during auto.`val averageMobilityPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averagePointsAuto](average-points-auto.md) | Average points scored during auto.`val averagePointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averagePointsTeleop](average-points-teleop.md) | Average points scored during teleop.`val averagePointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageRotorPoints](average-rotor-points.md) | Average rotor points scored.`val averageRotorPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageRotorPointsAuto](average-rotor-points-auto.md) | Average rotor points scored during auto.`val averageRotorPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageRotorPointsTeleop](average-rotor-points-teleop.md) | Average rotor points scored during teleop.`val averageRotorPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageScore](average-score.md) | Average score.`val averageScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageTakeoffPointsTeleop](average-takeoff-points-teleop.md) | Average takeoff points scored during teleop.`val averageTakeoffPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageWinMargin](average-win-margin.md) | Average margin of victory.`val averageWinMargin: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageWinScore](average-win-score.md) | Average winning score.`val averageWinScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [highKpa](high-kpa.md) | An array with three values, kPa scored, match key from the match with the high kPa, and the name of the match`val highKpa: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [highScore](high-score.md) | An array with three values, high score, match key from the match with the high score, and the name of the match`val highScore: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [kpaAchieved](kpa-achieved.md) | An array with three values, number of times kPa bonus achieved, number of opportunities to bonus, and percentage.`val kpaAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [mobilityCounts](mobility-counts.md) | An array with three values, number of times mobility bonus achieved, number of opportunities to bonus, and percentage.`val mobilityCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [rotor1Engaged](rotor1-engaged.md) | An array with three values, number of times rotor 1 engaged, number of opportunities to engage, and percentage.`val rotor1Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [rotor1EngagedAuto](rotor1-engaged-auto.md) | An array with three values, number of times rotor 1 engaged in auto, number of opportunities to engage in auto, and percentage.`val rotor1EngagedAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [rotor2Engaged](rotor2-engaged.md) | An array with three values, number of times rotor 2 engaged, number of opportunities to engage, and percentage.`val rotor2Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [rotor2EngagedAuto](rotor2-engaged-auto.md) | An array with three values, number of times rotor 2 engaged in auto, number of opportunities to engage in auto, and percentage.`val rotor2EngagedAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [rotor3Engaged](rotor3-engaged.md) | An array with three values, number of times rotor 3 engaged, number of opportunities to engage, and percentage.`val rotor3Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [rotor4Engaged](rotor4-engaged.md) | An array with three values, number of times rotor 4 engaged, number of opportunities to engage, and percentage.`val rotor4Engaged: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [takeoffCounts](takeoff-counts.md) | An array with three values, number of times takeoff was counted, number of opportunities to takeoff, and percentage.`val takeoffCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [unicornMatches](unicorn-matches.md) | An array with three values, number of times a unicorn match (Win + kPa &amp; Rotor Bonuses) occured, number of opportunities to have a unicorn match, and percentage.`val unicornMatches: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
