package com.example.e_commercelaptop.user.itemdetail.productinfo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ProductImage(
    imageUrl: String?,
    productName: String
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(230.dp)
            .clip(
                RoundedCornerShape(8.dp)
            )
            .background(Color.White),
        contentAlignment = Alignment.Center
    ) {

        AsyncImage(
            model = imageUrl?.trim(),
            contentDescription = productName,
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Fit
        )
    }
}