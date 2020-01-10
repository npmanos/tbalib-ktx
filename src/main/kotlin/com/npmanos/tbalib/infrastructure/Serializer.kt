package com.npmanos.tbalib.infrastructure

import com.google.gson.FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.OffsetDateTime
import java.util.*

object Serializer {
    @JvmStatic
    val gsonBuilder: GsonBuilder = GsonBuilder()
            .registerTypeAdapter(Date::class.java, DateAdapter())
            .registerTypeAdapter(OffsetDateTime::class.java, OffsetDateTimeAdapter())
            .registerTypeAdapter(LocalDateTime::class.java, LocalDateTimeAdapter())
            .registerTypeAdapter(LocalDate::class.java, LocalDateAdapter())
            .registerTypeAdapter(ByteArray::class.java, ByteArrayAdapter())
            .setFieldNamingPolicy(LOWER_CASE_WITH_UNDERSCORES)
    
    @JvmStatic
    val gson: Gson by lazy {
        gsonBuilder.create()
    }
}
