package com.example.e_commercelaptop.user.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OfferSection(onOfferClick: (String) -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Ưu đãi dành riêng cho bạn",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OfferItem(Icons.Outlined.Percent, "Mã giảm giá", modifier = Modifier.weight(1f), onClick = { onOfferClick("Mã giảm giá") })
            OfferItem(Icons.Outlined.Star, "LaptopVIP", modifier = Modifier.weight(1f), onClick = { onOfferClick("LaptopVIP") })
            OfferItem(Icons.Outlined.FlashOn, "Flash Sale", modifier = Modifier.weight(1f), onClick = { onOfferClick("Flash Sale") })
            OfferItem(Icons.Outlined.CardGiftcard, "Quà tặng", modifier = Modifier.weight(1f), onClick = { onOfferClick("Quà tặng") })
            OfferItem(Icons.Outlined.NewReleases, "Sản phẩm mới", modifier = Modifier.weight(1f), onClick = { onOfferClick("Sản phẩm mới") })
        }
    }
}

@Composable
fun OfferItem(
    icon: ImageVector,
    label: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .clip(androidx.compose.foundation.shape.RoundedCornerShape(8.dp))
            .clickable { onClick() }
            .padding(vertical = 4.dp)
    ) {
        Box(
            modifier = Modifier
                .size(44.dp)
                .background(Color(0xFF1A73E8), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = icon,
                contentDescription = label,
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = label,
            fontSize = 10.sp,
            textAlign = TextAlign.Center,
            lineHeight = 12.sp,
            modifier = Modifier.fillMaxWidth()
        )
    }
}