package com.example.e_commercelaptop.user.ItemDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Remove
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun QuantitySelector(
    quantity: Int = 1,
    onQuantityChanged: (Int) -> Unit = {}
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp)
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        // SỐ LƯỢNG
        Text(
            text = "Số lượng",
            fontSize = 18.sp,
            color = Color.Black
        )

        // QUANTITY CONTROL
        Row(
            modifier = Modifier
                .height(72.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFD9DEE8),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(horizontal = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {

            // GIẢM
            IconButton(
                onClick = {
                    if (quantity > 1) {
                        onQuantityChanged(quantity - 1)
                    }
                },
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Remove,
                    contentDescription = "Giảm số lượng",
                    tint = if (quantity > 1) {
                        Color(0xFF2875F2)
                    } else {
                        Color(0xFFD1D5DB)
                    },

                    modifier = Modifier.size(22.dp)
                )
            }

            // GIÁ TRỊ SỐ LƯỢNG
            Text(
                text = quantity.toString(),
                fontSize = 18.sp,
                color = Color(0xFF111827),
                modifier = Modifier
                    .padding(horizontal = 12.dp)
            )

            // TĂNG
            IconButton(
                onClick = {
                    onQuantityChanged(quantity + 1)
                },

                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Add,
                    contentDescription = "Tăng số lượng",
                    tint = Color(0xFF2875F2),
                    modifier = Modifier.size(22.dp)
                )
            }
        }
    }
}