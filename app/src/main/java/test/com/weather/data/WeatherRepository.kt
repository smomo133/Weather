package test.com.weather.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import test.com.weather.api.WeatherService
import javax.inject.Inject

class WeatherRepository @Inject constructor(private val service:WeatherService) {
    suspend fun getCurrentWeatherStream(query:String) = service.currentWeather(query)
//    suspend fun getForecastStream(query: String) = service.forecast(query)
    fun getForecastStream(query: String):Flow<ForecastResponse>{
        return flow {
            val result = service.forecast(query)
            emit(result)
        }.flowOn(Dispatchers.IO)
    }
}