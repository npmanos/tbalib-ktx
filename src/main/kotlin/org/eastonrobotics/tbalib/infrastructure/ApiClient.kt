package org.eastonrobotics.tbalib.infrastructure

import okhttp3.OkHttpClient
import org.eastonrobotics.tbalib.api.*
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiClient {
    private var baseUrl: String = "https://www.thebluealliance.com/api/v3"
    lateinit var apiKey: String

    init {
        normalizeBaseUrl()
    }

    val districtApi: DistrictApiService by lazy { createService(DistrictApiService::class.java) }
    val eventApi: EventApiService by lazy { createService(EventApiService::class.java) }
    val listApi: ListApiService by lazy { createService(ListApiService::class.java) }
    val matchApi: MatchApiService by lazy { createService(MatchApiService::class.java) }
    val tbaApi: TBAApiService by lazy { createService(TBAApiService::class.java) }
    val teamApi: TeamApiService by lazy { createService(TeamApiService::class.java) }

    private val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(ScalarsConverterFactory.create())
            .addConverterFactory(MoshiConverterFactory.create(Serializer.moshi))
            .client(okHttpClient)
            .build()
    }

    private val okHttpClient: OkHttpClient by lazy {
        try {
            OkHttpClient.Builder()
                    .addInterceptor { chain ->
                        val request = chain.request().newBuilder().addHeader("X-TBA-Auth-Key", apiKey).build()
                        chain.proceed(request)
                    }
                    .build()
        } catch (e: UninitializedPropertyAccessException) { throw ApiKeyException("Api key not set. Set ApiClient.apiKey property.") }
    }

    private fun <S> createService(serviceClass: Class<S>): S {
        return retrofit.create(serviceClass)
    }

    private fun normalizeBaseUrl() {
        if (!baseUrl.endsWith("/")) {
            baseUrl += "/"
        }
    }
}