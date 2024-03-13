package com.omega3.myshop.domain.usecases.cart

import com.omega3.myshop.domain.models.CartItem
import com.omega3.myshop.domain.ports.CartRepositoryPort
import kotlinx.coroutines.flow.Flow

class RemoveItemCart(
    private val repository: CartRepositoryPort
) {
    fun removeItemCart(cartItem: CartItem): Flow<List<CartItem>> {
        return repository.removeItemCart(cartItem)
    }
}