# com.npmanos.tbalib - Kotlin client library for The Blue Alliance API v3

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.
* Requires a Blue Alliance API Key. If you do not have an auth key yet, you can obtain one by following the instructions [here](https://www.thebluealliance.com/apidocs#apiv3).

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://www.thebluealliance.com/api/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DistrictApiService* | [**getDistrictEvents**](docs/DistrictApiService.md#getdistrictevents) | **GET** /district/{district_key}/events | Gets a list of events in the given district.
*DistrictApiService* | [**getDistrictEventsKeys**](docs/DistrictApiService.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | Gets a list of event keys for events in the given district.
*DistrictApiService* | [**getDistrictEventsSimple**](docs/DistrictApiService.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | Gets a short-form list of events in the given district.
*DistrictApiService* | [**getDistrictRankings**](docs/DistrictApiService.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | Gets a list of team district rankings for the given district.
*DistrictApiService* | [**getDistrictTeams**](docs/DistrictApiService.md#getdistrictteams) | **GET** /district/{district_key}/teams | Gets a list of `Team` objects that competed in events in the given district.
*DistrictApiService* | [**getDistrictTeamsKeys**](docs/DistrictApiService.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | Gets a list of `Team` objects that competed in events in the given district.
*DistrictApiService* | [**getDistrictTeamsSimple**](docs/DistrictApiService.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | Gets a short-form list of `Team` objects that competed in events in the given district.
*DistrictApiService* | [**getDistrictsByYear**](docs/DistrictApiService.md#getdistrictsbyyear) | **GET** /districts/{year} | Gets a list of districts and their corresponding district key, for the given year.
*DistrictApiService* | [**getEventDistrictPoints**](docs/DistrictApiService.md#geteventdistrictpoints) | **GET** /event/{event_key}/district_points | Gets a list of team rankings for the Event.
*DistrictApiService* | [**getTeamDistricts**](docs/DistrictApiService.md#getteamdistricts) | **GET** /team/{team_key}/districts | Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.
*EventApiService* | [**getDistrictEvents**](docs/EventApiService.md#getdistrictevents) | **GET** /district/{district_key}/events | Gets a list of events in the given district.
*EventApiService* | [**getDistrictEventsKeys**](docs/EventApiService.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | Gets a list of event keys for events in the given district.
*EventApiService* | [**getDistrictEventsSimple**](docs/EventApiService.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | Gets a short-form list of events in the given district.
*EventApiService* | [**getEvent**](docs/EventApiService.md#getevent) | **GET** /event/{event_key} | Gets an Event.
*EventApiService* | [**getEventAlliances**](docs/EventApiService.md#geteventalliances) | **GET** /event/{event_key}/alliances | Gets a list of Elimination Alliances for the given Event.
*EventApiService* | [**getEventAwards**](docs/EventApiService.md#geteventawards) | **GET** /event/{event_key}/awards | Gets a list of awards from the given event.
*EventApiService* | [**getEventDistrictPoints**](docs/EventApiService.md#geteventdistrictpoints) | **GET** /event/{event_key}/district_points | Gets a list of team rankings for the Event.
*EventApiService* | [**getEventInsights**](docs/EventApiService.md#geteventinsights) | **GET** /event/{event_key}/insights | Gets a set of Event-specific insights for the given Event.
*EventApiService* | [**getEventMatchTimeseries**](docs/EventApiService.md#geteventmatchtimeseries) | **GET** /event/{event_key}/matches/timeseries | Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.
*EventApiService* | [**getEventMatches**](docs/EventApiService.md#geteventmatches) | **GET** /event/{event_key}/matches | Gets a list of matches for the given event.
*EventApiService* | [**getEventMatchesKeys**](docs/EventApiService.md#geteventmatcheskeys) | **GET** /event/{event_key}/matches/keys | Gets a list of match keys for the given event.
*EventApiService* | [**getEventMatchesSimple**](docs/EventApiService.md#geteventmatchessimple) | **GET** /event/{event_key}/matches/simple | Gets a short-form list of matches for the given event.
*EventApiService* | [**getEventOPRs**](docs/EventApiService.md#geteventoprs) | **GET** /event/{event_key}/oprs | Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.
*EventApiService* | [**getEventPredictions**](docs/EventApiService.md#geteventpredictions) | **GET** /event/{event_key}/predictions | Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.
*EventApiService* | [**getEventRankings**](docs/EventApiService.md#geteventrankings) | **GET** /event/{event_key}/rankings | Gets a list of team rankings for the Event.
*EventApiService* | [**getEventSimple**](docs/EventApiService.md#geteventsimple) | **GET** /event/{event_key}/simple | Gets a short-form Event.
*EventApiService* | [**getEventTeams**](docs/EventApiService.md#geteventteams) | **GET** /event/{event_key}/teams | Gets a list of `Team` objects that competed in the given event.
*EventApiService* | [**getEventTeamsKeys**](docs/EventApiService.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | Gets a list of `Team` keys that competed in the given event.
*EventApiService* | [**getEventTeamsSimple**](docs/EventApiService.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | Gets a short-form list of `Team` objects that competed in the given event.
*EventApiService* | [**getEventTeamsStatuses**](docs/EventApiService.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | Gets a key-value list of the event statuses for teams competing at the given event.
*EventApiService* | [**getEventsByYear**](docs/EventApiService.md#geteventsbyyear) | **GET** /events/{year} | Gets a list of events in the given year.
*EventApiService* | [**getEventsByYearKeys**](docs/EventApiService.md#geteventsbyyearkeys) | **GET** /events/{year}/keys | Gets a list of event keys in the given year.
*EventApiService* | [**getEventsByYearSimple**](docs/EventApiService.md#geteventsbyyearsimple) | **GET** /events/{year}/simple | Gets a short-form list of events in the given year.
*EventApiService* | [**getTeamEventAwards**](docs/EventApiService.md#getteameventawards) | **GET** /team/{team_key}/event/{event_key}/awards | Gets a list of awards the given team won at the given event.
*EventApiService* | [**getTeamEventMatches**](docs/EventApiService.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | Gets a list of matches for the given team and event.
*EventApiService* | [**getTeamEventMatchesKeys**](docs/EventApiService.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | Gets a list of match keys for matches for the given team and event.
*EventApiService* | [**getTeamEventMatchesSimple**](docs/EventApiService.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | Gets a short-form list of matches for the given team and event.
*EventApiService* | [**getTeamEventStatus**](docs/EventApiService.md#getteameventstatus) | **GET** /team/{team_key}/event/{event_key}/status | Gets the competition rank and status of the team at the given event.
*EventApiService* | [**getTeamEvents**](docs/EventApiService.md#getteamevents) | **GET** /team/{team_key}/events | Gets a list of all events this team has competed at.
*EventApiService* | [**getTeamEventsByYear**](docs/EventApiService.md#getteameventsbyyear) | **GET** /team/{team_key}/events/{year} | Gets a list of events this team has competed at in the given year.
*EventApiService* | [**getTeamEventsByYearKeys**](docs/EventApiService.md#getteameventsbyyearkeys) | **GET** /team/{team_key}/events/{year}/keys | Gets a list of the event keys for events this team has competed at in the given year.
*EventApiService* | [**getTeamEventsByYearSimple**](docs/EventApiService.md#getteameventsbyyearsimple) | **GET** /team/{team_key}/events/{year}/simple | Gets a short-form list of events this team has competed at in the given year.
*EventApiService* | [**getTeamEventsKeys**](docs/EventApiService.md#getteameventskeys) | **GET** /team/{team_key}/events/keys | Gets a list of the event keys for all events this team has competed at.
*EventApiService* | [**getTeamEventsSimple**](docs/EventApiService.md#getteameventssimple) | **GET** /team/{team_key}/events/simple | Gets a short-form list of all events this team has competed at.
*EventApiService* | [**getTeamEventsStatusesByYear**](docs/EventApiService.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | Gets a key-value list of the event statuses for events this team has competed at in the given year.
*ListApiService* | [**getDistrictEvents**](docs/ListApiService.md#getdistrictevents) | **GET** /district/{district_key}/events | Gets a list of events in the given district.
*ListApiService* | [**getDistrictEventsKeys**](docs/ListApiService.md#getdistricteventskeys) | **GET** /district/{district_key}/events/keys | Gets a list of event keys for events in the given district.
*ListApiService* | [**getDistrictEventsSimple**](docs/ListApiService.md#getdistricteventssimple) | **GET** /district/{district_key}/events/simple | Gets a short-form list of events in the given district.
*ListApiService* | [**getDistrictRankings**](docs/ListApiService.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | Gets a list of team district rankings for the given district.
*ListApiService* | [**getDistrictTeams**](docs/ListApiService.md#getdistrictteams) | **GET** /district/{district_key}/teams | Gets a list of `Team` objects that competed in events in the given district.
*ListApiService* | [**getDistrictTeamsKeys**](docs/ListApiService.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | Gets a list of `Team` objects that competed in events in the given district.
*ListApiService* | [**getDistrictTeamsSimple**](docs/ListApiService.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | Gets a short-form list of `Team` objects that competed in events in the given district.
*ListApiService* | [**getEventTeams**](docs/ListApiService.md#geteventteams) | **GET** /event/{event_key}/teams | Gets a list of `Team` objects that competed in the given event.
*ListApiService* | [**getEventTeamsKeys**](docs/ListApiService.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | Gets a list of `Team` keys that competed in the given event.
*ListApiService* | [**getEventTeamsSimple**](docs/ListApiService.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | Gets a short-form list of `Team` objects that competed in the given event.
*ListApiService* | [**getEventTeamsStatuses**](docs/ListApiService.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | Gets a key-value list of the event statuses for teams competing at the given event.
*ListApiService* | [**getEventsByYear**](docs/ListApiService.md#geteventsbyyear) | **GET** /events/{year} | Gets a list of events in the given year.
*ListApiService* | [**getEventsByYearKeys**](docs/ListApiService.md#geteventsbyyearkeys) | **GET** /events/{year}/keys | Gets a list of event keys in the given year.
*ListApiService* | [**getEventsByYearSimple**](docs/ListApiService.md#geteventsbyyearsimple) | **GET** /events/{year}/simple | Gets a short-form list of events in the given year.
*ListApiService* | [**getTeamEventsStatusesByYear**](docs/ListApiService.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | Gets a key-value list of the event statuses for events this team has competed at in the given year.
*ListApiService* | [**getTeams**](docs/ListApiService.md#getteams) | **GET** /teams/{page_num} | Gets a list of `Team` objects, paginated in groups of 500.
*ListApiService* | [**getTeamsByYear**](docs/ListApiService.md#getteamsbyyear) | **GET** /teams/{year}/{page_num} | Gets a list of `Team` objects that competed in the given year, paginated in groups of 500.
*ListApiService* | [**getTeamsByYearKeys**](docs/ListApiService.md#getteamsbyyearkeys) | **GET** /teams/{year}/{page_num}/keys | Gets a list Team Keys that competed in the given year, paginated in groups of 500.
*ListApiService* | [**getTeamsByYearSimple**](docs/ListApiService.md#getteamsbyyearsimple) | **GET** /teams/{year}/{page_num}/simple | Gets a list of short form `Team_Simple` objects that competed in the given year, paginated in groups of 500.
*ListApiService* | [**getTeamsKeys**](docs/ListApiService.md#getteamskeys) | **GET** /teams/{page_num}/keys | Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)
*ListApiService* | [**getTeamsSimple**](docs/ListApiService.md#getteamssimple) | **GET** /teams/{page_num}/simple | Gets a list of short form `Team_Simple` objects, paginated in groups of 500.
*MatchApiService* | [**getEventMatchTimeseries**](docs/MatchApiService.md#geteventmatchtimeseries) | **GET** /event/{event_key}/matches/timeseries | Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.
*MatchApiService* | [**getEventMatches**](docs/MatchApiService.md#geteventmatches) | **GET** /event/{event_key}/matches | Gets a list of matches for the given event.
*MatchApiService* | [**getEventMatchesKeys**](docs/MatchApiService.md#geteventmatcheskeys) | **GET** /event/{event_key}/matches/keys | Gets a list of match keys for the given event.
*MatchApiService* | [**getEventMatchesSimple**](docs/MatchApiService.md#geteventmatchessimple) | **GET** /event/{event_key}/matches/simple | Gets a short-form list of matches for the given event.
*MatchApiService* | [**getMatch**](docs/MatchApiService.md#getmatch) | **GET** /match/{match_key} | Gets a `Match` object for the given match key.
*MatchApiService* | [**getMatchSimple**](docs/MatchApiService.md#getmatchsimple) | **GET** /match/{match_key}/simple | Gets a short-form `Match` object for the given match key.
*MatchApiService* | [**getMatchTimeseries**](docs/MatchApiService.md#getmatchtimeseries) | **GET** /match/{match_key}/timeseries | Gets an array of game-specific Match Timeseries objects for the given match key or an empty array if not available. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.
*MatchApiService* | [**getTeamEventMatches**](docs/MatchApiService.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | Gets a list of matches for the given team and event.
*MatchApiService* | [**getTeamEventMatchesKeys**](docs/MatchApiService.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | Gets a list of match keys for matches for the given team and event.
*MatchApiService* | [**getTeamEventMatchesSimple**](docs/MatchApiService.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | Gets a short-form list of matches for the given team and event.
*MatchApiService* | [**getTeamMatchesByYear**](docs/MatchApiService.md#getteammatchesbyyear) | **GET** /team/{team_key}/matches/{year} | Gets a list of matches for the given team and year.
*MatchApiService* | [**getTeamMatchesByYearKeys**](docs/MatchApiService.md#getteammatchesbyyearkeys) | **GET** /team/{team_key}/matches/{year}/keys | Gets a list of match keys for matches for the given team and year.
*MatchApiService* | [**getTeamMatchesByYearSimple**](docs/MatchApiService.md#getteammatchesbyyearsimple) | **GET** /team/{team_key}/matches/{year}/simple | Gets a short-form list of matches for the given team and year.
*TBAApiService* | [**getStatus**](docs/TBAApiService.md#getstatus) | **GET** /status | Returns API status, and TBA status information.
*TeamApiService* | [**getDistrictRankings**](docs/TeamApiService.md#getdistrictrankings) | **GET** /district/{district_key}/rankings | Gets a list of team district rankings for the given district.
*TeamApiService* | [**getDistrictTeams**](docs/TeamApiService.md#getdistrictteams) | **GET** /district/{district_key}/teams | Gets a list of `Team` objects that competed in events in the given district.
*TeamApiService* | [**getDistrictTeamsKeys**](docs/TeamApiService.md#getdistrictteamskeys) | **GET** /district/{district_key}/teams/keys | Gets a list of `Team` objects that competed in events in the given district.
*TeamApiService* | [**getDistrictTeamsSimple**](docs/TeamApiService.md#getdistrictteamssimple) | **GET** /district/{district_key}/teams/simple | Gets a short-form list of `Team` objects that competed in events in the given district.
*TeamApiService* | [**getEventTeams**](docs/TeamApiService.md#geteventteams) | **GET** /event/{event_key}/teams | Gets a list of `Team` objects that competed in the given event.
*TeamApiService* | [**getEventTeamsKeys**](docs/TeamApiService.md#geteventteamskeys) | **GET** /event/{event_key}/teams/keys | Gets a list of `Team` keys that competed in the given event.
*TeamApiService* | [**getEventTeamsSimple**](docs/TeamApiService.md#geteventteamssimple) | **GET** /event/{event_key}/teams/simple | Gets a short-form list of `Team` objects that competed in the given event.
*TeamApiService* | [**getEventTeamsStatuses**](docs/TeamApiService.md#geteventteamsstatuses) | **GET** /event/{event_key}/teams/statuses | Gets a key-value list of the event statuses for teams competing at the given event.
*TeamApiService* | [**getTeam**](docs/TeamApiService.md#getteam) | **GET** /team/{team_key} | Gets a `Team` object for the team referenced by the given key.
*TeamApiService* | [**getTeamAwards**](docs/TeamApiService.md#getteamawards) | **GET** /team/{team_key}/awards | Gets a list of awards the given team has won.
*TeamApiService* | [**getTeamAwardsByYear**](docs/TeamApiService.md#getteamawardsbyyear) | **GET** /team/{team_key}/awards/{year} | Gets a list of awards the given team has won in a given year.
*TeamApiService* | [**getTeamDistricts**](docs/TeamApiService.md#getteamdistricts) | **GET** /team/{team_key}/districts | Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.
*TeamApiService* | [**getTeamEventAwards**](docs/TeamApiService.md#getteameventawards) | **GET** /team/{team_key}/event/{event_key}/awards | Gets a list of awards the given team won at the given event.
*TeamApiService* | [**getTeamEventMatches**](docs/TeamApiService.md#getteameventmatches) | **GET** /team/{team_key}/event/{event_key}/matches | Gets a list of matches for the given team and event.
*TeamApiService* | [**getTeamEventMatchesKeys**](docs/TeamApiService.md#getteameventmatcheskeys) | **GET** /team/{team_key}/event/{event_key}/matches/keys | Gets a list of match keys for matches for the given team and event.
*TeamApiService* | [**getTeamEventMatchesSimple**](docs/TeamApiService.md#getteameventmatchessimple) | **GET** /team/{team_key}/event/{event_key}/matches/simple | Gets a short-form list of matches for the given team and event.
*TeamApiService* | [**getTeamEventStatus**](docs/TeamApiService.md#getteameventstatus) | **GET** /team/{team_key}/event/{event_key}/status | Gets the competition rank and status of the team at the given event.
*TeamApiService* | [**getTeamEvents**](docs/TeamApiService.md#getteamevents) | **GET** /team/{team_key}/events | Gets a list of all events this team has competed at.
*TeamApiService* | [**getTeamEventsByYear**](docs/TeamApiService.md#getteameventsbyyear) | **GET** /team/{team_key}/events/{year} | Gets a list of events this team has competed at in the given year.
*TeamApiService* | [**getTeamEventsByYearKeys**](docs/TeamApiService.md#getteameventsbyyearkeys) | **GET** /team/{team_key}/events/{year}/keys | Gets a list of the event keys for events this team has competed at in the given year.
*TeamApiService* | [**getTeamEventsByYearSimple**](docs/TeamApiService.md#getteameventsbyyearsimple) | **GET** /team/{team_key}/events/{year}/simple | Gets a short-form list of events this team has competed at in the given year.
*TeamApiService* | [**getTeamEventsKeys**](docs/TeamApiService.md#getteameventskeys) | **GET** /team/{team_key}/events/keys | Gets a list of the event keys for all events this team has competed at.
*TeamApiService* | [**getTeamEventsSimple**](docs/TeamApiService.md#getteameventssimple) | **GET** /team/{team_key}/events/simple | Gets a short-form list of all events this team has competed at.
*TeamApiService* | [**getTeamEventsStatusesByYear**](docs/TeamApiService.md#getteameventsstatusesbyyear) | **GET** /team/{team_key}/events/{year}/statuses | Gets a key-value list of the event statuses for events this team has competed at in the given year.
*TeamApiService* | [**getTeamMatchesByYear**](docs/TeamApiService.md#getteammatchesbyyear) | **GET** /team/{team_key}/matches/{year} | Gets a list of matches for the given team and year.
*TeamApiService* | [**getTeamMatchesByYearKeys**](docs/TeamApiService.md#getteammatchesbyyearkeys) | **GET** /team/{team_key}/matches/{year}/keys | Gets a list of match keys for matches for the given team and year.
*TeamApiService* | [**getTeamMatchesByYearSimple**](docs/TeamApiService.md#getteammatchesbyyearsimple) | **GET** /team/{team_key}/matches/{year}/simple | Gets a short-form list of matches for the given team and year.
*TeamApiService* | [**getTeamMediaByTag**](docs/TeamApiService.md#getteammediabytag) | **GET** /team/{team_key}/media/tag/{media_tag} | Gets a list of Media (videos / pictures) for the given team and tag.
*TeamApiService* | [**getTeamMediaByTagYear**](docs/TeamApiService.md#getteammediabytagyear) | **GET** /team/{team_key}/media/tag/{media_tag}/{year} | Gets a list of Media (videos / pictures) for the given team, tag and year.
*TeamApiService* | [**getTeamMediaByYear**](docs/TeamApiService.md#getteammediabyyear) | **GET** /team/{team_key}/media/{year} | Gets a list of Media (videos / pictures) for the given team and year.
*TeamApiService* | [**getTeamRobots**](docs/TeamApiService.md#getteamrobots) | **GET** /team/{team_key}/robots | Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.
*TeamApiService* | [**getTeamSimple**](docs/TeamApiService.md#getteamsimple) | **GET** /team/{team_key}/simple | Gets a `Team_Simple` object for the team referenced by the given key.
*TeamApiService* | [**getTeamSocialMedia**](docs/TeamApiService.md#getteamsocialmedia) | **GET** /team/{team_key}/social_media | Gets a list of Media (social media) for the given team.
*TeamApiService* | [**getTeamYearsParticipated**](docs/TeamApiService.md#getteamyearsparticipated) | **GET** /team/{team_key}/years_participated | Gets a list of years in which the team participated in at least one competition.
*TeamApiService* | [**getTeams**](docs/TeamApiService.md#getteams) | **GET** /teams/{page_num} | Gets a list of `Team` objects, paginated in groups of 500.
*TeamApiService* | [**getTeamsByYear**](docs/TeamApiService.md#getteamsbyyear) | **GET** /teams/{year}/{page_num} | Gets a list of `Team` objects that competed in the given year, paginated in groups of 500.
*TeamApiService* | [**getTeamsByYearKeys**](docs/TeamApiService.md#getteamsbyyearkeys) | **GET** /teams/{year}/{page_num}/keys | Gets a list Team Keys that competed in the given year, paginated in groups of 500.
*TeamApiService* | [**getTeamsByYearSimple**](docs/TeamApiService.md#getteamsbyyearsimple) | **GET** /teams/{year}/{page_num}/simple | Gets a list of short form `Team_Simple` objects that competed in the given year, paginated in groups of 500.
*TeamApiService* | [**getTeamsKeys**](docs/TeamApiService.md#getteamskeys) | **GET** /teams/{page_num}/keys | Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)
*TeamApiService* | [**getTeamsSimple**](docs/TeamApiService.md#getteamssimple) | **GET** /teams/{page_num}/simple | Gets a list of short form `Team_Simple` objects, paginated in groups of 500.


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.npmanos.tbalib.model.APIStatus](docs/APIStatus.md)
 - [com.npmanos.tbalib.model.APIStatusAppVersion](docs/APIStatusAppVersion.md)
 - [com.npmanos.tbalib.model.Award](docs/Award.md)
 - [com.npmanos.tbalib.model.AwardRecipient](docs/AwardRecipient.md)
 - [com.npmanos.tbalib.model.DistrictList](docs/DistrictList.md)
 - [com.npmanos.tbalib.model.DistrictRanking](docs/DistrictRanking.md)
 - [com.npmanos.tbalib.model.DistrictRankingEventPoints](docs/DistrictRankingEventPoints.md)
 - [com.npmanos.tbalib.model.EliminationAlliance](docs/EliminationAlliance.md)
 - [com.npmanos.tbalib.model.EliminationAllianceBackup](docs/EliminationAllianceBackup.md)
 - [com.npmanos.tbalib.model.EliminationAllianceStatus](docs/EliminationAllianceStatus.md)
 - [com.npmanos.tbalib.model.Event](docs/Event.md)
 - [com.npmanos.tbalib.model.EventDistrictPoints](docs/EventDistrictPoints.md)
 - [com.npmanos.tbalib.model.EventDistrictPointsPoints](docs/EventDistrictPointsPoints.md)
 - [com.npmanos.tbalib.model.EventDistrictPointsTiebreakers](docs/EventDistrictPointsTiebreakers.md)
 - [com.npmanos.tbalib.model.EventInsights](docs/EventInsights.md)
 - [com.npmanos.tbalib.model.EventInsights2016](docs/EventInsights2016.md)
 - [com.npmanos.tbalib.model.EventInsights2017](docs/EventInsights2017.md)
 - [com.npmanos.tbalib.model.EventInsights2018](docs/EventInsights2018.md)
 - [com.npmanos.tbalib.model.EventOPRs](docs/EventOPRs.md)
 - [com.npmanos.tbalib.model.EventRanking](docs/EventRanking.md)
 - [com.npmanos.tbalib.model.EventRankingExtraStatsInfo](docs/EventRankingExtraStatsInfo.md)
 - [com.npmanos.tbalib.model.EventRankingRankings](docs/EventRankingRankings.md)
 - [com.npmanos.tbalib.model.EventRankingSortOrderInfo](docs/EventRankingSortOrderInfo.md)
 - [com.npmanos.tbalib.model.EventSimple](docs/EventSimple.md)
 - [com.npmanos.tbalib.model.Match](docs/Match.md)
 - [com.npmanos.tbalib.model.MatchAlliance](docs/MatchAlliance.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2015](docs/MatchScoreBreakdown2015.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2015Alliance](docs/MatchScoreBreakdown2015Alliance.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2016](docs/MatchScoreBreakdown2016.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2016Alliance](docs/MatchScoreBreakdown2016Alliance.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2017](docs/MatchScoreBreakdown2017.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2017Alliance](docs/MatchScoreBreakdown2017Alliance.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2018](docs/MatchScoreBreakdown2018.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2018Alliance](docs/MatchScoreBreakdown2018Alliance.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2019](docs/MatchScoreBreakdown2019.md)
 - [com.npmanos.tbalib.model.MatchScoreBreakdown2019Alliance](docs/MatchScoreBreakdown2019Alliance.md)
 - [com.npmanos.tbalib.model.MatchSimple](docs/MatchSimple.md)
 - [com.npmanos.tbalib.model.MatchSimpleAlliances](docs/MatchSimpleAlliances.md)
 - [com.npmanos.tbalib.model.MatchTimeseries2018](docs/MatchTimeseries2018.md)
 - [com.npmanos.tbalib.model.MatchVideos](docs/MatchVideos.md)
 - [com.npmanos.tbalib.model.Media](docs/Media.md)
 - [com.npmanos.tbalib.model.Team](docs/Team.md)
 - [com.npmanos.tbalib.model.TeamEventStatus](docs/TeamEventStatus.md)
 - [com.npmanos.tbalib.model.TeamEventStatusAlliance](docs/TeamEventStatusAlliance.md)
 - [com.npmanos.tbalib.model.TeamEventStatusAllianceBackup](docs/TeamEventStatusAllianceBackup.md)
 - [com.npmanos.tbalib.model.TeamEventStatusPlayoff](docs/TeamEventStatusPlayoff.md)
 - [com.npmanos.tbalib.model.TeamEventStatusRank](docs/TeamEventStatusRank.md)
 - [com.npmanos.tbalib.model.TeamEventStatusRankRanking](docs/TeamEventStatusRankRanking.md)
 - [com.npmanos.tbalib.model.TeamEventStatusRankSortOrderInfo](docs/TeamEventStatusRankSortOrderInfo.md)
 - [com.npmanos.tbalib.model.TeamRobot](docs/TeamRobot.md)
 - [com.npmanos.tbalib.model.TeamSimple](docs/TeamSimple.md)
 - [com.npmanos.tbalib.model.WLTRecord](docs/WLTRecord.md)
 - [com.npmanos.tbalib.model.Webcast](docs/Webcast.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="apiKey"></a>
### apiKey

- **Type**: API key
- **API key parameter name**: X-TBA-Auth-Key
- **Location**: HTTP header
- **Usage**: Set [ApiClient](/src/main/kotlin/org/eastonrobotics/tbalib/infrastructure/ApiClient.kt).apiKey

