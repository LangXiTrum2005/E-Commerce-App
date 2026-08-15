package com.example.e_commercelaptop.user.itemdetail.productinfo

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.VerifiedUser
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Warranty(
    warranty: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Icon(
            imageVector = Icons.Outlined.VerifiedUser,
            contentDescription = null,
            tint = Color(0xFF6B7280),
            modifier = Modifier.size(20.dp)
        )

        Text(
            text = warranty,
            modifier = Modifier.padding(start = 6.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            color = Color(0xFF374151)
        )
    }
}