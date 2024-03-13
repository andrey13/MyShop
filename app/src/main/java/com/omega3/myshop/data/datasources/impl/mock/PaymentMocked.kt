package com.omega3.myshop.data.datasources.impl.mock

import com.omega3.myshop.data.datasources.PaymentDataSource
import com.omega3.myshop.domain.models.order.Order
import com.omega3.myshop.domain.models.order.Payment
import com.omega3.myshop.domain.models.order.PaymentResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

class PaymentMocked : PaymentDataSource {

    override suspend fun doPayment(order: Order): PaymentResult {
        return withContext(Dispatchers.IO) {
            delay(4000)
            PaymentResult(
                status = true,
                payment = Payment(
                    status = "SUCCESS",
                    reference = "123ABC")
            )
        }
    }
}