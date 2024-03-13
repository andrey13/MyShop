package com.omega3.myshop.ui.features.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.omega3.myshop.common.previews.PreviewData
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.domain.models.Product
import com.omega3.myshop.ui.composables.searchbar.SearchBar
import com.omega3.myshop.ui.features.home.components.sections.CategorySection
import com.omega3.myshop.ui.features.home.components.sections.HomeSection
import com.omega3.myshop.ui.features.home.components.sections.ProductSection
import com.omega3.myshop.ui.theme.lightGrayBackground
import com.omega3.myshop.R.string as AppText

@Composable
fun HomeScreen(
    categorySelected: (category: Category) -> Unit,
    productSelected: (product: Product) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {

    val products by viewModel.productListState.collectAsState()
    val categories by viewModel.categoryListState.collectAsState()

    HomeElements(
        categories,
        products,
        categorySelected,
        productSelected,
        modifier = modifier.background(lightGrayBackground)
    )
}

@Composable
private fun HomeElements(
    categories: List<Category>,
    products: List<Product>,
    categorySelected: (category: Category) -> Unit,
    productSelected: (product: Product) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier
            .verticalScroll(rememberScrollState())
            .padding(vertical = 16.dp)
    ) {
        SearchBar(Modifier.padding(horizontal = 16.dp))
        HomeSection(
            title = stringResource(AppText.categories),
            withArrow = false
        ) {
            CategorySection(
                categories = categories,
                categorySelected = categorySelected
            )
        }
        HomeSection(
            title = stringResource(AppText.recommended),
            withArrow = true
        ) {
            ProductSection(
                products = products,
                productSelected = productSelected
            )
        }
        HomeSection(
            title = stringResource(AppText.new_arrivals),
            withArrow = true
        ) {
            ProductSection(
                products = products,
                productSelected = productSelected
            )
        }
    }
}

@Preview
@Composable
fun PreviewHomeElements() {
    HomeElements(
        products = PreviewData.products(),
        categories = PreviewData.categories(),
        categorySelected = {},
        productSelected = {}
    )
}