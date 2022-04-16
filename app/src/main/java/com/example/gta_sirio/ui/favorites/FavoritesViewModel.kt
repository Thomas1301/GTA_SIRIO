package com.example.gta_sirio.ui.favorites

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class FavoritesViewModel : ViewModel(){
    private val _text = MutableLiveData<String>().apply {
        value = "Bienvenue sur la page des Favoris"
    }
    val text: LiveData<String> = _text
}