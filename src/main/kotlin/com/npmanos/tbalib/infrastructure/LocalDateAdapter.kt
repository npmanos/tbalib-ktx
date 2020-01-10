package com.npmanos.tbalib.infrastructure

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken.NULL
import com.google.gson.stream.JsonWriter
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter
import java.io.IOException

class LocalDateAdapter(private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE) : TypeAdapter<LocalDate>() {
    @Throws(IOException::class)
    override fun write(out: JsonWriter?, value: LocalDate?) {
        if (value == null) {
            out?.nullValue()
        } else {
            out?.value(formatter.format(value))
        }
    }

    @Throws(IOException::class)
    override fun read(out: JsonReader?): LocalDate? {
        out ?: return null

        when (out.peek()) {
            NULL -> {
                out.nextNull()
                return null
            }
            else -> {
                return LocalDate.parse(out.nextString(), formatter)
            }
        }
    }
}
