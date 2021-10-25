package test.com.weather.data

import com.google.gson.annotations.SerializedName

data class WeatherHourData(
    @field:SerializedName("time_epoch") val timeEpoch:Int,
    @field:SerializedName("time") val time:String,
    //Temperature in celsius
    @field:SerializedName("temp_c") val tempC:Float,
    //Temperature in fahrenheit
    @field:SerializedName("temp_f") val tempF:Float,
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
    //Feels like temperature in celsius
    @field:SerializedName("feelslike_c") val feelslikeC:Float,
    //Feels like temperature in fahrenheit
    @field:SerializedName("feelslike_f") val feelslikeF:Float,
    //Windchill temperature in celcius
    @field:SerializedName("windchill_c") val windchillC:Float,
    //Heat index in celcius
    @field:SerializedName("heatindex_c") val heatindexC:Float,
    //Dew point in celcius
    @field:SerializedName("dewpoint_c") val dewpointC:Float,
    //1 = Yes 0 = No / Will it will rain or not
    @field:SerializedName("will_it_rain") val willItRain:Int,
    //1 = Yes 0 = No / Will it will snow or not
    @field:SerializedName("will_it_snow") val willItSnow:Int,
    //Visibility in kilometer
    @field:SerializedName("vis_km") val visKm:Float,
    //Chance of rain as percentage
    @field:SerializedName("chance_of_rain") val chanceOfRain:Int,
    //Chance of snow as percentage
    @field:SerializedName("chance_of_snow") val chanceOfSnow:Int,
    //Wind gust in kilometer per hour
    @field:SerializedName("gust_kph") val gustKph:Float,
)
