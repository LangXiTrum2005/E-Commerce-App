package com.example.e_commercelaptop.user.profile

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBalanceWallet
import androidx.compose.material.icons.outlined.ConfirmationNumber
import androidx.compose.material.icons.outlined.CreditCard
import androidx.compose.material.icons.outlined.Savings
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
fun UtilitySection(onUtilityClick: (String) -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(
            text = "Tiện ích của tôi",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            UtilityItem(Icons.Outlined.AccountBalanceWallet, "Ví LaptopPay", "Số dư 1.250.000đ", Modifier.weight(1f), onClick = { onUtilityClick("Ví LaptopPay") })
            UtilityItem(Icons.Outlined.CreditCard, "Trả góp 0%", "Hạn mức 20.000.000đ", Modifier.weight(1f), onClick = { onUtilityClick("Trả góp 0%") })
            UtilityItem(Icons.Outlined.Savings, "Xu Laptop", "Nhận xu mỗi ngày", Modifier.weight(1f), onClick = { onUtilityClick("Xu Laptop") })
            UtilityItem(Icons.Outlined.ConfirmationNumber, "Kho Voucher", "12 Voucher", Modifier.weight(1f), onClick = { onUtilityClick("Kho Voucher") })
        }
    }
}

@Composable
fun UtilityItem(
    icon: ImageVector,
    label: String,
    subLabel: String,
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
            tint = Color.Black,
            modifier = Modifier.size(28.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = label,
            fontSize = 11.sp,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            maxLines = 1
        )
        Spacer(modifier = Modifier.height(2.dp))
        Text(
            text = subLabel,
            fontSize = 9.sp,
            color = Color(0xFF1A73E8),
            textAlign = TextAlign.Center,
            lineHeight = 12.sp,
            minLines = 2
        )
    }
}