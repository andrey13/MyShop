package com.omega3.myshop.domain.usecases.product

import com.omega3.myshop.domain.ports.ProductRepositoryPort

class GetProductDetail(
    private val repository: ProductRepositoryPort
)