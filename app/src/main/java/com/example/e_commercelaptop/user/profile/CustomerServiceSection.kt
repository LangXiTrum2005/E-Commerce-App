package com.example.e_commercelaptop.user.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronRight
import androidx.compose.material.icons.outlined.HeadsetMic
import androidx.compose.material.icons.outlined.HelpOutline
import androidx.compose.material.icons.outlined.History
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomerServiceSection(
    onSeeMoreClick: () -> Unit = {},
    onServiceClick: (String) -> Unit = {}
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
                text = "Dịch vụ khách hàng",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(4.dp))
                    .clickable { onSeeMoreClick() }
                    .padding(4.dp)
            ) {
                Text(
                    text = "Xem thêm",
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

        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                ServiceItem(Icons.Outlined.HelpOutline, "Trung tâm trợ giúp", "Tìm câu trả lời cho bạn", Modifier.weight(1f), onClick = { onServiceClick("Trung tâm trợ giúp") })
                ServiceItem(Icons.Outlined.History, "Đổi trả hàng", "Dễ dàng & nhanh chóng", Modifier.weight(1f), onClick = { onServiceClick("Đổi trả hàng") })
            }
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                ServiceItem(Icons.Outlined.VerifiedUser, "Bảo hành sản phẩm", "Tra cứu bảo hành", Modifier.weight(1f), onClick = { onServiceClick("Bảo hành sản phẩm") })
                ServiceItem(Icons.Outlined.HeadsetMic, "Liên hệ chúng tôi", "Hỗ trợ 24/7", Modifier.weight(1f), onClick = { onServiceClick("Liên hệ chúng tôi") })
            }
        }
    }
}

@Composable
fun ServiceItem(
    icon: ImageVector,
    title: String,
    desc: String,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(4.dp))
            .background(Color(0xFFF5F5F5))
            .clickable { onClick() }
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Column {
            Text(text = title, fontSize = 12.sp, fontWeight = FontWeight.Medium)
            Text(text = desc, fontSize = 10.sp, color = Color.Gray)
        }
    }
}