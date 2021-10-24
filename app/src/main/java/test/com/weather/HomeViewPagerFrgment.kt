package test.com.weather

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import test.com.weather.databinding.FragmentViewPagerBinding

//@AndroidEntryPoint
class HomeViewPagerFrgment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentViewPagerBinding.inflate(inflater, container, false)
        //val viewpager = binding.viewPager

        return binding.root
    }
}