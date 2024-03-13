package com.omega3.myshop.data.datasources.impl.remote

import com.omega3.myshop.data.datasources.CategoryDataSource
import com.omega3.myshop.domain.models.Category
import kotlinx.coroutines.flow.Flow

class CategoryRemote: CategoryDataSource {
    override fun getCategories(): Flow<List<Category>> {
        TODO("Not yet implemented")
    }
}