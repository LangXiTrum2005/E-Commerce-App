package com.example.e_commercelaptop.user.itemdetail.productinfo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp

@Composable
fun ProductName(
    name: String,
    description: String
) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = name,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF111827),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )

        Text(
            text = description,
            fontSize = 14.sp,
            color = Color(0xFF374151),
            lineHeight = 20.sp,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis
        )
    }
}