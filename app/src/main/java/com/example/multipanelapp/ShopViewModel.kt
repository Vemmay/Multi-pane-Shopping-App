package com.example.multipanelapp

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

val products = listOf(
    Product("Product A", "$100", "This is a great product A."),
    Product("Product B", "$150", "This is product B with more features."),
    Product("Product C", "$200", "Premium product C.")
)

data class Product(val name: String, val price: String, val description: String)

class ShopViewModel : ViewModel() {

    private val _selectedProduct = MutableStateFlow<Product?>(null)
    val selectedProduct: StateFlow<Product?> = _selectedProduct.asStateFlow()

    fun selectProduct(product: Product) {
        _selectedProduct.value = product
    }

    fun deselectProduct() {
        _selectedProduct.value = null
    }

}