package com.example.metroapplication.ui.metro

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MetroViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Metro Screen"
    }
    val text: LiveData<String> = _text
}