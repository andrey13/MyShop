package com.omega3.myshop.data.repositories

import com.omega3.myshop.data.datasources.ProductDataSource
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product
import com.omega3.myshop.domain.ports.ProductRepositoryPort
import kotlinx.coroutines.flow.Flow

class ProductRepository(
    private val productDataSource: ProductDataSource
) : ProductRepositoryPort {

    override fun getProducts(): Flow<List<Product>> {
        return productDataSource.getProducts()
    }

    override fun getProducts(category: Category): Flow<List<Product>> {
        return productDataSource.getProducts(category)
    }
}