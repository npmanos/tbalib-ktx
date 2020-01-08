[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamEventStatusPlayoff](./index.md)

# TeamEventStatusPlayoff

`data class TeamEventStatusPlayoff`

Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.

### Parameters

`level` - The highest playoff level the team reached.

`currentLevelRecord` -

`record` -

`status` - Current competition status for the playoffs.

`playoffAverage` - The average match score during playoffs. Year specific. May be null if not relevant for a given year.

### Types

| Name | Summary |
|---|---|
| [Level](-level/index.md) | The highest playoff level the team reached. Values: qm,ef,qf,sf,f`enum class Level` |
| [Status](-status/index.md) | Current competition status for the playoffs. Values: won,eliminated,playing`enum class Status` |

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.`TeamEventStatusPlayoff(level: Level? = null, currentLevelRecord: `[`WLTRecord`](../-w-l-t-record/index.md)`? = null, record: `[`WLTRecord`](../-w-l-t-record/index.md)`? = null, status: Status? = null, playoffAverage: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [currentLevelRecord](current-level-record.md) | `val currentLevelRecord: `[`WLTRecord`](../-w-l-t-record/index.md)`?` |
| [level](level.md) | The highest playoff level the team reached.`val level: Level?` |
| [playoffAverage](playoff-average.md) | The average match score during playoffs. Year specific. May be null if not relevant for a given year.`val playoffAverage: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`?` |
| [record](record.md) | `val record: `[`WLTRecord`](../-w-l-t-record/index.md)`?` |
| [status](status.md) | Current competition status for the playoffs.`val status: Status?` |
