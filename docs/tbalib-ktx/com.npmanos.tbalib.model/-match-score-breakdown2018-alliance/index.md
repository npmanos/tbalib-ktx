[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [MatchScoreBreakdown2018Alliance](./index.md)

# MatchScoreBreakdown2018Alliance

`data class MatchScoreBreakdown2018Alliance`

### Parameters

`adjustPoints` -

`autoOwnershipPoints` -

`autoPoints` -

`autoQuestRankingPoint` -

`autoRobot1` -

`autoRobot2` -

`autoRobot3` -

`autoRunPoints` -

`autoScaleOwnershipSec` -

`autoSwitchAtZero` -

`autoSwitchOwnershipSec` -

`endgamePoints` -

`endgameRobot1` -

`endgameRobot2` -

`endgameRobot3` -

`faceTheBossRankingPoint` -

`foulCount` -

`foulPoints` -

`rp` -

`techFoulCount` -

`teleopOwnershipPoints` -

`teleopPoints` -

`teleopScaleBoostSec` -

`teleopScaleForceSec` -

`teleopScaleOwnershipSec` -

`teleopSwitchBoostSec` -

`teleopSwitchForceSec` -

`teleopSwitchOwnershipSec` -

`totalPoints` -

`vaultBoostPlayed` -

`vaultBoostTotal` -

`vaultForcePlayed` -

`vaultForceTotal` -

`vaultLevitatePlayed` -

`vaultLevitateTotal` -

`vaultPoints` -

`tbaGameData` - Unofficial TBA-computed value of the FMS provided GameData given to the alliance teams at the start of the match. 3 Character String containing `L` and `R` only. The first character represents the near switch, the 2nd the scale, and the 3rd the far, opposing, switch from the alliance's perspective. An `L` in a position indicates the platform on the left will be lit for the alliance while an `R` will indicate the right platform will be lit for the alliance. See also [WPI Screen Steps](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/826278-2018-game-data-details).

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `MatchScoreBreakdown2018Alliance(adjustPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, autoOwnershipPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, autoPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, autoQuestRankingPoint: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, autoRobot1: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, autoRobot2: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, autoRobot3: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, autoRunPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, autoScaleOwnershipSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, autoSwitchAtZero: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, autoSwitchOwnershipSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, endgamePoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, endgameRobot1: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, endgameRobot2: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, endgameRobot3: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, faceTheBossRankingPoint: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`? = null, foulCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, foulPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, rp: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, techFoulCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teleopOwnershipPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teleopPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teleopScaleBoostSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teleopScaleForceSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teleopScaleOwnershipSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teleopSwitchBoostSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teleopSwitchForceSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, teleopSwitchOwnershipSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, totalPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, vaultBoostPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, vaultBoostTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, vaultForcePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, vaultForceTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, vaultLevitatePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, vaultLevitateTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, vaultPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, tbaGameData: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [adjustPoints](adjust-points.md) | `val adjustPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [autoOwnershipPoints](auto-ownership-points.md) | `val autoOwnershipPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [autoPoints](auto-points.md) | `val autoPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [autoQuestRankingPoint](auto-quest-ranking-point.md) | `val autoQuestRankingPoint: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [autoRobot1](auto-robot1.md) | `val autoRobot1: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [autoRobot2](auto-robot2.md) | `val autoRobot2: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [autoRobot3](auto-robot3.md) | `val autoRobot3: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [autoRunPoints](auto-run-points.md) | `val autoRunPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [autoScaleOwnershipSec](auto-scale-ownership-sec.md) | `val autoScaleOwnershipSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [autoSwitchAtZero](auto-switch-at-zero.md) | `val autoSwitchAtZero: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [autoSwitchOwnershipSec](auto-switch-ownership-sec.md) | `val autoSwitchOwnershipSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [endgamePoints](endgame-points.md) | `val endgamePoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [endgameRobot1](endgame-robot1.md) | `val endgameRobot1: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [endgameRobot2](endgame-robot2.md) | `val endgameRobot2: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [endgameRobot3](endgame-robot3.md) | `val endgameRobot3: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [faceTheBossRankingPoint](face-the-boss-ranking-point.md) | `val faceTheBossRankingPoint: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`?` |
| [foulCount](foul-count.md) | `val foulCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [foulPoints](foul-points.md) | `val foulPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [rp](rp.md) | `val rp: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [tbaGameData](tba-game-data.md) | Unofficial TBA-computed value of the FMS provided GameData given to the alliance teams at the start of the match. 3 Character String containing `L` and `R` only. The first character represents the near switch, the 2nd the scale, and the 3rd the far, opposing, switch from the alliance's perspective. An `L` in a position indicates the platform on the left will be lit for the alliance while an `R` will indicate the right platform will be lit for the alliance. See also [WPI Screen Steps](https://wpilib.screenstepslive.com/s/currentCS/m/getting_started/l/826278-2018-game-data-details).`val tbaGameData: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [techFoulCount](tech-foul-count.md) | `val techFoulCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teleopOwnershipPoints](teleop-ownership-points.md) | `val teleopOwnershipPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teleopPoints](teleop-points.md) | `val teleopPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teleopScaleBoostSec](teleop-scale-boost-sec.md) | `val teleopScaleBoostSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teleopScaleForceSec](teleop-scale-force-sec.md) | `val teleopScaleForceSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teleopScaleOwnershipSec](teleop-scale-ownership-sec.md) | `val teleopScaleOwnershipSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teleopSwitchBoostSec](teleop-switch-boost-sec.md) | `val teleopSwitchBoostSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teleopSwitchForceSec](teleop-switch-force-sec.md) | `val teleopSwitchForceSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [teleopSwitchOwnershipSec](teleop-switch-ownership-sec.md) | `val teleopSwitchOwnershipSec: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [totalPoints](total-points.md) | `val totalPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [vaultBoostPlayed](vault-boost-played.md) | `val vaultBoostPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [vaultBoostTotal](vault-boost-total.md) | `val vaultBoostTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [vaultForcePlayed](vault-force-played.md) | `val vaultForcePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [vaultForceTotal](vault-force-total.md) | `val vaultForceTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [vaultLevitatePlayed](vault-levitate-played.md) | `val vaultLevitatePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [vaultLevitateTotal](vault-levitate-total.md) | `val vaultLevitateTotal: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [vaultPoints](vault-points.md) | `val vaultPoints: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
