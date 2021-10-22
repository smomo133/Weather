package test.com.weather.data

import com.google.gson.annotations.SerializedName

data class Condition(
    @field:SerializedName("text") val text:String,
    @field:SerializedName("icon") val iconUrl:String,
    @field:SerializedName("code") val code:Int
)
