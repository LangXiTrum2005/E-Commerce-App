package com.example.e_commercelaptop.user.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Laptop
import androidx.compose.material.icons.filled.LocalOffer
import androidx.compose.material.icons.filled.Login
import androidx.compose.material.icons.filled.Security
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commercelaptop.R

@Composable
fun WelcomeScreen(
    onWelcomeClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .statusBarsPadding()
            .navigationBarsPadding()
            .verticalScroll(rememberScrollState())
    ) {

        Image(
            painter = painterResource(id = R.drawable.banner),
            contentDescription = "Laptop",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .clip(CurvedBottomShape()),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(
                modifier = Modifier.height(22.dp)
            )


            // ICON LAPTOP
            Icon(
                imageVector = Icons.Default.Laptop,
                contentDescription = null,
                tint = Color(0xFF2875F2),
                modifier = Modifier.size(55.dp)
            )


            Spacer(
                modifier = Modifier.height(10.dp)
            )

            Text(
                text = "E-Commerce Laptop",
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF2864F0),
                textAlign = TextAlign.Center
            )


            Spacer(
                modifier = Modifier.height(12.dp)
            )


            // DESCRIPTION
            Text(
                text = "Ứng dụng giúp bạn khám phá, lựa chọn và quản lý " +
                        "chiếc laptop phù hợp nhất với nhu cầu của bạn.",
                fontSize = 16.sp,
                color = Color(0xFF53627A),
                lineHeight = 24.sp,
                textAlign = TextAlign.Center
            )


            Spacer(
                modifier = Modifier.height(22.dp)
            )

            FeatureCard(
                icon = Icons.Default.Laptop,
                title = "Khám phá dễ dàng",
                description =
                    "Tìm kiếm và so sánh hàng ngàn mẫu laptop chính hãng, cập nhật liên tục."
            )



            FeatureCard(
                icon = Icons.Default.LocalOffer,
                title = "Lựa chọn thông minh",
                description =
                    "Xem cấu hình, đánh giá và gợi ý để chọn laptop phù hợp với bạn."
            )



            FeatureCard(
                icon = Icons.Default.Security,
                title = "Mua sắm an tâm",
                description =
                    "Thông tin minh bạch, giá tốt và chính sách bảo hành rõ ràng."
            )



            FeatureCard(
                icon = Icons.Default.FavoriteBorder,
                title = "Quản lý thuận tiện",
                description =
                    "Lưu lại sản phẩm yêu thích và theo dõi đơn hàng mọi lúc, mọi nơi."
            )

            Spacer(
                modifier = Modifier.height(14.dp)
            )

            Button(
                onClick = onWelcomeClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2855F5)
                )
            ) {

                Icon(
                    imageVector = Icons.Default.Login,
                    contentDescription = null
                )

                Spacer(
                    modifier = Modifier.width(12.dp)
                )

                Text(
                    text = "Welcome",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }


            Spacer(
                modifier = Modifier.height(24.dp)
            )
        }
    }
}

@Composable
fun FeatureCard(
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    title: String,
    description: String
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 5.dp)
            .clip(
                RoundedCornerShape(18.dp)
            )
            .background(
                Color(0xFFF7F9FF)
            )
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(75.dp)
                .clip(
                    RoundedCornerShape(16.dp)
                )
                .background(
                    Color(0xFFEFF4FF)
                ),
            contentAlignment = Alignment.Center
        ) {

            Icon(
                imageVector = icon,
                contentDescription = null,
                tint = Color(0xFF2864F0),
                modifier = Modifier.size(40.dp)
            )
        }


        Spacer(
            modifier = Modifier.width(15.dp)
        )


        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = title,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF14213D)
            )

            Spacer(
                modifier = Modifier.height(3.dp)
            )

            Text(
                text = description,
                fontSize = 14.sp,
                color = Color(0xFF53627A),
                lineHeight = 20.sp
            )
        }
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen(
        onWelcomeClick = {}
    )
}