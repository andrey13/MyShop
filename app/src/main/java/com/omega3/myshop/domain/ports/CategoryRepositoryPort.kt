package com.omega3.myshop.domain.ports

import com.omega3.myshop.domain.models.Category
import kotlinx.coroutines.flow.Flow

interface CategoryRepositoryPort {
    fun getCategories(): Flow<List<Category>>
}