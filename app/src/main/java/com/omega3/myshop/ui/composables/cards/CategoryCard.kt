package com.omega3.myshop.ui.composables.cards

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.omega3.myshop.common.previews.PreviewData
import com.omega3.myshop.domain.models.Category
import com.omega3.myshop.R

@Composable
fun CategoryCard(
    category: Category,
    categorySelected: (category: Category) -> Unit
) {
    Card(
        modifier = Modifier
            .width(120.dp)
            .wrapContentHeight(),
        shape = RoundedCornerShape(20.dp),
        elevation = 4.dp
    ) {

        Column(
            modifier = Modifier
                .clickable { categorySelected(category) }
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(category.urlImage)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.placeholder_product),
                contentDescription = "",
                modifier = Modifier.size(60.dp),
            )
            Text(
                modifier = Modifier
                    .padding(
                        top = 4.dp,
                        bottom = 8.dp
                    )
                    .align(Alignment.CenterHorizontally),
                text = category.name
            )
        }
    }
}

@Preview
@Composable
fun CategoryCardPreview() {
    CategoryCard(
        category = PreviewData.category,
        categorySelected = {}
    )
}