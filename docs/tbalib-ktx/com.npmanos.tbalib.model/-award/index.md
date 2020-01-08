[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Award](./index.md)

# Award

`data class Award`

### Parameters

`name` - The name of the award as provided by FIRST. May vary for the same award type.

`awardType` - Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6

`eventKey` - The event_key of the event the award was won at.

`recipientList` - A list of recipients of the award at the event. May have either a team_key or an awardee, both, or neither (in the case the award wasn't awarded at the event).

`year` - The year this award was won.

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `Award(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, awardType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, recipientList: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`AwardRecipient`](../-award-recipient/index.md)`>, year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)` |

### Properties

| Name | Summary |
|---|---|
| [awardType](award-type.md) | Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6`val awardType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [eventKey](event-key.md) | The event_key of the event the award was won at.`val eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [name](name.md) | The name of the award as provided by FIRST. May vary for the same award type.`val name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [recipientList](recipient-list.md) | A list of recipients of the award at the event. May have either a team_key or an awardee, both, or neither (in the case the award wasn't awarded at the event).`val recipientList: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`AwardRecipient`](../-award-recipient/index.md)`>` |
| [year](year.md) | The year this award was won.`val year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
