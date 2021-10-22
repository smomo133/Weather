package test.com.weather.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import test.com.weather.BuildConfig
import test.com.weather.data.CurrentWeatherResponse

interface WeatherService {

    @GET("/current.json")
    suspend fun currentWeather(
        @Query("q") queryParam:String = "seoul", //auto:ip
        @Query("key") apikey:String = BuildConfig.WEATHER_API_KEY,
        @Query("lang") language:String = "ko",
    ): CurrentWeatherResponse

    companion object {
        private const val BASE_URL = "http://api.weatherapi.com/v1"

        fun create() : WeatherService {
            val logger =
                HttpLoggingInterceptor().apply { level = HttpLoggingInterceptor.Level.BASIC }

            val client = OkHttpClient.Builder()
                .addInterceptor(logger)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(WeatherService::class.java)
        }
    }
}