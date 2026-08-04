package com.example.e_commercelaptop.user.branddetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commercelaptop.data.local.ProductEntity

@Composable
fun ProductCard(
    product: ProductEntity,
    onClick: () -> Unit = {}
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp) // CỐ ĐỊNH CHIỀU CAO CARD: Giúp tất cả các card cao bằng chằn chặn
            .clickable { onClick() },
        shape = RoundedCornerShape(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {

            // ONTOP: Ảnh sản phẩm chiếm cố định 130dp
            Image(
                painter = painterResource(id = product.imageResId),
                contentDescription = product.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(130.dp) // Cố định
                    .clip(RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp)),
                contentScale = ContentScale.Crop
            )

            // DOWNTOP: Vùng thông tin lấp đầy khoảng trống còn lại
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f) // Tự co giãn lấp đầy 120dp còn lại
                    .padding(8.dp),
                verticalArrangement = Arrangement.SpaceBetween // Đẩy Hàng Giá + Trạng thái xuống sát đáy card
            ) {

                // Khối thông tin phía trên (Mã, Tên, Chi tiết)
                Column(modifier = Modifier.fillMaxWidth()) {
                    // --- Hàng 1: MÃ SỐ (Bên trái) | TÊN LAPTOP (Bên phải) ---
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        // MÃ SỐ (LE, DE, HP...)
                        Box(
                            modifier = Modifier
                                .border(width = 1.dp, color = Color(0xFFEE4D2D), shape = RoundedCornerShape(4.dp))
                                .background(color = Color(0xFFFFF0ED), shape = RoundedCornerShape(4.dp))
                                .padding(horizontal = 4.dp, vertical = 2.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = product.productCode,
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(0xFFEE4D2D)
                            )
                        }

                        Spacer(modifier = Modifier.width(6.dp))

                        // TÊN LAPTOP (Khóa 1 dòng)
                        Text(
                            text = product.name,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.weight(1f)
                        )
                    }

                    Spacer(modifier = Modifier.height(4.dp))

                    // --- Hàng 2: CHI TIẾT CẤU HÌNH (Khóa 1 dòng) ---
                    Text(
                        text = product.description,
                        fontSize = 11.sp,
                        color = Color.Gray,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }

                // --- Hàng 3: GIÁ (Bên trái) | TRẠNG THÁI (Bên phải) ---
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically // Giúp hàng này luôn nằm đúng mép đáy
                ) {
                    Text(
                        text = product.price,
                        fontSize = 13.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFEE4D2D)
                    )

                    Text(
                        text = product.status,
                        fontSize = 10.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color(0xFF2E7D32)
                    )
                }
            }
        }
    }
}