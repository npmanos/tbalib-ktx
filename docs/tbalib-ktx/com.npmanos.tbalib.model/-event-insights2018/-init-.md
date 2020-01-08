[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EventInsights2018](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`EventInsights2018(@Json("auto_quest_achieved") autoQuestAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("average_boost_played") averageBoostPlayed: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_endgame_points") averageEndgamePoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_force_played") averageForcePlayed: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_foul_score") averageFoulScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_points_auto") averagePointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_points_teleop") averagePointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_run_points_auto") averageRunPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_scale_ownership_points") averageScaleOwnershipPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_scale_ownership_points_auto") averageScaleOwnershipPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_scale_ownership_points_teleop") averageScaleOwnershipPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_score") averageScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_switch_ownership_points") averageSwitchOwnershipPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_switch_ownership_points_auto") averageSwitchOwnershipPointsAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_switch_ownership_points_teleop") averageSwitchOwnershipPointsTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_vault_points") averageVaultPoints: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_win_margin") averageWinMargin: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("average_win_score") averageWinScore: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("boost_played_counts") boostPlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("climb_counts") climbCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("face_the_boss_achieved") faceTheBossAchieved: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("force_played_counts") forcePlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("high_score") highScore: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, @Json("levitate_played_counts") levitatePlayedCounts: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("run_counts_auto") runCountsAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("scale_neutral_percentage") scaleNeutralPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("scale_neutral_percentage_auto") scaleNeutralPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("scale_neutral_percentage_teleop") scaleNeutralPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("switch_owned_counts_auto") switchOwnedCountsAuto: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("unicorn_matches") unicornMatches: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`>, @Json("winning_opp_switch_denial_percentage_teleop") winningOppSwitchDenialPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("winning_own_switch_ownership_percentage") winningOwnSwitchOwnershipPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("winning_own_switch_ownership_percentage_auto") winningOwnSwitchOwnershipPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("winning_own_switch_ownership_percentage_teleop") winningOwnSwitchOwnershipPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("winning_scale_ownership_percentage") winningScaleOwnershipPercentage: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("winning_scale_ownership_percentage_auto") winningScaleOwnershipPercentageAuto: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`, @Json("winning_scale_ownership_percentage_teleop") winningScaleOwnershipPercentageTeleop: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)`)`

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