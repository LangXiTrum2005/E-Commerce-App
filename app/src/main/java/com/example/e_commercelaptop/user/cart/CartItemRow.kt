package com.example.e_commercelaptop.user.cart

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Remove
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.e_commercelaptop.data.local.ProductEntity

@Composable
fun CartItemRow(
    product: ProductEntity,
    quantity: Int,
    isSelected: Boolean,
    onSelectedChange: (Boolean) -> Unit,
    onDecrease: () -> Unit,
    onIncrease: () -> Unit,
    onDelete: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .padding(
                start = 12.dp,
                end = 12.dp,
                top = 10.dp,
                bottom = 10.dp
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
         // CHECKBOX
        Checkbox(
            checked = isSelected,
            onCheckedChange = onSelectedChange,
            modifier = Modifier.size(36.dp)
        )
        Spacer(
            modifier = Modifier.width(8.dp)
        )
        // PRODUCT IMAGE
        Box(
            modifier = Modifier
                .size(105.dp)
                .clip(
                    RoundedCornerShape(8.dp)
                )
                .border(
                    BorderStroke(
                        width = 1.dp,
                        color = Color(0xFFE5E7EB)
                    ),
                    RoundedCornerShape(8.dp)
                )
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            AsyncImage(
                model = product.imageUrl,
                contentDescription = product.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                contentScale = ContentScale.Fit
            )
        }
        Spacer(
            modifier = Modifier.width(12.dp)
        )
        //PRODUCT INFORMATION
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = product.name,
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = Color(0xFF111827),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Spacer(
                modifier = Modifier.size(8.dp)
            )
            Text(
                text = product.price,
                fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF111827)
            )
            Spacer(
                modifier = Modifier.size(6.dp)
            )
            Text(
                text = "Xoá",
                color = Color.Red,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .clickable { onDelete() }
            )
            Spacer(
                modifier = Modifier.size(6.dp)
            )
            //QUANTITY
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = onDecrease,
                    modifier = Modifier.size(28.dp)
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Remove,
                        contentDescription = "Giảm",
                        tint = Color(0xFF6B7280),
                        modifier = Modifier.size(18.dp)
                    )
                }
                Text(
                    text = quantity.toString(),
                    modifier = Modifier.width(28.dp),
                    fontSize = 14.sp,
                    color = Color(0xFF111827),

                    textAlign = TextAlign.Center
                )
                IconButton(
                    onClick = onIncrease,
                    modifier = Modifier.size(28.dp)
                ) {

                    Icon(
                        imageVector = Icons.Outlined.Add,
                        contentDescription = "Tăng",
                        tint = Color(0xFF6B7280),
                        modifier = Modifier.size(18.dp)
                    )
                }
            }
        }
    }
}