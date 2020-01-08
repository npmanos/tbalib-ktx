[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [MatchTimeseries2018](./index.md)

# MatchTimeseries2018

`data class MatchTimeseries2018`

Timeseries data for the 2018 game *FIRST* POWER UP. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This model is currently under active development and may change at any time, including in breaking ways.

### Parameters

`eventKey` - TBA event key with the format yyyy[EVENT_CODE](#), where yyyy is the year, and EVENT_CODE is the event code of the event.

`matchId` - Match ID consisting of the level, match number, and set number, eg `qm45` or `f1m1`.

`mode` - Current mode of play, can be `pre_match`, `auto`, `telop`, or `post_match`.

`play` -

`timeRemaining` - Amount of time remaining in the match, only valid during `auto` and `teleop` modes.

`blueAutoQuest` - 1 if the blue alliance is credited with the AUTO QUEST, 0 if not.

`blueBoostCount` - Number of POWER CUBES in the BOOST section of the blue alliance VAULT.

`blueBoostPlayed` - Returns 1 if the blue alliance BOOST was played, or 0 if not played.

`blueCurrentPowerup` - Name of the current blue alliance POWER UP being played, or `null`.

`blueFaceTheBoss` - 1 if the blue alliance is credited with FACING THE BOSS, 0 if not.

`blueForceCount` - Number of POWER CUBES in the FORCE section of the blue alliance VAULT.

`blueForcePlayed` - Returns 1 if the blue alliance FORCE was played, or 0 if not played.

`blueLevitateCount` - Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT.

`blueLevitatePlayed` - Returns 1 if the blue alliance LEVITATE was played, or 0 if not played.

`bluePowerupTimeRemaining` - Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active.

`blueScaleOwned` - 1 if the blue alliance owns the SCALE, 0 if not.

`blueScore` - Current score for the blue alliance.

`blueSwitchOwned` - 1 if the blue alliance owns their SWITCH, 0 if not.

`redAutoQuest` - 1 if the red alliance is credited with the AUTO QUEST, 0 if not.

`redBoostCount` - Number of POWER CUBES in the BOOST section of the red alliance VAULT.

`redBoostPlayed` - Returns 1 if the red alliance BOOST was played, or 0 if not played.

`redCurrentPowerup` - Name of the current red alliance POWER UP being played, or `null`.

`redFaceTheBoss` - 1 if the red alliance is credited with FACING THE BOSS, 0 if not.

`redForceCount` - Number of POWER CUBES in the FORCE section of the red alliance VAULT.

`redForcePlayed` - Returns 1 if the red alliance FORCE was played, or 0 if not played.

`redLevitateCount` - Number of POWER CUBES in the LEVITATE section of the red alliance VAULT.

`redLevitatePlayed` - Returns 1 if the red alliance LEVITATE was played, or 0 if not played.

`redPowerupTimeRemaining` - Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active.

`redScaleOwned` - 1 if the red alliance owns the SCALE, 0 if not.

`redScore` - Current score for the red alliance.

`redSwitchOwned` - 1 if the red alliance owns their SWITCH, 0 if not.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Timeseries data for the 2018 game *FIRST* POWER UP. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This model is currently under active development and may change at any time, including in breaking ways.`MatchTimeseries2018(eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, matchId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, mode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, play: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, timeRemaining: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueAutoQuest: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueBoostCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueBoostPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueCurrentPowerup: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, blueFaceTheBoss: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueForceCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueForcePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueLevitateCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueLevitatePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, bluePowerupTimeRemaining: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, blueScaleOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueScore: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, blueSwitchOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redAutoQuest: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redBoostCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redBoostPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redCurrentPowerup: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, redFaceTheBoss: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redForceCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redForcePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redLevitateCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redLevitatePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redPowerupTimeRemaining: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, redScaleOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redScore: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, redSwitchOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [blueAutoQuest](blue-auto-quest.md) | 1 if the blue alliance is credited with the AUTO QUEST, 0 if not.`val blueAutoQuest: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueBoostCount](blue-boost-count.md) | Number of POWER CUBES in the BOOST section of the blue alliance VAULT.`val blueBoostCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueBoostPlayed](blue-boost-played.md) | Returns 1 if the blue alliance BOOST was played, or 0 if not played.`val blueBoostPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueCurrentPowerup](blue-current-powerup.md) | Name of the current blue alliance POWER UP being played, or `null`.`val blueCurrentPowerup: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [blueFaceTheBoss](blue-face-the-boss.md) | 1 if the blue alliance is credited with FACING THE BOSS, 0 if not.`val blueFaceTheBoss: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueForceCount](blue-force-count.md) | Number of POWER CUBES in the FORCE section of the blue alliance VAULT.`val blueForceCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueForcePlayed](blue-force-played.md) | Returns 1 if the blue alliance FORCE was played, or 0 if not played.`val blueForcePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueLevitateCount](blue-levitate-count.md) | Number of POWER CUBES in the LEVITATE section of the blue alliance VAULT.`val blueLevitateCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueLevitatePlayed](blue-levitate-played.md) | Returns 1 if the blue alliance LEVITATE was played, or 0 if not played.`val blueLevitatePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [bluePowerupTimeRemaining](blue-powerup-time-remaining.md) | Number of seconds remaining in the blue alliance POWER UP time, or 0 if none is active.`val bluePowerupTimeRemaining: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [blueScaleOwned](blue-scale-owned.md) | 1 if the blue alliance owns the SCALE, 0 if not.`val blueScaleOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueScore](blue-score.md) | Current score for the blue alliance.`val blueScore: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [blueSwitchOwned](blue-switch-owned.md) | 1 if the blue alliance owns their SWITCH, 0 if not.`val blueSwitchOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [eventKey](event-key.md) | TBA event key with the format yyyy[EVENT_CODE](#), where yyyy is the year, and EVENT_CODE is the event code of the event.`val eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [matchId](match-id.md) | Match ID consisting of the level, match number, and set number, eg `qm45` or `f1m1`.`val matchId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [mode](mode.md) | Current mode of play, can be `pre_match`, `auto`, `telop`, or `post_match`.`val mode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [play](play.md) | `val play: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redAutoQuest](red-auto-quest.md) | 1 if the red alliance is credited with the AUTO QUEST, 0 if not.`val redAutoQuest: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redBoostCount](red-boost-count.md) | Number of POWER CUBES in the BOOST section of the red alliance VAULT.`val redBoostCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redBoostPlayed](red-boost-played.md) | Returns 1 if the red alliance BOOST was played, or 0 if not played.`val redBoostPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redCurrentPowerup](red-current-powerup.md) | Name of the current red alliance POWER UP being played, or `null`.`val redCurrentPowerup: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [redFaceTheBoss](red-face-the-boss.md) | 1 if the red alliance is credited with FACING THE BOSS, 0 if not.`val redFaceTheBoss: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redForceCount](red-force-count.md) | Number of POWER CUBES in the FORCE section of the red alliance VAULT.`val redForceCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redForcePlayed](red-force-played.md) | Returns 1 if the red alliance FORCE was played, or 0 if not played.`val redForcePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redLevitateCount](red-levitate-count.md) | Number of POWER CUBES in the LEVITATE section of the red alliance VAULT.`val redLevitateCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redLevitatePlayed](red-levitate-played.md) | Returns 1 if the red alliance LEVITATE was played, or 0 if not played.`val redLevitatePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redPowerupTimeRemaining](red-powerup-time-remaining.md) | Number of seconds remaining in the red alliance POWER UP time, or 0 if none is active.`val redPowerupTimeRemaining: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [redScaleOwned](red-scale-owned.md) | 1 if the red alliance owns the SCALE, 0 if not.`val redScaleOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redScore](red-score.md) | Current score for the red alliance.`val redScore: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [redSwitchOwned](red-switch-owned.md) | 1 if the red alliance owns their SWITCH, 0 if not.`val redSwitchOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [timeRemaining](time-remaining.md) | Amount of time remaining in the match, only valid during `auto` and `teleop` modes.`val timeRemaining: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
