package com.example.kotlinstudy

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val isClick: MutableLiveData<Boolean> by lazy { MutableLiveData<Boolean> (false) }

    fun clickButton(){
        this.isClick.value = !isClick.value!!
    }

}