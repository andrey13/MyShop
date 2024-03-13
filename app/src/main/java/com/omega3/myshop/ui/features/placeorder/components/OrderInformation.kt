package com.omega3.myshop.ui.features.placeorder.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.omega3.myshop.common.previews.PreviewData
import com.omega3.myshop.domain.models.order.Order
import com.omega3.myshop.ui.theme.lightBlack
import com.omega3.myshop.ui.theme.titleTextColor

@Composable
fun OrderInformation(
    order: Order,
) {
    Column(
        modifier = Modifier.padding(10.dp)
    ) {
        OrderSummaryText(
            label = "Name: ",
            value = order.name
        )
        OrderSummaryText(
            label = "Phone:",
            value = order.phone
        )
        OrderSummaryText(
            label = "Address:",
            value = order.address
        )
    }
}

@Composable
fun OrderSummaryText(
    label: String,
    value: String,
    fontSizeLabel: TextUnit = 14.sp,
    fontSizeValue: TextUnit = 16.sp,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            fontSize = fontSizeLabel,
            color = lightBlack
        )
        Spacer(Modifier.padding(5.dp))
        Text(
            text = value,
            fontSize = fontSizeValue,
            color = titleTextColor,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview
@Composable
fun PreviewOrderInformation() {
    OrderInformation(
        order = PreviewData.order
    )
}

@Preview
@Composable
fun PreviewOrderSummaryText() {
    OrderSummaryText(
        label = "Name:",
        value = "Yair Carreno"
    )
}