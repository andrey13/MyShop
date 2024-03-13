package com.omega3.myshop.domain.usecases.cart

import com.omega3.myshop.domain.models.CartItem
import com.omega3.myshop.domain.ports.CartRepositoryPort
import kotlinx.coroutines.flow.Flow

class SaveItemCart(
    private val repository: CartRepositoryPort
) {
    fun saveItem(cartItem: CartItem): Flow<List<CartItem>> {
        return repository.saveItemCart(cartItem)
    }
}