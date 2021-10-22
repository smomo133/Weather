package test.com.weather.data

import com.google.gson.annotations.SerializedName

/**
 * Data class that represents a realtime weather search response from WeatherApi.
 * [here](https://www.weatherapi.com/docs/#apis-realtime)
 */
data class CurrentWeatherResponse(
    @field:SerializedName("location") val location:Location,
    @field:SerializedName("current") val current:CurrentWeather
)
