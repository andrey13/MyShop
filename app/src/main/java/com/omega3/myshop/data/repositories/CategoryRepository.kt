package com.omega3.myshop.data.repositories

import com.omega3.myshop.data.datasources.CategoryDataSource
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.ports.CategoryRepositoryPort
import kotlinx.coroutines.flow.Flow

class CategoryRepository(
    private val categoryDataSource: CategoryDataSource
) : CategoryRepositoryPort {

    override fun getCategories(): Flow<List<Category>> {
        return categoryDataSource.getCategories()
    }
}