package test.com.weather.data

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import java.lang.NullPointerException
import java.lang.reflect.Type

class HourDeserializer : JsonDeserializer<HourlyWeatherData>{
    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type?,
        context: JsonDeserializationContext?
    ): HourlyWeatherData {
        val jsonObject = json?.asJsonObject ?: throw NullPointerException("Response Json is null")
        val timeList = jsonObject["time"].asString.split(" ")
        val time = timeList[0] + "\n" + timeList[1]
        val tempC = jsonObject["temp_c"].asFloat.toString()
        val conditionJson = jsonObject["condition"]
        val conditionText = conditionJson.asJsonObject["text"].asString
        val conditionIconUrl = "https:"+ conditionJson.asJsonObject["icon"].asString
        val conditionCode = conditionJson.asJsonObject["code"].asString
        val windKph = jsonObject["wind_kph"].asFloat.toString()
        val windDir = jsonObject["wind_dir"].asString
        val pressureMb = jsonObject["pressure_mb"].asFloat.toString()
        val precipMm = jsonObject["precip_mm"].asFloat.toString()
        val humidity = jsonObject["humidity"].asInt.toString()
        val cloud = jsonObject["cloud"].asInt.toString()
        val feelslikeC = jsonObject["feelslike_c"].asFloat.toString()
        val heatindexC = jsonObject["heatindex_c"].asFloat.toString()
        val willItRain = jsonObject["will_it_rain"].asInt
        val willItSnow = jsonObject["will_it_snow"].asInt
        val visKm = jsonObject["vis_km"].asFloat.toString()
        val chanceOfRain = jsonObject["chance_of_rain"].asInt.toString()
        val chanceOfSnow = jsonObject["chance_of_snow"].asInt.toString()
        val gustKph = jsonObject["gust_kph"].asFloat.toString()
        return HourlyWeatherData(
            time,
            tempC,
            conditionText,
            conditionIconUrl,
            conditionCode,
            windKph,
            windDir,
            pressureMb,
            precipMm,
            humidity,
            cloud,
            feelslikeC,
            heatindexC,
            willItRain,
            willItSnow,
            visKm,
            chanceOfRain,
            chanceOfSnow,
            gustKph
        )
    }
}