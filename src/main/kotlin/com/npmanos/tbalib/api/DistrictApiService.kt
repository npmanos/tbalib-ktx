package com.npmanos.tbalib.api

import com.npmanos.tbalib.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import com.npmanos.tbalib.model.DistrictList
import com.npmanos.tbalib.model.DistrictRanking
import com.npmanos.tbalib.model.Event
import com.npmanos.tbalib.model.EventDistrictPoints
import com.npmanos.tbalib.model.EventSimple
import com.npmanos.tbalib.model.Team
import com.npmanos.tbalib.model.TeamSimple

interface DistrictApiService {
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
     * Gets a list of districts and their corresponding district key, for the given year.
     *
     * @param year Competition Year (or Season). Must be 4 digits.
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<DistrictList>>
     */
    @GET("/districts/{year}")
    fun getDistrictsByYear(@Path("year") year: kotlin.Int, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<DistrictList>>

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
     * Gets an array of districts representing each year the team was in a district. Will return an empty array if the team was never in a district.
     *
     * @param teamKey TBA Team Key, eg `frc254`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<DistrictList>>
     */
    @GET("/team/{team_key}/districts")
    fun getTeamDistricts(@Path("team_key") teamKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<DistrictList>>

}
