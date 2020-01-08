[tbalib-ktx](../../index.md) / [com.npmanos.tbalib.model](../index.md) / [TeamEventStatusPlayoff](index.md) / [&lt;init&gt;](./-init-.md)

# &lt;init&gt;

`TeamEventStatusPlayoff(@Json("level") level: Level? = null, @Json("current_level_record") currentLevelRecord: `[`WLTRecord`](../-w-l-t-record/index.md)`? = null, @Json("record") record: `[`WLTRecord`](../-w-l-t-record/index.md)`? = null, @Json("status") status: Status? = null, @Json("playoff_average") playoffAverage: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`? = null)`

Playoff status for this team, may be null if the team did not make playoffs, or playoffs have not begun.

### Parameters

`level` - The highest playoff level the team reached.

`currentLevelRecord` -

`record` -

`status` - Current competition status for the playoffs.

`playoffAverage` - The average match score during playoffs. Year specific. May be null if not relevant for a given year.