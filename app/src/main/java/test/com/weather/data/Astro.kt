package test.com.weather.data

import com.google.gson.annotations.SerializedName

data class Astro(
    @field:SerializedName("sunrise") val sunrise:String,
    @field:SerializedName("sunset") val sunset:String,
    @field:SerializedName("moonrise") val moonrise:String,
    @field:SerializedName("moonset") val moonset:String,
    @field:SerializedName("moon_phase") val moonPhase:String,
    @field:SerializedName("moon_illumination") val moonIllumination:Float,
)
