package test.com.weather.data

import com.google.gson.annotations.SerializedName

data class CurrentWeather(
    //Local time when the real time data was updated.
    @field:SerializedName("last_updated") val lastUpdated:String,
    //Local time when the real time data was updated in unix time.
    @field:SerializedName("last_updated_epoch") val lastUpdatedEpoch:Int,
    //Temperature in celsius
    @field:SerializedName("temp_c") val tempC:Float,
    //Temperature in fahrenheit
    @field:SerializedName("temp_f") val tempF:Float,
    //Feels like temperature in celsius
    @field:SerializedName("feelslike_c") val feelslikeC:Float,
    //Feels like temperature in fahrenheit
    @field:SerializedName("feelslike_f") val feelslikeF:Float,
    //Weather condition
    @field:SerializedName("condition") val condition:Condition,
    //Wind speed in miles per hour
    @field:SerializedName("wind_mph") val windMph:Float,
    //Wind speed in kilometer per hour
    @field:SerializedName("wind_kph") val windKph:Float,
    //Wind direction in degrees
    @field:SerializedName("wind_degree") val windDegree:Int,
    //Wind direction as 16 point compass. e.g.: NSW
    @field:SerializedName("wind_dir") val windDir:String,
    //Pressure in millibars
    @field:SerializedName("pressure_mb") val pressureMb:Float,
    //Pressure in inches
    @field:SerializedName("pressure_in") val pressureIn:Float,
    //Precipitation amount in millimeters
    @field:SerializedName("precip_mm") val precipMm:Float,
    //Precipitation amount in inches
    @field:SerializedName("precip_in") val precipIn:Float,
    //Humidity as percentage
    @field:SerializedName("humidity") val humidity:Int,
    //Cloud cover as percentage
    @field:SerializedName("cloud") val cloud:Int,
    //1 = Yes 0 = No Whether to show day condition icon or night icon
    @field:SerializedName("is_day") val isDay:Int,
    //UV Index
    @field:SerializedName("uv") val uv:Float,
    //Wind gust in miles per hour
    @field:SerializedName("gust_mph") val gustMph:Float,
    //Wind gust in kilometer per hour
    @field:SerializedName("gust_kph") val gustKph:Float
)
