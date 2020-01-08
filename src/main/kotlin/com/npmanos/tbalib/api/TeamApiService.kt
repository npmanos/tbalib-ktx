package com.npmanos.tbalib.api

import com.npmanos.tbalib.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import com.npmanos.tbalib.model.Award
import com.npmanos.tbalib.model.DistrictList
import com.npmanos.tbalib.model.DistrictRanking
import com.npmanos.tbalib.model.Event
import com.npmanos.tbalib.model.EventSimple
import com.npmanos.tbalib.model.Match
import com.npmanos.tbalib.model.MatchSimple
import com.npmanos.tbalib.model.Media
import com.npmanos.tbalib.model.Team
import com.npmanos.tbalib.model.TeamEventStatus
import com.npmanos.tbalib.model.TeamRobot
import com.npmanos.tbalib.model.TeamSimple

interface TeamApiService {
    /**
     * Gets a list of team district rankings for the given district.
     *
     * @param districtKey TBA District Key, eg `2016fim`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<DistrictRanking>>
     */
    @GET("/district/{district_key}/rankings")
    fun getDistrictRankings(@Path("district_key") districtKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<DistrictRanking>>

    /**
     * Gets a list of `Team` objects that competed in events in the given district.
     *
     * @param districtKey TBA District Key, eg `2016fim`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Team>>
     */
    @GET("/district/{district_key}/teams")
    fun getDistrictTeams(@Path("district_key") districtKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Team>>

    /**
     * Gets a list of `Team` objects that competed in events in the given district.
     *
     * @param districtKey TBA District Key, eg `2016fim`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/district/{district_key}/teams/keys")
    fun getDistrictTeamsKeys(@Path("district_key") districtKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of `Team` objects that competed in events in the given district.
     *
     * @param districtKey TBA District Key, eg `2016fim`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<TeamSimple>>
     */
    @GET("/district/{district_key}/teams/simple")
    fun getDistrictTeamsSimple(@Path("district_key") districtKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<TeamSimple>>

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
     * Gets a `Team` object for the team referenced by the given key.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<Team>
     */
    @GET("/team/{team_key}")
    fun getTeam(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<Team>

    /**
     * Gets a list of awards the given team has won.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Award>>
     */
    @GET("/team/{team_key}/awards")
    fun getTeamAwards(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Award>>

    /**
     * Gets a list of awards the given team has won in a given year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Award>>
     */
    @GET("/team/{team_key}/awards/{year}")
    fun getTeamAwardsByYear(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Award>>

    /**
     * Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<DistrictList>>
     */
    @GET("/team/{team_key}/districts")
    fun getTeamDistricts(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<DistrictList>>

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

    /**
     * Gets a list of matches for the given team and year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Match>>
     */
    @GET("/team/{team_key}/matches/{year}")
    fun getTeamMatchesByYear(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Match>>

    /**
     * Gets a list of match keys for matches for the given team and year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/team/{team_key}/matches/{year}/keys")
    fun getTeamMatchesByYearKeys(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a short-form list of matches for the given team and year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<MatchSimple>>
     */
    @GET("/team/{team_key}/matches/{year}/simple")
    fun getTeamMatchesByYearSimple(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<MatchSimple>>

    /**
     * Gets a list of Media (videos / pictures) for the given team and tag.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param mediaTag Media Tag which describes the Media.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Media>>
     */
    @GET("/team/{team_key}/media/tag/{media_tag}")
    fun getTeamMediaByTag(@Path("team_key") teamKey: kotlin.String, @Path("media_tag") mediaTag: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Media>>

    /**
     * Gets a list of Media (videos / pictures) for the given team, tag and year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param mediaTag Media Tag which describes the Media.
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Media>>
     */
    @GET("/team/{team_key}/media/tag/{media_tag}/{year}")
    fun getTeamMediaByTagYear(@Path("team_key") teamKey: kotlin.String, @Path("media_tag") mediaTag: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Media>>

    /**
     * Gets a list of Media (videos / pictures) for the given team and year.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Media>>
     */
    @GET("/team/{team_key}/media/{year}")
    fun getTeamMediaByYear(@Path("team_key") teamKey: kotlin.String, @Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Media>>

    /**
     * Gets a list of year and robot name pairs for each year that a robot name was provided. Will return an empty array if the team has never named a robot.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<TeamRobot>>
     */
    @GET("/team/{team_key}/robots")
    fun getTeamRobots(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<TeamRobot>>

    /**
     * Gets a `Team_Simple` object for the team referenced by the given key.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<TeamSimple>
     */
    @GET("/team/{team_key}/simple")
    fun getTeamSimple(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<TeamSimple>

    /**
     * Gets a list of Media (social media) for the given team.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Media>>
     */
    @GET("/team/{team_key}/social_media")
    fun getTeamSocialMedia(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Media>>

    /**
     * Gets a list of years in which the team participated in at least one competition.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.Int>>
     */
    @GET("/team/{team_key}/years_participated")
    fun getTeamYearsParticipated(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.Int>>

    /**
     * Gets a list of `Team` objects, paginated in groups of 500.
     *
     * @param pageNum Page number of results to return, zero-indexed
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Team>>
     */
    @GET("/teams/{page_num}")
    fun getTeams(@Path("page_num") pageNum: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Team>>

    /**
     * Gets a list of `Team` objects that competed in the given year, paginated in groups of 500.
     *
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param pageNum Page number of results to return, zero-indexed
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<Team>>
     */
    @GET("/teams/{year}/{page_num}")
    fun getTeamsByYear(@Path("year") year: kotlin.Int, @Path("page_num") pageNum: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<Team>>

    /**
     * Gets a list Team Keys that competed in the given year, paginated in groups of 500.
     *
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param pageNum Page number of results to return, zero-indexed
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/teams/{year}/{page_num}/keys")
    fun getTeamsByYearKeys(@Path("year") year: kotlin.Int, @Path("page_num") pageNum: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a list of short form `Team_Simple` objects that competed in the given year, paginated in groups of 500.
     *
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param pageNum Page number of results to return, zero-indexed
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<TeamSimple>>
     */
    @GET("/teams/{year}/{page_num}/simple")
    fun getTeamsByYearSimple(@Path("year") year: kotlin.Int, @Path("page_num") pageNum: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<TeamSimple>>

    /**
     * Gets a list of Team keys, paginated in groups of 500. (Note, each page will not have 500 teams, but will include the teams within that range of 500.)
     *
     * @param pageNum Page number of results to return, zero-indexed
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.String>>
     */
    @GET("/teams/{page_num}/keys")
    fun getTeamsKeys(@Path("page_num") pageNum: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.String>>

    /**
     * Gets a list of short form `Team_Simple` objects, paginated in groups of 500.
     *
     * @param pageNum Page number of results to return, zero-indexed
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<TeamSimple>>
     */
    @GET("/teams/{page_num}/simple")
    fun getTeamsSimple(@Path("page_num") pageNum: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<TeamSimple>>

}
