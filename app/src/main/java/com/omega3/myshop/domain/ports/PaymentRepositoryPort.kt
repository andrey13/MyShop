package com.omega3.myshop.domain.ports

import com.omega3.myshop.domain.models.order.Order
import com.omega3.myshop.domain.models.order.PaymentResult

interface PaymentRepositoryPort {
    suspend fun orderPayment(order: Order): PaymentResult
}