package com.npmanos.tbalib.infrastructure

import com.google.gson.TypeAdapter
import com.google.gson.stream.JsonReader
import com.google.gson.stream.JsonToken.NULL
import com.google.gson.stream.JsonWriter
import org.threeten.bp.OffsetDateTime
import org.threeten.bp.format.DateTimeFormatter
import java.io.IOException

class OffsetDateTimeAdapter(private val formatter: DateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME) : TypeAdapter<OffsetDateTime>() {
    @Throws(IOException::class)
    override fun write(out: JsonWriter?, value: OffsetDateTime?) {
        if (value == null) {
            out?.nullValue()
        } else {
            out?.value(formatter.format(value))
        }
    }

    @Throws(IOException::class)
    override fun read(out: JsonReader?): OffsetDateTime? {
        out ?: return null

        when (out.peek()) {
            NULL -> {
                out.nextNull()
                return null
            }
            else -> {
                return OffsetDateTime.parse(out.nextString(), formatter)
            }
        }
    }
}
