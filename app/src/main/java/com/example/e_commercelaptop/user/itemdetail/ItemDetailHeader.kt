package com.example.e_commercelaptop.user.itemdetail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.IosShare
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ItemDetailHeader(
    onBackClick: () -> Unit = {},
    onFavoriteClick: () -> Unit = {},
    onShareClick: () -> Unit = {},
    onCartClick: () -> Unit = {}
) {

    Row(
        modifier = Modifier
            .statusBarsPadding()
            .fillMaxWidth()
            .height(64.dp)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            onClick = onBackClick,
            modifier = Modifier.size(48.dp)
        ) {
            Icon(
                imageVector =
                    Icons.Outlined.ArrowBack,
                contentDescription = "Quay lại",
                tint = Color(0xFF111827),
                modifier = Modifier.size(28.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            IconButton(
                onClick = onFavoriteClick,
                modifier = Modifier.size(48.dp)
            ) {

                Icon(
                    imageVector = Icons.Outlined.FavoriteBorder,
                    contentDescription = "Yêu thích",
                    tint = Color(0xFF111827),
                    modifier = Modifier.size(28.dp)
                )
            }
            IconButton(
                onClick = onShareClick,
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Share,
                    contentDescription = "Chia sẻ",
                    tint = Color(0xFF111827),
                    modifier = Modifier.size(28.dp)
                )
            }
            IconButton(
                onClick = onCartClick,
                modifier = Modifier.size(48.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.ShoppingCart,
                    contentDescription = "Giỏ hàng",
                    tint = Color(0xFF111827),
                    modifier = Modifier.size(29.dp)
                )
            }
        }
    }
}