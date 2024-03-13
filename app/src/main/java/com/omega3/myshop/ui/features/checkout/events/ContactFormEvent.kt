package com.omega3.myshop.ui.features.checkout.events

sealed class ContactFormEvent {
    data class OnNameChange(val name: String): ContactFormEvent()
    data class OnPhoneChange(val phone: String): ContactFormEvent()
    data class OnAddressChange(val address: String): ContactFormEvent()
}