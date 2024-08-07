package com.krunal.augcomposeprep

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class ProductViewModel(private val repository: ProductRepository) : ViewModel() {

    val products = liveData(Dispatchers.IO) {
        val response = repository.getProducts()
        if (response.isSuccessful) {
            emit(response.body()?.products ?: emptyList())
        } else {
            emit(emptyList())
        }
    }
}