package com.example.e_commercelaptop.user.itemdetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProductDescription(
    description: String
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF374151),
            modifier = Modifier.padding(bottom = 12.dp)
        )
        Text(
            text = description.ifEmpty { "" },
            fontSize = 14.sp,
            color = Color(0xFF6B7280),
            lineHeight = 20.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ProductDescriptionPreview() {
    ProductDescription(
        description = "Đây là một laptop tuyệt vời với cấu hình mạnh mẽ..."
    )
}
