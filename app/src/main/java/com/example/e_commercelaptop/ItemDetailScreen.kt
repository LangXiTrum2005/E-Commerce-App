package com.example.e_commercelaptop

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commercelaptop.user.ItemDetail.*

@Composable
fun ItemDetailScreen(
    onBackClick: () -> Unit
) {
    var selectedTab by remember { mutableIntStateOf(0) } // 0: Mô tả, 1: Đánh giá
    var quantity by remember { mutableIntStateOf(1) }

    Scaffold(
        topBar = {
            ItemDetailHeader(
                onBackClick = onBackClick,
                onFavoriteClick = {},
                onShareClick = {},
                onCartClick = {}
            )
        },
        bottomBar = {
            ItemDetailBottomActionBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color(0xFFF9FAFB))
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .background(Color.White),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "",
                    color = Color.Gray,
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(8.dp))
            // QUANTITY SELECTOR
            Box(modifier = Modifier.background(Color.White)) {
                QuantitySelector(
                    quantity = quantity,
                    onQuantityChanged = { newQuantity ->
                        quantity = newQuantity
                    }
                )
            }

            Spacer(modifier = Modifier.height(8.dp))
            // SERVICE FEATURES
            Box(modifier = Modifier.background(Color.White)) {
                ServiceFeatures()
            }

            Spacer(modifier = Modifier.height(8.dp))
            // TABS (Mô tả sản phẩm | Đánh giá)
            Column(modifier = Modifier.background(Color.White)) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TabItem(
                        text = "Mô tả sản phẩm",
                        isSelected = selectedTab == 0,
                        modifier = Modifier.weight(1f),
                        onClick = { selectedTab = 0 }
                    )
                    TabItem(
                        text = "Đánh giá",
                        isSelected = selectedTab == 1,
                        modifier = Modifier.weight(1f),
                        onClick = { selectedTab = 1 }
                    )
                }
                HorizontalDivider(thickness = 1.dp, color = Color(0xFFF3F4F6))

                // TAB CONTENT
                if (selectedTab == 0) {
                    ProductDescription(
                        description = ""
                    )
                } else {
                    ReviewSection()
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
        }
    }
}

@Composable
fun TabItem(
    text: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .clickable(onClick = onClick),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = text,
            fontSize = 15.sp,
            fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Medium,
            color = if (isSelected) Color(0xFF2875F2) else Color(0xFF6B7280)
        )
        if (isSelected) {
            Spacer(modifier = Modifier.height(4.dp))
            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(2.dp)
                    .background(Color(0xFF2875F2))
            )
        }
    }
}
