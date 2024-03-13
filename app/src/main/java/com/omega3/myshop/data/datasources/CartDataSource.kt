package com.omega3.myshop.data.datasources

import com.omega3.myshop.domain.models.CartItem
import kotlinx.coroutines.flow.Flow

interface CartDataSource {
    fun getCartItems(): Flow<List<CartItem>>
    fun saveItemCart(cartItem: CartItem): Flow<List<CartItem>>
    fun removeItemCart(cartItem: CartItem): Flow<List<CartItem>>
    fun updateCartItems(cartItem: CartItem, operator: Int): Flow<List<CartItem>>
}