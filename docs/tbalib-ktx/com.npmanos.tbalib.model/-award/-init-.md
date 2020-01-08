[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [Award](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`Award(@Json("name") name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("award_type") awardType: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, @Json("event_key") eventKey: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, @Json("recipient_list") recipientList: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`AwardRecipient`](../-award-recipient/index.md)`>, @Json("year") year: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`)`

### Parameters

`name` - The name of the award as provided by FIRST. May vary for the same award type.

`awardType` - Type of award given. See https://github.com/the-blue-alliance/the-blue-alliance/blob/master/consts/award_type.py#L6

`eventKey` - The event_key of the event the award was won at.

`recipientList` - A list of recipients of the award at the event. May have either a team_key or an awardee, both, or neither (in the case the award wasn't awarded at the event).

`year` - The year this award was won.