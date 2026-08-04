package com.example.e_commercelaptop.user.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.outlined.Chat
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commercelaptop.ui.theme.YellowMain

@Composable
fun HomeHeader(
    modifier: Modifier = Modifier,
    onSearchClick: () -> Unit = {},
    onCartClick: () -> Unit = {},
    onChatClick: () -> Unit = {}
){ // 1. Thanh tim kiem chiem 3/4 (weight = 3f)
    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(44.dp)
            .background(YellowMain)
            .padding(horizontal = 12.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            modifier = Modifier
                .weight(3f)
                .height(40.dp)
                .background(Color.White, shape = RoundedCornerShape(8.dp))
                .clickable { onSearchClick() } // Sử lý nút bấm searchClick *
                .padding(horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search",
                tint = Color.Gray,
                modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))

            Text(
                text = "Tìm kiếm laptop, phụ kiện giá rẻ...",
                fontSize = 13.sp,
                color = Color.Gray
            )
        }
        Row(
            modifier = modifier.weight(1f),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = onCartClick, modifier = Modifier.size(28.dp)) {
                Icon(
                    imageVector = Icons.Outlined.ShoppingCart,
                    contentDescription = "Cart",
                    tint = Color.Black
                )
            }

            IconButton(onClick = onChatClick, modifier = Modifier.size(28.dp)) {
                Icon(
                    imageVector = Icons.AutoMirrored.Outlined.Chat,
                    contentDescription = "Chat",
                    tint = Color.Black
                )
            }
        }
    }
}