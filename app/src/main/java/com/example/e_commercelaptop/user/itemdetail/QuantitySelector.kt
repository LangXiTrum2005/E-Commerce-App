package com.example.e_commercelaptop.user.ItemDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
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
            .padding(horizontal = 16.dp, vertical = 12.dp)
            .background(Color.White),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // SỐ LƯỢNG
        Text(
            text = "Số lượng",
            fontSize = 16.sp,
            color = Color(0xFF374151)
        )

        // QUANTITY CONTROL
        Row(
            modifier = Modifier
                .height(40.dp)
                .border(
                    width = 1.dp,
                    color = Color(0xFFE5E7EB),
                    shape = RoundedCornerShape(8.dp)
                ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // GIẢM
            IconButton(
                onClick = {
                    if (quantity > 1) {
                        onQuantityChanged(quantity - 1)
                    }
                },
                modifier = Modifier.size(40.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Remove,
                    contentDescription = "Giảm số lượng",
                    tint = if (quantity > 1) Color(0xFF374151) else Color(0xFFD1D5DB),
                    modifier = Modifier.size(18.dp)
                )
            }

            // GIÁ TRỊ SỐ LƯỢNG
            Text(
                text = quantity.toString(),
                fontSize = 16.sp,
                color = Color(0xFF111827),
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            // TĂNG
            IconButton(
                onClick = {
                    onQuantityChanged(quantity + 1)
                },
                modifier = Modifier.size(40.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Add,
                    contentDescription = "Tăng số lượng",
                    tint = Color(0xFF374151),
                    modifier = Modifier.size(18.dp)
                )
            }
        }
    }
}
