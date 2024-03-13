package com.omega3.myshop.domain.usecases.product

data class ProductUseCases(
    val getProducts: GetProductList,
    val getProduct: GetProductDetail,
    val getCategories: GetCategoryList
)