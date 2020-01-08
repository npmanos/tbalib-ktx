[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [EliminationAlliance](./index.md)

# EliminationAlliance

`data class EliminationAlliance`

### Parameters

`picks` - List of team keys picked for the alliance. First pick is captain.

`name` - Alliance name, may be null.

`backup` -

`declines` - List of teams that declined the alliance.

`status` -

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `EliminationAlliance(picks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>, name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, backup: `[`EliminationAllianceBackup`](../-elimination-alliance-backup/index.md)`? = null, declines: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>? = null, status: `[`EliminationAllianceStatus`](../-elimination-alliance-status/index.md)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [backup](backup.md) | `val backup: `[`EliminationAllianceBackup`](../-elimination-alliance-backup/index.md)`?` |
| [declines](declines.md) | List of teams that declined the alliance.`val declines: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>?` |
| [name](name.md) | Alliance name, may be null.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [picks](picks.md) | List of team keys picked for the alliance. First pick is captain.`val picks: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>` |
| [status](status.md) | `val status: `[`EliminationAllianceStatus`](../-elimination-alliance-status/index.md)`?` |
