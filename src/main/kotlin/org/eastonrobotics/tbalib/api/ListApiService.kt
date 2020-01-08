package org.eastonrobotics.tbalib.api

import org.eastonrobotics.tbalib.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import org.eastonrobotics.tbalib.model.DistrictRanking
import org.eastonrobotics.tbalib.model.Event
import org.eastonrobotics.tbalib.model.EventSimple
import org.eastonrobotics.tbalib.model.Team
import org.eastonrobotics.tbalib.model.TeamEventStatus
import org.eastonrobotics.tbalib.model.TeamSimple

interface ListApiService {
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
