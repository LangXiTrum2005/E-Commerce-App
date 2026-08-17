package com.example.e_commercelaptop.user.cart

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CartHeader(
    cartItemCount: Int,
    onBackClick: () -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .statusBarsPadding()
            .height(60.dp)
            .padding(horizontal = 8.dp),

        verticalAlignment = Alignment.CenterVertically,

        horizontalArrangement = Arrangement.Start
    ) {

        IconButton(
            onClick = onBackClick
        ) {

            Icon(
                imageVector = Icons.Outlined.ArrowBack,
                contentDescription = "Quay lại",
                tint = Color(0xFF111827)
            )
        }

        Text(
            text = "Giỏ hàng ($cartItemCount)",

            modifier = Modifier.weight(1f),

            fontSize = 20.sp,

            fontWeight = FontWeight.SemiBold,

            color = Color(0xFF111827)
        )
    }
}