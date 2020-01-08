package com.npmanos.tbalib.api

import com.npmanos.tbalib.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody
import okhttp3.ResponseBody
import okhttp3.MultipartBody

import com.npmanos.tbalib.model.APIStatus

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
