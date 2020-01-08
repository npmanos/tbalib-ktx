package com.npmanos.tbalib.api

import com.npmanos.tbalib.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import com.npmanos.tbalib.model.Award
import com.npmanos.tbalib.model.EliminationAlliance
import com.npmanos.tbalib.model.Event
import com.npmanos.tbalib.model.EventDistrictPoints
import com.npmanos.tbalib.model.EventInsights
import com.npmanos.tbalib.model.EventOPRs
import com.npmanos.tbalib.model.EventRanking
import com.npmanos.tbalib.model.EventSimple
import com.npmanos.tbalib.model.Match
import com.npmanos.tbalib.model.MatchSimple
import com.npmanos.tbalib.model.Team
import com.npmanos.tbalib.model.TeamEventStatus
import com.npmanos.tbalib.model.TeamSimple

interface EventApiService {
    /**
     * Gets a list of events in the given district.
     *
     * @param districtKey TBA District Key, eg `2016fim`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Event>>
     */
    @GET("/district/{district_key}/events")
    fun getDistrictEvents(@Path("district_key") districtKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Event>>

    /**
     * Gets a list of event keys for events in the given district.
     *
     * @param districtKey TBA District Key, eg `2016fim`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/district/{district_key}/events/keys")
    fun getDistrictEventsKeys(@Path("district_key") districtKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of events in the given district.
     *
     * @param districtKey TBA District Key, eg `2016fim`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<EventSimple>>
     */
    @GET("/district/{district_key}/events/simple")
    fun getDistrictEventsSimple(@Path("district_key") districtKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<EventSimple>>

    /**
     * Gets an Event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<Event>
     */
    @GET("/event/{event_key}")
    fun getEvent(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<Event>

    /**
     * Gets a list of Elimination Alliances for the given Event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<EliminationAlliance>>
     */
    @GET("/event/{event_key}/alliances")
    fun getEventAlliances(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<EliminationAlliance>>

    /**
     * Gets a list of awards from the given event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Award>>
     */
    @GET("/event/{event_key}/awards")
    fun getEventAwards(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Award>>

    /**
     * Gets a list of team rankings for the Event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<EventDistrictPoints>
     */
    @GET("/event/{event_key}/district_points")
    fun getEventDistrictPoints(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<EventDistrictPoints>

    /**
     * Gets a set of Event-specific insights for the given Event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<EventInsights>
     */
    @GET("/event/{event_key}/insights")
    fun getEventInsights(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<EventInsights>

    /**
     * Gets an array of Match Keys for the given event key that have timeseries data. Returns an empty array if no matches have timeseries data. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/event/{event_key}/matches/timeseries")
    fun getEventMatchTimeseries(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a list of matches for the given event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Match>>
     */
    @GET("/event/{event_key}/matches")
    fun getEventMatches(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Match>>

    /**
     * Gets a list of match keys for the given event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/event/{event_key}/matches/keys")
    fun getEventMatchesKeys(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of matches for the given event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<MatchSimple>>
     */
    @GET("/event/{event_key}/matches/simple")
    fun getEventMatchesSimple(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<MatchSimple>>

    /**
     * Gets a set of Event OPRs (including OPR, DPR, and CCWM) for the given Event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<EventOPRs>
     */
    @GET("/event/{event_key}/oprs")
    fun getEventOPRs(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<EventOPRs>

    /**
     * Gets information on TBA-generated predictions for the given Event. Contains year-specific information. *WARNING* This endpoint is currently under development and may change at any time.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.Any>
     */
    @GET("/event/{event_key}/predictions")
    fun getEventPredictions(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.Any>

    /**
     * Gets a list of team rankings for the Event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<EventRanking>
     */
    @GET("/event/{event_key}/rankings")
    fun getEventRankings(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<EventRanking>

    /**
     * Gets a short-form Event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<EventSimple>
     */
    @GET("/event/{event_key}/simple")
    fun getEventSimple(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<EventSimple>

    /**
     * Gets a list of `Team` objects that competed in the given event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Team>>
     */
    @GET("/event/{event_key}/teams")
    fun getEventTeams(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Team>>

    /**
     * Gets a list of `Team` keys that competed in the given event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/event/{event_key}/teams/keys")
    fun getEventTeamsKeys(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of `Team` objects that competed in the given event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<TeamSimple>>
     */
    @GET("/event/{event_key}/teams/simple")
    fun getEventTeamsSimple(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<TeamSimple>>

    /**
     * Gets a key-value list of the event statuses for teams competing at the given event.
     *
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.Map<kotlin.String, TeamEventStatus>>
     */
    @GET("/event/{event_key}/teams/statuses")
    fun getEventTeamsStatuses(@Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.Map<kotlin.String, TeamEventStatus>>

    /**
     * Gets a list of events in the given year.
     *
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Event>>
     */
    @GET("/events/{year}")
    fun getEventsByYear(@Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Event>>

    /**
     * Gets a list of event keys in the given year.
     *
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/events/{year}/keys")
    fun getEventsByYearKeys(@Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of events in the given year.
     *
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<EventSimple>>
     */
    @GET("/events/{year}/simple")
    fun getEventsByYearSimple(@Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<EventSimple>>

    /**
     * Gets a list of awards the given team won at the given event.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Award>>
     */
    @GET("/team/{team_key}/event/{event_key}/awards")
    fun getTeamEventAwards(@Path("team_key") teamKey: kotlin.String, @Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Award>>

    /**
     * Gets a list of matches for the given team and event.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Match>>
     */
    @GET("/team/{team_key}/event/{event_key}/matches")
    fun getTeamEventMatches(@Path("team_key") teamKey: kotlin.String, @Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Match>>

    /**
     * Gets a list of match keys for matches for the given team and event.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/team/{team_key}/event/{event_key}/matches/keys")
    fun getTeamEventMatchesKeys(@Path("team_key") teamKey: kotlin.String, @Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of matches for the given team and event.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Match>>
     */
    @GET("/team/{team_key}/event/{event_key}/matches/simple")
    fun getTeamEventMatchesSimple(@Path("team_key") teamKey: kotlin.String, @Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Match>>

    /**
     * Gets the competition rank and status of the team at the given event.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param eventKey TBA Event Key, eg `2016nytr`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<TeamEventStatus>
     */
    @GET("/team/{team_key}/event/{event_key}/status")
    fun getTeamEventStatus(@Path("team_key") teamKey: kotlin.String, @Path("event_key") eventKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<TeamEventStatus>

    /**
     * Gets a list of all events this team has competed at.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Event>>
     */
    @GET("/team/{team_key}/events")
    fun getTeamEvents(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Event>>

    /**
     * Gets a list of events this team has competed at in the given year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Event>>
     */
    @GET("/team/{team_key}/events/{year}")
    fun getTeamEventsByYear(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Event>>

    /**
     * Gets a list of the event keys for events this team has competed at in the given year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/team/{team_key}/events/{year}/keys")
    fun getTeamEventsByYearKeys(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of events this team has competed at in the given year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<EventSimple>>
     */
    @GET("/team/{team_key}/events/{year}/simple")
    fun getTeamEventsByYearSimple(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<EventSimple>>

    /**
     * Gets a list of the event keys for all events this team has competed at.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/team/{team_key}/events/keys")
    fun getTeamEventsKeys(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of all events this team has competed at.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<EventSimple>>
     */
    @GET("/team/{team_key}/events/simple")
    fun getTeamEventsSimple(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<EventSimple>>

    /**
     * Gets a key-value list of the event statuses for events this team has competed at in the given year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.Map<kotlin.String, TeamEventStatus>>
     */
    @GET("/team/{team_key}/events/{year}/statuses")
    fun getTeamEventsStatusesByYear(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.Map<kotlin.String, TeamEventStatus>>

}
