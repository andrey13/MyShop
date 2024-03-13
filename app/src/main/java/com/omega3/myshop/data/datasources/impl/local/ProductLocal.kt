package com.omega3.myshop.data.datasources.impl.local

import com.omega3.myshop.data.datasources.ProductDataSource
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product
import kotlinx.coroutines.flow.Flow

class ProductLocal: ProductDataSource {
    override fun getProducts(): Flow<List<Product>> {
        TODO("Not yet implemented")
    }

    override fun getProducts(category: Category): Flow<List<Product>> {
        TODO("Not yet implemented")
    }
}