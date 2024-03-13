package com.omega3.myshop.ui.features.cart.components.sections

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.omega3.myshop.ui.composables.buttons.StandardButton
import com.omega3.myshop.R.string as AppText

@Composable
fun CartBottom(
    checkoutSelected: () -> Unit,
    checkoutReady: Boolean
) {
    StandardButton(
        text = stringResource(id = AppText.checkout),
        onClicked = checkoutSelected,
        enabled = checkoutReady
    )
}

@Preview
@Composable
fun PreviewCartBottom() {
    CartBottom(
        checkoutSelected = {},
        checkoutReady = true
    )
}