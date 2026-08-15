package com.example.e_commercelaptop.user.itemdetail.productinfo

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Brand(
    productCode: String
) {
    Text(
        text = productCode,
        modifier = Modifier.fillMaxWidth(),
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF2875F2)
    )
}