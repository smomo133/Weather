package test.com.weather.data

import com.google.gson.annotations.SerializedName

/**
 * Data class that represents a forecast weather search response from WeatherApi.
 * [here](https://www.weatherapi.com/docs/#apis-forecast)
 */
data class ForecastResponse(
    @field:SerializedName("location") val location:Location,
    @field:SerializedName("current") val current:CurrentWeather,
    @field:SerializedName("forecast") val forecast:Forecast,
)
