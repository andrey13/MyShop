package com.omega3.myshop.ui.features.productdetail.components.sections

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.omega3.myshop.ui.composables.buttons.StandardButton
import com.omega3.myshop.R.string as AppText

@Composable
fun BottomSection(
    onBuyClicked: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 20.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        StandardButton(
            text = stringResource(AppText.add_to_cart),
            onClicked = onBuyClicked
        )
    }
}


@Preview
@Composable
fun PreviewBottomSection() {
    BottomSection(
        onBuyClicked = {}
    )
}