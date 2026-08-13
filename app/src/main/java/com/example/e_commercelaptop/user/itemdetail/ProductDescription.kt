package com.example.e_commercelaptop.user.ItemDetail

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProductDescription(
    description: String = ""
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        if (description.isNotBlank()) {
            Text(
                text = description,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                color = Color(0xFF4B5563)
            )
            
            Spacer(modifier = Modifier.height(16.dp))
            
            // Dòng điểm nổi bật (giả lập theo hình ảnh)
            val features = listOf(
                "Thiết kế mỏng nhẹ, hiện đại",
                "Hiệu năng mạnh mẽ với Intel Core i5 1335U",
                "Màn hình 15.6\" FHD sắc nét, viền mỏng",
                "Ổ cứng SSD 512GB tốc độ cao",
                "Đầy đủ cổng kết nối, hỗ trợ làm việc linh hoạt"
            )
            
            features.forEach { feature ->
                Row(
                    modifier = Modifier.padding(vertical = 4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.CheckCircle,
                        contentDescription = null,
                        tint = Color(0xFF10B981),
                        modifier = Modifier.size(16.dp)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = feature,
                        fontSize = 14.sp,
                        color = Color(0xFF4B5563)
                    )
                }
            }
        }
    }
}
