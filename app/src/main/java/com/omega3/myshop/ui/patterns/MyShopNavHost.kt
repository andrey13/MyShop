package com.omega3.myshop.ui.patterns

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.omega3.myshop.common.navigation.NavigationBarSection
import com.omega3.myshop.common.navigation.MyShopScreenRoute
import com.omega3.myshop.common.navigation.navigateSaved
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product
import com.omega3.myshop.domain.models.order.Order
import com.omega3.myshop.domain.models.order.SummaryTotals
import com.omega3.myshop.main.MyShopState
import com.omega3.myshop.ui.features.cart.CartScreen
import com.omega3.myshop.ui.features.checkout.CheckoutScreen
import com.omega3.myshop.ui.features.home.HomeScreen
import com.omega3.myshop.ui.features.placeorder.PlaceOrderScreen
import com.omega3.myshop.ui.features.productdetail.ProductDetailScreen
import com.omega3.myshop.ui.features.productlist.ProductListScreen

@Composable
fun MyShopNavHost(
    appState: MyShopState,
    paddingValues: PaddingValues,
) {
    NavHost(
        navController = appState.navController,
        startDestination = NavigationBarSection.Home.route,
        modifier = Modifier.padding(paddingValues)
    ) {
        appSoGraph(appState)
    }
}

fun NavGraphBuilder.appSoGraph(appState: MyShopState) {

    val homeRoute = MyShopScreenRoute.Home.route
    val listRoute = MyShopScreenRoute.ProductList.route
    val detailRoute = MyShopScreenRoute.ProductDetail.route
    val cartRoute = MyShopScreenRoute.Cart.route
    val checkout = MyShopScreenRoute.Checkout.route
    val placeOrder = MyShopScreenRoute.PlaceOrder.route

    val productSelectedInHome: (Product) -> Unit = { product: Product ->
        appState.productSelected = product
        appState.navigateSaved(detailRoute, homeRoute)
    }
    val categorySelectedInHome: (Category) -> Unit = { category: Category ->
        appState.categorySelected = category
        appState.navigateSaved(listRoute, homeRoute)
    }
    val productSelectedInList: (Product) -> Unit = { product: Product ->
        appState.productSelected = product
        appState.navigateSaved(detailRoute, listRoute)
    }

    val goToCartScreen: () -> Unit = {
        appState.navigateSaved(cartRoute, detailRoute)
    }

    val goToCheckoutScreen: (SummaryTotals) -> Unit = { summary ->
        appState.summaryTotals = summary
        appState.navigateSaved(checkout, cartRoute)
    }

    val goToPlaceOrderScreen: (Order) -> Unit = { order ->
        appState.orderSelected = order
        appState.navigateSaved(placeOrder, checkout)
    }

    // Home Screen Graph
    composable(NavigationBarSection.Home.route) {
        HomeScreen(
            categorySelected = categorySelectedInHome,
            productSelected = productSelectedInHome
        )
    }

    // Cart Screen Graph
    composable(NavigationBarSection.Cart.route) {
        CartScreen(
            goToCheckout = goToCheckoutScreen
        )
    }

    // Product List Screen Graph
    composable(MyShopScreenRoute.ProductList.route) {
        ProductListScreen(
            category = appState.categorySelected,
            productSelected = productSelectedInList
        )
    }

    // Product Detail Screen Graph
    composable(MyShopScreenRoute.ProductDetail.route) {
        ProductDetailScreen(
            product = appState.productSelected,
            goToCart = goToCartScreen
        )
    }

    // Checkout Screen Graph
    composable(MyShopScreenRoute.Checkout.route) {
        CheckoutScreen(
            summary = appState.summaryTotals,
            goToPlaceOrder = goToPlaceOrderScreen
        )
    }

    // Process Order Screen Graph
    composable(MyShopScreenRoute.PlaceOrder.route) {
        PlaceOrderScreen(
            order = appState.orderSelected
        )
    }
}