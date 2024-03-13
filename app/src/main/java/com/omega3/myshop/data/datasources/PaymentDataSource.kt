package com.omega3.myshop.data.datasources

import com.omega3.myshop.domain.models.order.Order
import com.omega3.myshop.domain.models.order.PaymentResult

interface PaymentDataSource {
    suspend fun doPayment(order: Order): PaymentResult
}