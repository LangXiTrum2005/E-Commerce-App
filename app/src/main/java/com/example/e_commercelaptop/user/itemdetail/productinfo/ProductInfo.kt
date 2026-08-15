package com.example.e_commercelaptop.user.itemdetail.productinfo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.e_commercelaptop.data.local.ProductEntity

@Composable
fun ProductInfo(
    product: ProductEntity
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(16.dp),

        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.Top
    ) {

        // =====================================================
        // BÊN TRÁI - 50%
        // =====================================================

        Column(
            modifier = Modifier.weight(1f)
        ) {

            ProductImage(
                imageUrl = product.imageUrl,
                productName = product.name
            )
        }

        // =====================================================
        // BÊN PHẢI - 50%
        // =====================================================

        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            // BRAND = PRODUCT CODE
            Brand(
                productCode = product.productCode
            )

            // NAME + DESCRIPTION
            ProductName(
                name = product.name,
                description = product.description
            )

            Spacer(
                modifier = Modifier.height(2.dp)
            )

            // PRICE
            Price(
                price = product.price
            )

            // STOCK
            Stock(
                stock = "Còn hàng"
            )

            // WARRANTY
            Warranty(
                warranty = "Bảo hành chính hãng 12 tháng"
            )
        }
    }
}