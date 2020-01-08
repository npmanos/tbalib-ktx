[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamEventStatusAlliance](./index.md)

# TeamEventStatusAlliance

`data class TeamEventStatusAlliance`

### Parameters

`number` - Alliance number.

`pick` - Order the team was picked in the alliance from 0-2, with 0 being alliance captain.

`name` - Alliance name, may be null.

`backup` -

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `TeamEventStatusAlliance(number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, pick: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, backup: `[`TeamEventStatusAllianceBackup`](../-team-event-status-alliance-backup/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [backup](backup.md) | `val backup: `[`TeamEventStatusAllianceBackup`](../-team-event-status-alliance-backup/index.md)`?` |
| [name](name.md) | Alliance name, may be null.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [number](number.md) | Alliance number.`val number: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [pick](pick.md) | Order the team was picked in the alliance from 0-2, with 0 being alliance captain.`val pick: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
