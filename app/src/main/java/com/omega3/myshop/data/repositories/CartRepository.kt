package com.omega3.myshop.data.repositories

import com.omega3.myshop.data.datasources.CartDataSource
import com.omega3.myshop.domain.models.CartItem
import com.omega3.myshop.domain.ports.CartRepositoryPort
import kotlinx.coroutines.flow.Flow

class CartRepository(
    private val cartDataSource: CartDataSource
): CartRepositoryPort {
    override fun saveItemCart(cartItem: CartItem): Flow<List<CartItem>> {
        return cartDataSource.saveItemCart(cartItem)
    }

    override fun removeItemCart(cartItem: CartItem): Flow<List<CartItem>> {
        return cartDataSource.removeItemCart(cartItem)
    }

    override fun getCartItems(): Flow<List<CartItem>> {
        return cartDataSource.getCartItems()
    }

    override fun updateCartItems(cartItem: CartItem, operator: Int): Flow<List<CartItem>> {
        return cartDataSource.updateCartItems(cartItem, operator)
    }
}