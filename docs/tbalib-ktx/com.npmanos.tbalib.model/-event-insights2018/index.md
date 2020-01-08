[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventInsights2018](./index.md)

# EventInsights2018

`data class EventInsights2018`

Insights for FIRST Power Up qualification and elimination matches.

### Parameters

`autoQuestAchieved` - An array with three values, number of times auto quest was completed, number of opportunities to complete the auto quest, and percentage.

`averageBoostPlayed` - Average number of boost power up scored (out of 3).

`averageEndgamePoints` - Average endgame points.

`averageForcePlayed` - Average number of force power up scored (out of 3).

`averageFoulScore` - Average foul score.

`averagePointsAuto` - Average points scored during auto.

`averagePointsTeleop` - Average points scored during teleop.

`averageRunPointsAuto` - Average mobility points scored during auto.

`averageScaleOwnershipPoints` - Average scale ownership points scored.

`averageScaleOwnershipPointsAuto` - Average scale ownership points scored during auto.

`averageScaleOwnershipPointsTeleop` - Average scale ownership points scored during teleop.

`averageScore` - Average score.

`averageSwitchOwnershipPoints` - Average switch ownership points scored.

`averageSwitchOwnershipPointsAuto` - Average switch ownership points scored during auto.

`averageSwitchOwnershipPointsTeleop` - Average switch ownership points scored during teleop.

`averageVaultPoints` - Average value points scored.

`averageWinMargin` - Average margin of victory.

`averageWinScore` - Average winning score.

`boostPlayedCounts` - An array with three values, number of times a boost power up was played, number of opportunities to play a boost power up, and percentage.

`climbCounts` - An array with three values, number of times a climb occurred, number of opportunities to climb, and percentage.

`faceTheBossAchieved` - An array with three values, number of times an alliance faced the boss, number of opportunities to face the boss, and percentage.

`forcePlayedCounts` - An array with three values, number of times a force power up was played, number of opportunities to play a force power up, and percentage.

`highScore` - An array with three values, high score, match key from the match with the high score, and the name of the match

`levitatePlayedCounts` - An array with three values, number of times a levitate power up was played, number of opportunities to play a levitate power up, and percentage.

`runCountsAuto` - An array with three values, number of times a team scored mobility points in auto, number of opportunities to score mobility points in auto, and percentage.

`scaleNeutralPercentage` - Average scale neutral percentage.

`scaleNeutralPercentageAuto` - Average scale neutral percentage during auto.

`scaleNeutralPercentageTeleop` - Average scale neutral percentage during teleop.

`switchOwnedCountsAuto` - An array with three values, number of times a switch was owned during auto, number of opportunities to own a switch during auto, and percentage.

`unicornMatches` - An array with three values, number of times a unicorn match (Win + Auto Quest + Face the Boss) occurred, number of opportunities to have a unicorn match, and percentage.

`winningOppSwitchDenialPercentageTeleop` - Average opposing switch denail percentage for the winning alliance during teleop.

`winningOwnSwitchOwnershipPercentage` - Average own switch ownership percentage for the winning alliance.

`winningOwnSwitchOwnershipPercentageAuto` - Average own switch ownership percentage for the winning alliance during auto.

`winningOwnSwitchOwnershipPercentageTeleop` - Average own switch ownership percentage for the winning alliance during teleop.

`winningScaleOwnershipPercentage` - Average scale ownership percentage for the winning alliance.

`winningScaleOwnershipPercentageAuto` - Average scale ownership percentage for the winning alliance during auto.

