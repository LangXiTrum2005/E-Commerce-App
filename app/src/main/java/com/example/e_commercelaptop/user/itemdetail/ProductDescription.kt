package com.example.e_commercelaptop.user.ItemDetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ProductDescription(
    description: String = ""
) {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 16.dp,
                vertical = 20.dp
            )
    ) {

        // ============================================================
        // TITLE
        // ============================================================

        Text(
            text = "Mô tả sản phẩm",

            fontSize = 18.sp,

            fontWeight =
                FontWeight.Bold,

            color =
                Color(0xFF2563EB)
        )


        // ============================================================
        // DESCRIPTION
        // ============================================================
        //
        // 🔴 THAY ĐỔI:
        //
        // Mày tự truyền description sau.
        //
        // ============================================================

        if (description.isNotBlank()) {

            Text(
                text = description,

                modifier = Modifier
                    .padding(
                        top = 16.dp
                    ),

                fontSize = 15.sp,

                lineHeight = 24.sp,

                color =
                    Color(0xFF111827)
            )
        }
    }
}