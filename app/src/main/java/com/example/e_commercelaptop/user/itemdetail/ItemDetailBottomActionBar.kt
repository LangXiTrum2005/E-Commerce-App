package com.example.e_commercelaptop.user.ItemDetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ItemDetailBottomActionBar(
    // CALLBACKS
    onAddToCartClick: () -> Unit = {},
    onBuyNowClick: () -> Unit = {}
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
            .padding(horizontal = 16.dp, vertical = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // THÊM VÀO GIỎ
        Button(
            onClick = onAddToCartClick,
            modifier = Modifier
                .weight(1f)
                .size(height = 58.dp, width = 0.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0xFFEE4D2D),
                    contentColor = Color.White
                )
        ) {
            Icon(
                imageVector = Icons.Outlined.ShoppingCart,
                contentDescription = "Thêm vào giỏ",
                modifier = Modifier.size(25.dp),
                tint = Color.White
            )
            Text(
                text = "Thêm vào giỏ",
                modifier = Modifier.padding(start = 8.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                color = Color.White
            )
        }

        // MUA NGAY
        Button(
            onClick = onBuyNowClick,

            modifier = Modifier
                .weight(1f)
                .size(height = 58.dp, width = 0.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults
                .buttonColors(
                    containerColor = Color(0xFF2563EB),
                    contentColor = Color.White
            )
        ) {
            Text(
                text = "Mua ngay",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.White
            )
        }
    }
}