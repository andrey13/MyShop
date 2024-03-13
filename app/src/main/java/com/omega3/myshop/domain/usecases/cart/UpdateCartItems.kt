package com.omega3.myshop.domain.usecases.cart

import com.omega3.myshop.domain.models.CartItem
import com.omega3.myshop.domain.ports.CartRepositoryPort
import kotlinx.coroutines.flow.Flow

class UpdateCartItems(
    private val repository: CartRepositoryPort
) {
    fun updateCartItems(cartItems: CartItem, operator: Int): Flow<List<CartItem>> {
        return repository.updateCartItems(cartItems, operator)
    }
}