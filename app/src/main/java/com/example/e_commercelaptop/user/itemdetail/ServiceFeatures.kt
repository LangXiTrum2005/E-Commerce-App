package com.example.e_commercelaptop.user.ItemDetail

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.HeadsetMic
import androidx.compose.material.icons.outlined.LocalShipping
import androidx.compose.material.icons.outlined.Replay
import androidx.compose.material.icons.outlined.Verified
import androidx.compose.material3.Icon
import androidx.compose.material3.VerticalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ServiceFeatures() {

    // SERVICE FEATURES CONTAINER
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 24.dp,
                vertical = 16.dp
            )
            .border(
                width = 1.dp,
                color = Color(0xFFE1E7F0),
                shape = RoundedCornerShape(18.dp)
            )
            .padding(
                vertical = 24.dp
            )
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(),

            verticalAlignment =
                Alignment.CenterVertically
        ) {

            // ====================================================
            // 1. SHIPPING
            // ====================================================

            ServiceFeatureItem(
                modifier = Modifier.weight(1f),

                icon = {
                    Icon(
                        imageVector =
                            Icons.Outlined.LocalShipping,

                        contentDescription = null,

                        tint =
                            Color(0xFF2875F2),

                        modifier =
                            Modifier.size(32.dp)
                    )
                },

                title =
                    "Miễn phí giao hàng",

                subtitle =
                    "Toàn quốc"
            )


            // ====================================================
            // DIVIDER
            // ====================================================

            VerticalDivider(
                modifier = Modifier
                    .height(105.dp),

                color =
                    Color(0xFFE5E7EB)
            )


            // ====================================================
            // 2. RETURN
            // ====================================================

            ServiceFeatureItem(
                modifier = Modifier.weight(1f),

                icon = {
                    Icon(
                        imageVector =
                            Icons.Outlined.Replay,

                        contentDescription = null,

                        tint =
                            Color(0xFF2875F2),

                        modifier =
                            Modifier.size(32.dp)
                    )
                },

                title =
                    "Đổi trả dễ dàng",

                subtitle =
                    "Trong 7 ngày"
            )


            // ====================================================
            // DIVIDER
            // ====================================================

            VerticalDivider(
                modifier = Modifier
                    .height(105.dp),

                color =
                    Color(0xFFE5E7EB)
            )


            // ====================================================
            // 3. AUTHENTIC
            // ====================================================

            ServiceFeatureItem(
                modifier = Modifier.weight(1f),

                icon = {
                    Icon(
                        imageVector =
                            Icons.Outlined.Verified,

                        contentDescription = null,

                        tint =
                            Color(0xFF2875F2),

                        modifier =
                            Modifier.size(32.dp)
                    )
                },

                title =
                    "Sản phẩm chính hãng",

                subtitle =
                    "100%"
            )


            // ====================================================
            // DIVIDER
            // ====================================================

            VerticalDivider(
                modifier = Modifier
                    .height(105.dp),

                color =
                    Color(0xFFE5E7EB)
            )


            // ====================================================
            // 4. SUPPORT
            // ====================================================

            ServiceFeatureItem(
                modifier = Modifier.weight(1f),

                icon = {
                    Icon(
                        imageVector =
                            Icons.Outlined.HeadsetMic,

                        contentDescription = null,

                        tint =
                            Color(0xFF2875F2),

                        modifier =
                            Modifier.size(32.dp)
                    )
                },

                title =
                    "Hỗ trợ tư vấn 24/7",

                subtitle =
                    "Hotline, chat"
            )
        }
    }
}


// ====================================================================
// SERVICE FEATURE ITEM
// ====================================================================

@Composable
private fun ServiceFeatureItem(
    modifier: Modifier = Modifier,

    icon: @Composable () -> Unit,

    title: String,

    subtitle: String
) {

    Column(
        modifier = modifier
            .padding(
                horizontal = 8.dp
            ),

        horizontalAlignment =
            Alignment.CenterHorizontally,

        verticalArrangement =
            Arrangement.Center
    ) {

        // ============================================================
        // ICON
        // ============================================================

        icon()


        Spacer(
            modifier = Modifier
                .height(14.dp)
        )


        // ============================================================
        // TITLE
        // ============================================================

        Text(
            text = title,

            fontSize = 14.sp,

            fontWeight =
                FontWeight.Medium,

            color =
                Color.Black,

            textAlign =
                TextAlign.Center,

            maxLines = 2
        )


        Spacer(
            modifier = Modifier
                .height(8.dp)
        )


        // ============================================================
        // SUBTITLE
        // ============================================================

        Text(
            text = subtitle,

            fontSize = 13.sp,

            color =
                Color.Red,

            textAlign =
                TextAlign.Center
        )
    }
}