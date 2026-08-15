package com.example.e_commercelaptop.user.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun VipBanner(onClick: () -> Unit = {}) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { onClick() },
        shape = RoundedCornerShape(8.dp),
        color = Color(0xFFE8F0FE),
        shadowElevation = 2.dp
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(Color(0xFF1A73E8), RoundedCornerShape(4.dp)),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "VIP", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 12.sp)
            }

            Spacer(modifier = Modifier.width(12.dp))

            Text(
                text = buildAnnotatedString {
                    append("Với LaptopVIP, bạn đã tiết kiệm: ")
                    withStyle(style = SpanStyle(color = Color(0xFF1A73E8), fontWeight = FontWeight.Bold)) {
                        append("?.???.???đ")
                    }
                },
                fontSize = 13.sp,
                modifier = Modifier.weight(1f)
            )

            Icon(
                imageVector = Icons.Default.ChevronRight,
                contentDescription = null,
                tint = Color.Gray
            )
        }
    }
}