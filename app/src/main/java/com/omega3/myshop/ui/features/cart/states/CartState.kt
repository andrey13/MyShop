package com.omega3.myshop.ui.features.cart.states

import com.omega3.myshop.domain.models.CartItem

data class CartState(
    val cartItems: List<CartItem> = emptyList()
)

val CartState.readyForCheckout: Boolean
    get() = cartItems.isNotEmpty()