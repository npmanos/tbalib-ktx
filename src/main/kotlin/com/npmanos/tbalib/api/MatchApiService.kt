package com.npmanos.tbalib.api

import com.npmanos.tbalib.model.Match
import com.npmanos.tbalib.model.MatchSimple
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path

interface MatchApiService {
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
     * Gets a `Match` object for the given match key.
     *
     * @param matchKey TBA Match Key, eg `2016nytr_qm1`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<Match>
     */
    @GET("/match/{match_key}")
    fun getMatch(@Path("match_key") matchKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<Match>

    /**
     * Gets a short-form `Match` object for the given match key.
     *
     * @param matchKey TBA Match Key, eg `2016nytr_qm1`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<MatchSimple>
     */
    @GET("/match/{match_key}/simple")
    fun getMatchSimple(@Path("match_key") matchKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<MatchSimple>

    /**
     * Gets an array of game-specific Match Timeseries objects for the given match key or an empty array if not available. *WARNING:* This is *not* official data, and is subject to a significant possibility of error, or missing data. Do not rely on this data for any purpose. In fact, pretend we made it up. *WARNING:* This endpoint and corresponding data models are under *active development* and may change at any time, including in breaking ways.
     *
     * @param matchKey TBA Match Key, eg `2016nytr_qm1`
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<kotlin.collections.List<kotlin.Any>>
     */
    @GET("/match/{match_key}/timeseries")
    fun getMatchTimeseries(@Path("match_key") matchKey: kotlin.String, @Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<kotlin.collections.List<kotlin.Any>>

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

}
