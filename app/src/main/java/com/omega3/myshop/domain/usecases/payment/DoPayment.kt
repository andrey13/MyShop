package com.omega3.myshop.domain.usecases.payment

import com.omega3.myshop.domain.models.order.Order
import com.omega3.myshop.domain.models.order.PaymentResult
import com.omega3.myshop.domain.ports.PaymentRepositoryPort

class DoPayment(
    private val repository: PaymentRepositoryPort,
) {

    suspend fun doPayment(order: Order): PaymentResult {
        return repository.orderPayment(order)
    }
}