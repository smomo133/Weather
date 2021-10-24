package test.com.weather.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import test.com.weather.data.CurrentWeatherResponse
import test.com.weather.data.WeatherRepository
import javax.inject.Inject

@HiltViewModel
class CurrentWeatherViewModel @Inject constructor(
    private val repository:WeatherRepository
    ):ViewModel() {
    private var currentQueryValue:String? = null
    val currentWeaterResult = MutableLiveData<CurrentWeatherResponse>()

    fun getCurrentWeather(query:String){
        currentQueryValue = query
        viewModelScope.launch {
            val response = repository.getCurrentWeatherStream(query)
            currentWeaterResult.postValue(response)
        }
    }
}