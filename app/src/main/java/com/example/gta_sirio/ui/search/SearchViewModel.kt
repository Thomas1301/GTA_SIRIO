package com.example.gta_sirio.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SearchViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Bienvenue sur la page de recherche"
    }
    val text: LiveData<String> = _text
}