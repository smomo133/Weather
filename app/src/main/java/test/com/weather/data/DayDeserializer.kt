package test.com.weather.data

import com.google.gson.*
import java.lang.reflect.Type
import kotlin.NullPointerException

class DayDeserializer : JsonDeserializer<WeatherDayData>{
    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): WeatherDayData {
        val jsonObject = json?.asJsonObject ?: throw NullPointerException("Response Json is null")

        val maxtempC = jsonObject["maxtemp_c"].asFloat.toString()
        val mintempC = jsonObject["mintemp_c"].asFloat.toString()
        val avgtempC = jsonObject["avgtemp_c"].asFloat.toString()
        val maxwindKph = jsonObject["maxwind_kph"].asFloat
        val totalprecipMm = jsonObject["totalprecip_mm"].asFloat
        val avgvisKm = jsonObject["avgvis_km"].asFloat
        val avghumidity = jsonObject["avghumidity"].asFloat
        val conditionJson = jsonObject["condition"]
        val conditionText = conditionJson.asJsonObject["text"].asString
        val conditionIconUrl = conditionJson.asJsonObject["icon"].asString
        val conditionCode = conditionJson.asJsonObject["code"].asString
        val uv = jsonObject["uv"].asFloat
        return WeatherDayData(
            maxtempC,
            mintempC,
            avgtempC,
            maxwindKph,
            totalprecipMm,
            avgvisKm,
            avghumidity,
            conditionText,
            conditionIconUrl,
            conditionCode,
            uv
        )
    }
}