package com.example.e_commercelaptop.user.itemdetail

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.HeadsetMic
import androidx.compose.material.icons.outlined.LocalShipping
import androidx.compose.material.icons.outlined.Replay
import androidx.compose.material.icons.outlined.Verified
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ServiceFeatures() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .border(
                width = 1.dp,
                color = Color(0xFFF3F4F6),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(vertical = 16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top
        ) {
            ServiceFeatureItem(
                modifier = Modifier.weight(1f),
                icon = Icons.Outlined.LocalShipping,
                title = "Miễn phí giao hàng",
                subtitle = "Toàn quốc",

            )
            
            VerticalDivider(modifier = Modifier.height(60.dp), color = Color(0xFFF3F4F6))

            ServiceFeatureItem(
                modifier = Modifier.weight(1f),
                icon = Icons.Outlined.Replay,
                title = "Đổi trả dễ dàng",
                subtitle = "Trong 7 ngày"
            )

            VerticalDivider(modifier = Modifier.height(60.dp), color = Color(0xFFF3F4F6))

            ServiceFeatureItem(
                modifier = Modifier.weight(1f),
                icon = Icons.Outlined.Verified,
                title = "Sản phẩm chính hãng",
                subtitle = "100%"
            )

            VerticalDivider(modifier = Modifier.height(60.dp), color = Color(0xFFF3F4F6))

            ServiceFeatureItem(
                modifier = Modifier.weight(1f),
                icon = Icons.Outlined.HeadsetMic,
                title = "Hỗ trợ 24/7",
                subtitle = "Hotline, chat"
            )
        }
    }
}

@Composable
private fun ServiceFeatureItem(
    modifier: Modifier = Modifier,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    subtitle: String
) {
    Column(
        modifier = modifier.padding(horizontal = 4.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF2563EB),
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = title,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF374151),
            textAlign = TextAlign.Center,
            minLines = 2,
            maxLines = 2,
            lineHeight = 14.sp
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = subtitle,
            fontSize = 10.sp,
            color = Color.Red,
            textAlign = TextAlign.Center
        )
    }
}
