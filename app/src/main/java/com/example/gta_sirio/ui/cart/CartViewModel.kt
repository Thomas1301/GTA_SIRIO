package com.example.gta_sirio.ui.cart

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CartViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Bienvenue dans votre panier"
    }
    val text: LiveData<String> = _text
}