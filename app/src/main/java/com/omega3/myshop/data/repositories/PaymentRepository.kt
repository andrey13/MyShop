package com.omega3.myshop.data.repositories

import com.omega3.myshop.data.datasources.PaymentDataSource
import com.omega3.myshop.domain.models.order.Order
import com.omega3.myshop.domain.models.order.PaymentResult
import com.omega3.myshop.domain.ports.PaymentRepositoryPort

class PaymentRepository(
    private val paymentDataSource: PaymentDataSource,
) : PaymentRepositoryPort {
    override suspend fun orderPayment(order: Order): PaymentResult {
        return paymentDataSource.doPayment(order)
    }
}