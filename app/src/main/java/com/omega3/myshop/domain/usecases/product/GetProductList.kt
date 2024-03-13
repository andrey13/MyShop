package com.omega3.myshop.domain.usecases.product

import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product
import com.omega3.myshop.domain.ports.ProductRepositoryPort
import kotlinx.coroutines.flow.Flow

class GetProductList(
    private val repository: ProductRepositoryPort
) {

    fun getProducts(): Flow<List<Product>> {
        return repository.getProducts()
    }

    fun getProducts(category: Category): Flow<List<Product>> {
        return repository.getProducts(category)
    }
}