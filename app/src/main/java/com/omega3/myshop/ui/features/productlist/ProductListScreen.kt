package com.omega3.myshop.ui.features.productlist

import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.omega3.myshop.common.previews.PreviewData
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product
import com.omega3.myshop.ui.features.productlist.components.lists.ProductItemList
import com.omega3.myshop.ui.theme.lightGrayBackground

@Composable
fun ProductListScreen(
    category: Category,
    productSelected: (Product) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: ProductListViewModel = hiltViewModel()
) {
    val products by viewModel.productListState(category).collectAsState()

    ProductListContent(
        products,
        productSelected,
        modifier = modifier.background(lightGrayBackground)
    )
}

@Composable
fun ProductListContent(
    products: List<Product>,
    productSelected: (Product) -> Unit,
    modifier: Modifier = Modifier
) {
    ProductItemList(
        products = products,
        productSelected = productSelected,
        modifier = modifier
    )
}

@Preview
@Composable
fun ProductListScreenPreview() {
    ProductListContent(
        products = PreviewData.products(),
        productSelected = {}
    )
}