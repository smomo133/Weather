package test.com.weather.data

import com.google.gson.annotations.SerializedName

data class AirQuality(
    //Carbon Monoxide (μg/m3)
    @field:SerializedName("co") val co:Float,
    //Ozone (μg/m3)
    @field:SerializedName("o3") val o3:Float,
    //Nitrogen dioxide (μg/m3)
    @field:SerializedName("no2") val no2:Float,
    //Sulphur dioxide (μg/m3)
    @field:SerializedName("so2") val so2:Float,
    //PM2.5 (μg/m3)
    @field:SerializedName("pm2_5") val pm2_5:Float,
    //PM10 (μg/m3)
    @field:SerializedName("pm10") val pm10:Float,
)
