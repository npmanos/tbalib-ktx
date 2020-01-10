package com.npmanos.tbalib.api

import com.npmanos.tbalib.model.APIStatus
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface TBAApiService {
    /**
     * Returns API status, and TBA status information.
     *
     * @param ifModifiedSince Value of the `Last-Modified` header in the most recently cached response by the client.
     * @return  Response<APIStatus>
     */
    @GET("/status")
    fun getStatus(@Header("If-Modified-Since") ifModifiedSince: kotlin.String? = null): Response<APIStatus>

}
