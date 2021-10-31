package test.com.weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import test.com.weather.databinding.FragmentWeatherSettingBinding

@AndroidEntryPoint
class WeatherSettingFragment:Fragment() {
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?): View? {
        val binding = FragmentWeatherSettingBinding.inflate(inflater, container, false)
        return binding.root
    }
}