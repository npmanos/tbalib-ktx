[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [MatchTimeseries2018](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`MatchTimeseries2018(@Json("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("match_id") matchId: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("mode") mode: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("play") play: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("time_remaining") timeRemaining: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_auto_quest") blueAutoQuest: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_boost_count") blueBoostCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_boost_played") blueBoostPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_current_powerup") blueCurrentPowerup: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("blue_face_the_boss") blueFaceTheBoss: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_force_count") blueForceCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_force_played") blueForcePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_levitate_count") blueLevitateCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_levitate_played") blueLevitatePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_powerup_time_remaining") bluePowerupTimeRemaining: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("blue_scale_owned") blueScaleOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_score") blueScore: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("blue_switch_owned") blueSwitchOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_auto_quest") redAutoQuest: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_boost_count") redBoostCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_boost_played") redBoostPlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_current_powerup") redCurrentPowerup: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("red_face_the_boss") redFaceTheBoss: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_force_count") redForceCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_force_played") redForcePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_levitate_count") redLevitateCount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_levitate_played") redLevitatePlayed: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_powerup_time_remaining") redPowerupTimeRemaining: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, @Json("red_scale_owned") redScaleOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_score") redScore: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null, @Json("red_switch_owned") redSwitchOwned: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)`

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