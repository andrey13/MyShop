package com.omega3.myshop.main

import android.content.res.Resources
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import com.omega3.myshop.ui.patterns.MyShopBottomBar
import com.omega3.myshop.ui.patterns.MyShopNavHost
import com.omega3.myshop.ui.patterns.MyShopTopBar
import com.omega3.myshop.ui.theme.MyShopTheme
import com.omega3.myshop.ui.theme.orange

@Composable
fun MyShopScreen() {
    MyShopTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background,
            contentColor = orange
        ) {
            val appState = rememberAppState()
            Scaffold(
                scaffoldState = appState.scaffoldState,
                topBar = { MyShopTopBar(appState) },
                bottomBar = { MyShopBottomBar(navController = appState.navController) }
            ) { contentPadding ->
                MyShopNavHost(appState, contentPadding)
            }
        }
    }
}

@Composable
@ReadOnlyComposable
fun resources(): Resources {
    LocalConfiguration.current
    return LocalContext.current.resources
}