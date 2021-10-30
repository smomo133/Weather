package test.com.weather.data

import com.google.gson.annotations.SerializedName

data class ForecastDay(
    @field:SerializedName("date") val date:String,
    @field:SerializedName("date_epoch") val dateEpoch:Int,
    @field:SerializedName("day") val dayData:WeatherDayData,
    @field:SerializedName("astro") val astro:Astro,
    @field:SerializedName("hour") val hourlyData:List<HourlyWeatherData>,
)
