package test.com.weather.data

import com.google.gson.annotations.JsonAdapter
import com.google.gson.annotations.SerializedName

@JsonAdapter(DayDeserializer::class)
data class WeatherDayData(
    //Maximum temperature in celsius for the day.
    @field:SerializedName("maxtemp_c") val maxtempC:String,
    //Minimum temperature in celsius for the day
    @field:SerializedName("mintemp_c") val mintempC:String,
    //
    @field:SerializedName("avgtemp_c") val avgtempC:String,
    //
    @field:SerializedName("maxwind_kph") val maxwindKph:Float,
    //Total precipitation in milimeter
    @field:SerializedName("totalprecip_mm") val totalprecipMm:Float,
    //Average visibility in kilometer
    @field:SerializedName("avgvis_km") val avgvisKm:Float,
    //Average humidity as percentage
    @field:SerializedName("avghumidity") val avghumidity:Float,
    //Weather condition
    //@field:SerializedName("condition") val condition:Condition,
    @field:SerializedName("condition:text") val conditionText:String,
    @field:SerializedName("condition:icon") val conditionIconUrl:String,
    @field:SerializedName("condition:code") val conditionCode:String,
    //UV Index
    @field:SerializedName("uv") val uv:Float,
)
