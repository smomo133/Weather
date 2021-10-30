package test.com.weather

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import test.com.weather.adapter.HourlyWeatherAdapter
import test.com.weather.data.HourlyWeatherData
import test.com.weather.databinding.FragmentCurrentWeatherBinding
import test.com.weather.viewmodels.CurrentWeatherViewModel

@AndroidEntryPoint
class CurrentWeatherFragment : Fragment() {
    private val viewModel:CurrentWeatherViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentCurrentWeatherBinding.inflate(inflater, container, false)
        val adapter = HourlyWeatherAdapter()
        binding.hourlyWeatherList.adapter = adapter
        getForecastData(adapter)
        return binding.root
    }

    private fun getCurrentWeatherData(){
        viewModel.getCurrentWeather("auto:ip")
        viewModel.currentWeaterResult.observe(viewLifecycleOwner, {

        })
    }

    private fun getForecastData(adapter: HourlyWeatherAdapter){
        viewModel.getForecast("auto:ip")
        viewModel.forecastResult.observe(viewLifecycleOwner, {
            val hourDataList = mutableListOf<HourlyWeatherData>()
            for(forecast in it.forecast.forecastday){
                hourDataList.addAll(forecast.hourlyData)
            }
            adapter.submitList(hourDataList)
        })
    }

    companion object{
        const val TAG = "CurrentWeatherFragment"
    }
}