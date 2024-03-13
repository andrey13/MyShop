package com.omega3.myshop.common.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.ui.graphics.vector.ImageVector
import com.omega3.myshop.R.string as AppText

sealed class NavigationBarSection(
    @StringRes val title: Int,
    val icon: ImageVector,
    val route: String
) {
    companion object {
        val sections = listOf(
            Home,
            Cart
        )
    }

    object Home : NavigationBarSection(
        title = AppText.home,
        icon = Icons.Filled.Home,
        route = MyShopScreenRoute.Home.route
    )

    object Cart : NavigationBarSection(
        title = AppText.cart,
        icon = Icons.Filled.ShoppingCart,
        route = MyShopScreenRoute.Cart.route
    )
}