package com.omega3.myshop.ui.features.productdetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.omega3.myshop.common.previews.PreviewData
import com.omega3.myshop.domain.models.Product
import com.omega3.myshop.ui.features.productdetail.components.sections.BodyDetail
import com.omega3.myshop.ui.theme.lightGrayBackground

@Composable
fun ProductDetailScreen(
    product: Product,
    goToCart: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ProductDetailViewModel = hiltViewModel(),
) {
    BodyDetail(
        product = product,
        addToCart = { count -> viewModel.saveItemCart(product, count) },
        showAlert = viewModel.showAlert,
        onGoToCart = goToCart,
        onPopupDismissed = viewModel.onPopupDismissed(),
        modifier = modifier
            .fillMaxSize()
            .background(lightGrayBackground)
    )
}

@Preview
@Composable
fun ProductDetailScreenPreview() {
    BodyDetail(
        product = PreviewData.product,
        addToCart = {},
        showAlert = false,
        onGoToCart = {},
        onPopupDismissed = {}
    )
}