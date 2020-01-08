[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [AwardRecipient](./index.md)

# AwardRecipient

`data class AwardRecipient`

An `Award_Recipient` object represents the team and/or person who received an award at an event.

### Parameters

`teamKey` - The TBA team key for the team that was given the award. May be null.

`awardee` - The name of the individual given the award. May be null.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | An `Award_Recipient` object represents the team and/or person who received an award at an event.`AwardRecipient(teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null, awardee: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`? = null)` |

### Properties

| Name | Summary |
|---|---|
| [awardee](awardee.md) | The name of the individual given the award. May be null.`val awardee: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
| [teamKey](team-key.md) | The TBA team key for the team that was given the award. May be null.`val teamKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`?` |
