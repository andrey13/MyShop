package com.omega3.myshop.ui.features.placeorder.states

import com.omega3.myshop.domain.models.order.Payment
import com.omega3.myshop.domain.models.order.PaymentResult

data class PaymentState(
    val paymentInformation: Payment = Payment(),
    val isLoading: Boolean = false,
    val paymentResult: PaymentResult? = null,
    val errorMessage: String? = null
)