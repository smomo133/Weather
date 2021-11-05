package test.com.weather.adapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions

@BindingAdapter("iconImageFromUrl")
fun bindIconImageFromUrl(view: ImageView, imageUrl:String?){
    if(!imageUrl.isNullOrEmpty()){
        Glide.with(view.context)
            .load("https:" + imageUrl)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(view)
    }
}