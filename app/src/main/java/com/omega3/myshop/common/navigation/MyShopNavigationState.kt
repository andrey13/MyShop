package com.omega3.myshop.common.navigation

import com.omega3.myshop.main.MyShopState

fun MyShopState.popUp(): () -> Unit = {
    navController.popBackStack()
}

fun MyShopState.navigate(route: String) {
    navController.navigate(route) {
        launchSingleTop = true
    }
}

fun MyShopState.navigateAndPopUp(route: String, popUp: String) {
    navController.navigate(route) {
        launchSingleTop = true
        popUpTo(popUp) { inclusive = true }
    }
}

fun MyShopState.navigateSaved(route: String, popUp: String) {
    navController.navigate(route) {
        launchSingleTop = true
        restoreState = true
        popUpTo(popUp) { saveState = true }
    }
}

fun MyShopState.clearAndNavigate(route: String) {
    navController.navigate(route) {
        launchSingleTop = true
        popUpTo(0) { inclusive = true }
    }
}