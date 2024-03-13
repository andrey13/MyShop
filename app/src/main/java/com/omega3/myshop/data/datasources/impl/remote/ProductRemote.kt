package com.omega3.myshop.data.datasources.impl.remote

import com.omega3.myshop.data.datasources.ProductDataSource
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product
import kotlinx.coroutines.flow.Flow

class ProductRemote: ProductDataSource {
    override fun getProducts(): Flow<List<Product>> {
        TODO("Not yet implemented")
    }

    override fun getProducts(category: Category): Flow<List<Product>> {
        TODO("Not yet implemented")
    }
}