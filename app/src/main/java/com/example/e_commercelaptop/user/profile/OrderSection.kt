package com.example.e_commercelaptop.user.profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.outlined.Inventory2
import androidx.compose.material.icons.outlined.LocalShipping
import androidx.compose.material.icons.outlined.StarOutline
import androidx.compose.material.icons.outlined.Wallet
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
fun OrderSection(
    onViewHistoryClick: () -> Unit = {},
    onOrderStatusClick: (String) -> Unit = {}
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Đơn mua",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .clickable { onViewHistoryClick() }
                    .padding(4.dp)
            ) {
                Text(
                    text = "Xem lịch sử mua hàng",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
                Icon(
                    imageVector = Icons.Default.ChevronRight,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier.size(16.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            OrderItem(Icons.Outlined.Inventory2, "Chờ xác nhận", Modifier.weight(1f), onClick = { onOrderStatusClick("Chờ xác nhận") })
            OrderItem(Icons.Outlined.Wallet, "Chờ lấy hàng", Modifier.weight(1f), onClick = { onOrderStatusClick("Chờ lấy hàng") })
            OrderItem(Icons.Outlined.LocalShipping, "Đang giao hàng", Modifier.weight(1f), onClick = { onOrderStatusClick("Đang giao hàng") })
            OrderItem(Icons.Outlined.StarOutline, "Đã đánh giá", Modifier.weight(1f), onClick = { onOrderStatusClick("Đã đánh giá") })
        }
    }
}

@Composable
fun OrderItem(
    icon: ImageVector,
    label: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable { onClick() }
            .padding(vertical = 8.dp, horizontal = 4.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            tint = Color(0xFF1A73E8),
            modifier = Modifier.size(28.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = label,
            fontSize = 11.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            lineHeight = 14.sp,
            minLines = 2
        )
    }
}