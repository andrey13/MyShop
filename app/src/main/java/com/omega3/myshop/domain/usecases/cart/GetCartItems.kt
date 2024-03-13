package com.omega3.myshop.domain.usecases.cart

import com.omega3.myshop.domain.models.CartItem
import com.omega3.myshop.domain.ports.CartRepositoryPort
import kotlinx.coroutines.flow.Flow

class GetCartItems(
    private val repository: CartRepositoryPort
) {

    fun getCartItems(): Flow<List<CartItem>> {
        return repository.getCartItems()
    }
}