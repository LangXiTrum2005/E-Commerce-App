package com.example.e_commercelaptop.user.home

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BrandCategoryRow(
    brands: List<String>,
    selectedBrands: Set<String>,
    onBrandClick: (String) -> Unit = {}
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(vertical = 10.dp),
        contentPadding = PaddingValues(
            horizontal = 12.dp
        ),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(brands) { brand ->
            val isSelected = brand in selectedBrands
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .border(
                        width = 1.dp,
                        color = if (isSelected) {
                            Color(0xFF2563EB)
                        } else {
                            Color(0xFFE2E8F0)
                        },
                        shape = RoundedCornerShape(16.dp)
                    )
                    .background(
                        color = if (isSelected) {
                            Color(0xFF2563EB)
                        } else {
                            Color(0xFFF8FAFC)
                        },
                        shape = RoundedCornerShape(16.dp)
                    )
                    .clickable {
                        onBrandClick(brand)
                    }
                    .padding(horizontal = 16.dp, vertical = 6.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = brand,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    color = if (isSelected) {
                        Color.White
                    } else {
                        Color(0xFF1E293B)
                    }
                )
            }
        }
    }
}