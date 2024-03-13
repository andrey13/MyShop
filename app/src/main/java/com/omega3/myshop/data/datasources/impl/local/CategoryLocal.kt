package com.omega3.myshop.data.datasources.impl.local

import com.omega3.myshop.data.datasources.CategoryDataSource
import com.omega3.myshop.domain.models.Category
import kotlinx.coroutines.flow.Flow

class CategoryLocal: CategoryDataSource {
    override fun getCategories(): Flow<List<Category>> {
        TODO("Not yet implemented")
    }
}