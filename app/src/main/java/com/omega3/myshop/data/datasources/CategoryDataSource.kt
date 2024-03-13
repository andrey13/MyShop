package com.omega3.myshop.data.datasources

import com.omega3.myshop.domain.models.Category
import kotlinx.coroutines.flow.Flow

interface CategoryDataSource {
    fun getCategories(): Flow<List<Category>>
}