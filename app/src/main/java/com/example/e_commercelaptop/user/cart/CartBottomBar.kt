package com.example.e_commercelaptop.user.cart

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ConfirmationNumber
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CartBottomBar(
    selectedCount: Int,
    totalPrice: String,
    allSelected: Boolean,
    onSelectAll: () -> Unit,
    onLaptopVoucherClick: () -> Unit,
    onBuyClick: () -> Unit
) {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding(),
        color = Color.White,
        shadowElevation = 8.dp
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
             // LAPTOP VOUCHER ROW
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onLaptopVoucherClick() }
                    .padding(
                        horizontal = 14.dp,
                        vertical = 12.dp
                    ),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Outlined.ConfirmationNumber,
                    contentDescription = null,
                    tint = Color(0xFF64748B),
                    modifier = Modifier.size(22.dp)
                )
                Spacer(
                    modifier = Modifier.size(10.dp)
                )
                Text(
                    text = "Laptop Voucher",
                    modifier = Modifier.weight(1f),
                    fontSize = 14.sp,
                    color = Color(0xFF111827)
                )
                Text(
                    text = "Chọn hoặc nhập mã",
                    fontSize = 13.sp,
                    color = Color(0xFF9CA3AF)
                )
                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowRight,
                    contentDescription = null,
                    tint = Color(0xFF9CA3AF),
                    modifier = Modifier.size(20.dp)
                )
            }
            HorizontalDivider(
                color = Color(0xFFF0F0F0)
            )
             // BOTTOM ACTION ROW
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                 // SELECT ALL
                Checkbox(
                    checked = allSelected,
                    onCheckedChange = {
                        onSelectAll()
                    }
                )
                Text(
                    text = "Tất cả",
                    fontSize = 14.sp,
                    color = Color(0xFF111827)
                )
                Spacer(
                    modifier = Modifier.weight(1f)
                )
                // TOTAL PRICE
                Text(
                    text = totalPrice,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF111827)
                )
                Spacer(
                    modifier = Modifier.width(8.dp)
                )
                 // BUY BUTTON
                Button(
                    onClick = onBuyClick,
                    shape = RoundedCornerShape(6.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF2875F2)
                    ),
                    contentPadding = androidx.compose.foundation.layout.
                        PaddingValues(horizontal = 16.dp, vertical = 0.dp)
                ) {
                    Text(
                        text = "Mua hàng ($selectedCount)",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White
                    )
                }
            }
        }
    }
}