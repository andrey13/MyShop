package com.omega3.myshop.common.navigation

sealed class MyShopScreenRoute (val route: String) {

    companion object {
        val withArrowBack = listOf(
            ProductDetail,
            Checkout,
            PlaceOrder
        )
    }

    object Home : MyShopScreenRoute("home")
    object Cart : MyShopScreenRoute("cart")
    object ProductList : MyShopScreenRoute("product_list")
    object ProductDetail : MyShopScreenRoute("product_detail")
    object Checkout : MyShopScreenRoute("checkout")
    object PlaceOrder : MyShopScreenRoute("place_order")
}