`winningScaleOwnershipPercentageTeleop` - Average scale ownership percentage for the winning alliance during teleop.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Insights for FIRST Power Up qualification and elimination matches.`EventInsights2018(autoQuestAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, averageBoostPlayed: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageEndgamePoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageForcePlayed: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageFoulScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averagePointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averagePointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageRunPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageScaleOwnershipPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageScaleOwnershipPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageScaleOwnershipPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageSwitchOwnershipPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageSwitchOwnershipPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageSwitchOwnershipPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageVaultPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageWinMargin: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, averageWinScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, boostPlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, climbCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, faceTheBossAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, forcePlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, highScore: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, levitatePlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, runCountsAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, scaleNeutralPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, scaleNeutralPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, scaleNeutralPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, switchOwnedCountsAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, unicornMatches: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, winningOppSwitchDenialPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, winningOwnSwitchOwnershipPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, winningOwnSwitchOwnershipPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, winningOwnSwitchOwnershipPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, winningScaleOwnershipPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, winningScaleOwnershipPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, winningScaleOwnershipPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [autoQuestAchieved](auto-quest-achieved.md) | An array with three values, number of times auto quest was completed, number of opportunities to complete the auto quest, and percentage.`val autoQuestAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [averageBoostPlayed](average-boost-played.md) | Average number of boost power up scored (out of 3).`val averageBoostPlayed: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageEndgamePoints](average-endgame-points.md) | Average endgame points.`val averageEndgamePoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageForcePlayed](average-force-played.md) | Average number of force power up scored (out of 3).`val averageForcePlayed: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageFoulScore](average-foul-score.md) | Average foul score.`val averageFoulScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averagePointsAuto](average-points-auto.md) | Average points scored during auto.`val averagePointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averagePointsTeleop](average-points-teleop.md) | Average points scored during teleop.`val averagePointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageRunPointsAuto](average-run-points-auto.md) | Average mobility points scored during auto.`val averageRunPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageScaleOwnershipPoints](average-scale-ownership-points.md) | Average scale ownership points scored.`val averageScaleOwnershipPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageScaleOwnershipPointsAuto](average-scale-ownership-points-auto.md) | Average scale ownership points scored during auto.`val averageScaleOwnershipPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageScaleOwnershipPointsTeleop](average-scale-ownership-points-teleop.md) | Average scale ownership points scored during teleop.`val averageScaleOwnershipPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageScore](average-score.md) | Average score.`val averageScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageSwitchOwnershipPoints](average-switch-ownership-points.md) | Average switch ownership points scored.`val averageSwitchOwnershipPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageSwitchOwnershipPointsAuto](average-switch-ownership-points-auto.md) | Average switch ownership points scored during auto.`val averageSwitchOwnershipPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageSwitchOwnershipPointsTeleop](average-switch-ownership-points-teleop.md) | Average switch ownership points scored during teleop.`val averageSwitchOwnershipPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageVaultPoints](average-vault-points.md) | Average value points scored.`val averageVaultPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageWinMargin](average-win-margin.md) | Average margin of victory.`val averageWinMargin: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [averageWinScore](average-win-score.md) | Average winning score.`val averageWinScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [boostPlayedCounts](boost-played-counts.md) | An array with three values, number of times a boost power up was played, number of opportunities to play a boost power up, and percentage.`val boostPlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [climbCounts](climb-counts.md) | An array with three values, number of times a climb occurred, number of opportunities to climb, and percentage.`val climbCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [faceTheBossAchieved](face-the-boss-achieved.md) | An array with three values, number of times an alliance faced the boss, number of opportunities to face the boss, and percentage.`val faceTheBossAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [forcePlayedCounts](force-played-counts.md) | An array with three values, number of times a force power up was played, number of opportunities to play a force power up, and percentage.`val forcePlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [highScore](high-score.md) | An array with three values, high score, match key from the match with the high score, and the name of the match`val highScore: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [levitatePlayedCounts](levitate-played-counts.md) | An array with three values, number of times a levitate power up was played, number of opportunities to play a levitate power up, and percentage.`val levitatePlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [runCountsAuto](run-counts-auto.md) | An array with three values, number of times a team scored mobility points in auto, number of opportunities to score mobility points in auto, and percentage.`val runCountsAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [scaleNeutralPercentage](scale-neutral-percentage.md) | Average scale neutral percentage.`val scaleNeutralPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [scaleNeutralPercentageAuto](scale-neutral-percentage-auto.md) | Average scale neutral percentage during auto.`val scaleNeutralPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [scaleNeutralPercentageTeleop](scale-neutral-percentage-teleop.md) | Average scale neutral percentage during teleop.`val scaleNeutralPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [switchOwnedCountsAuto](switch-owned-counts-auto.md) | An array with three values, number of times a switch was owned during auto, number of opportunities to own a switch during auto, and percentage.`val switchOwnedCountsAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [unicornMatches](unicorn-matches.md) | An array with three values, number of times a unicorn match (Win + Auto Quest + Face the Boss) occurred, number of opportunities to have a unicorn match, and percentage.`val unicornMatches: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>` |
| [winningOppSwitchDenialPercentageTeleop](winning-opp-switch-denial-percentage-teleop.md) | Average opposing switch denail percentage for the winning alliance during teleop.`val winningOppSwitchDenialPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [winningOwnSwitchOwnershipPercentage](winning-own-switch-ownership-percentage.md) | Average own switch ownership percentage for the winning alliance.`val winningOwnSwitchOwnershipPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [winningOwnSwitchOwnershipPercentageAuto](winning-own-switch-ownership-percentage-auto.md) | Average own switch ownership percentage for the winning alliance during auto.`val winningOwnSwitchOwnershipPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [winningOwnSwitchOwnershipPercentageTeleop](winning-own-switch-ownership-percentage-teleop.md) | Average own switch ownership percentage for the winning alliance during teleop.`val winningOwnSwitchOwnershipPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [winningScaleOwnershipPercentage](winning-scale-ownership-percentage.md) | Average scale ownership percentage for the winning alliance.`val winningScaleOwnershipPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [winningScaleOwnershipPercentageAuto](winning-scale-ownership-percentage-auto.md) | Average scale ownership percentage for the winning alliance during auto.`val winningScaleOwnershipPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [winningScaleOwnershipPercentageTeleop](winning-scale-ownership-percentage-teleop.md) | Average scale ownership percentage for the winning alliance during teleop.`val winningScaleOwnershipPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
