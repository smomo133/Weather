package test.com.weather

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil.setContentView
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import test.com.weather.databinding.ActivityWeatherBinding

@AndroidEntryPoint
class WeatherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView<ActivityWeatherBinding>(this, R.layout.activity_weather)
    }
}