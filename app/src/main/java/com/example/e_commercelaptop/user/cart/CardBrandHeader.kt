package com.example.e_commercelaptop.user.cart

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commercelaptop.data.local.ProductEntity

@Composable
fun CartBrandHeader(
    brand: String,
    products: List<ProductEntity>,
    selectedProductIds: Set<Int>,
    onToggleBrand: (Boolean) -> Unit,
    onDeleteBrand: () -> Unit
) {

    val allSelected =
        products.isNotEmpty() &&
                products.all {
                    selectedProductIds.contains(it.id)
                }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 12.dp,
                vertical = 8.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = allSelected,
            onCheckedChange = { isChecked ->
                onToggleBrand(isChecked)
            }
        )
        Text(
            text = brand,
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF111827)
        )
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = "Xoá",
            color = Color.Red,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .clickable { onDeleteBrand() }
                .padding(horizontal = 4.dp)
        )
    }
}