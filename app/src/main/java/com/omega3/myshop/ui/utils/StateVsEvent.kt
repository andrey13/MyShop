package com.omega3.myshop.ui.utils

data class StateVsEvent(
    val value: String = "",
    val onValueChange: (String) -> Unit = {}
)