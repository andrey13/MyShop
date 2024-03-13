package com.omega3.myshop.ui.features.productdetail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.omega3.myshop.domain.models.CartItem
import com.omega3.myshop.domain.models.Product
import com.omega3.myshop.domain.usecases.cart.CartUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductDetailViewModel @Inject constructor(
    private val cartUseCases: CartUseCases
) : ViewModel() {

    var showAlert by mutableStateOf(false)
        private set

    fun saveItemCart(product: Product, quantity: Int) {
        viewModelScope.launch {
            val cartItem = CartItem(
                quantity = quantity,
                product = product
            )
            cartUseCases.saveItemCart
                .saveItem(cartItem).collect {
                    showAlert = true
                }
        }
    }

    fun onPopupDismissed(): () -> Unit = {
        showAlert = false
    }
}