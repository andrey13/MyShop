package com.omega3.myshop.domain.usecases.product

import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.ports.CategoryRepositoryPort
import kotlinx.coroutines.flow.Flow

class GetCategoryList(
    private val repository: CategoryRepositoryPort
) {

    fun getCategories(): Flow<List<Category>> {
        return repository.getCategories()
    }
}