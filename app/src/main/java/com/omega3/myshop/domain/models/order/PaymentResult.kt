package com.omega3.myshop.domain.models.order

data class PaymentResult(
    val status: Boolean,
    val payment: Payment
)