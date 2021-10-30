package test.com.weather.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import test.com.weather.R
import test.com.weather.data.HourlyWeatherData
import test.com.weather.databinding.ListItemHourlyWeatherBinding

class HourlyWeatherAdapter :
    ListAdapter<HourlyWeatherData, HourlyWeatherAdapter.ViewHolder>(HourlyDataDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.list_item_hourly_weather,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    class ViewHolder(private val binding:ListItemHourlyWeatherBinding)
        :RecyclerView.ViewHolder(binding.root){
        init {

        }

        fun bind(item:HourlyWeatherData){
            binding.apply {
                hourly = item
                executePendingBindings()
            }
        }
    }
}

private class HourlyDataDiffCallback : DiffUtil.ItemCallback<HourlyWeatherData>(){
    override fun areContentsTheSame(
        oldItem: HourlyWeatherData,
        newItem: HourlyWeatherData)
    : Boolean {
        return oldItem.time == newItem.time
    }

    override fun areItemsTheSame(oldItem: HourlyWeatherData, newItem: HourlyWeatherData): Boolean {
        return oldItem == newItem
    }
}