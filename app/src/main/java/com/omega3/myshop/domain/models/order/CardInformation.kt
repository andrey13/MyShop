package com.omega3.myshop.domain.models.order

data class CardInformation(
    val name: String,
    val number: String,
    val month: String,
    val year: String,
    val code: String,
)