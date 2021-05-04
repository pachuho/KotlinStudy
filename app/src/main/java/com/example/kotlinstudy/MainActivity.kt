package com.example.kotlinstudy

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinstudy.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val vm: MainViewModel by lazy { ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainViewModel::class.java) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.apply {
            viewModel = vm
            lifecycleOwner = this@MainActivity
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding.apply {
            viewModel = null
            lifecycleOwner = null
        }
    }
}