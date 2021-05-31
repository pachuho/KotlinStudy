package com.example.kotlinstudy

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinstudy.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    private val vm: MainViewModel by lazy { ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MainViewModel::class.java) }
    private val TAG = "test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        GlobalScope.launch {
            Log.d(TAG, "inner")
        }
        Log.d(TAG, "ex")

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