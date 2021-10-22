package test.com.weather.data

import com.google.gson.annotations.SerializedName

data class Location(
    @field:SerializedName("name") val name:String,
    @field:SerializedName("region") val region:String,
    @field:SerializedName("country") val country:String,
    //Latitude in decimal degree
    @field:SerializedName("lat") val lat:Float,
    //Longitude in decimal degree
    @field:SerializedName("lon") val lon:Float,
    //Time zone name
    @field:SerializedName("tz_id") val timezoneId:String,
    //Local date and time in unix time
    @field:SerializedName("localtime_epoch") val localtimeEpoch:Int,
    @field:SerializedName("localtime") val localtime:String,
)
