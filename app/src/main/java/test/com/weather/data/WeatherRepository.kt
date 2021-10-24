package test.com.weather.data

import kotlinx.coroutines.flow.Flow
import test.com.weather.api.WeatherService
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val service:WeatherService) {
    suspend fun getCurrentWeatherStream(query:String) = service.currentWeather()
}