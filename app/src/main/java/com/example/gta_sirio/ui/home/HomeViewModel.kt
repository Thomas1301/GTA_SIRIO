package com.example.gta_sirio.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Une simple recherche suffit pour trouver votre bonheur.\n Par exemple recherchez : \n\"Chaise\""
    }
    val text: LiveData<String> = _text
}