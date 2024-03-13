package com.omega3.myshop.domain.ports

import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepositoryPort {
    fun getProducts(): Flow<List<Product>>
    fun getProducts(category: Category): Flow<List<Product>>
}