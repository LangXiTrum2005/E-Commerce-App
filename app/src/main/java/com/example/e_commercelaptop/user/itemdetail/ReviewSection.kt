package com.example.e_commercelaptop.user.itemdetail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun ReviewSection(
    onRatingSelected: (Float) -> Unit = {}
) {
    // SELECTED RATING
    var selectedRating by remember {
        mutableIntStateOf(0)
    }
    // REVIEW COLUMN
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // TITLE
        Text(
            text = "Đánh giá",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF374151)
        )
        // SPACE
        Spacer(
            modifier = Modifier
                .size(50.dp)
        )
        // RATING NUMBER
        Text(
            text = if (selectedRating == 0) {
                "0.0"
            } else {
                "$selectedRating.0"
            },

            fontSize = 48.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xFF111827)
        )
        // SPACE
        Spacer(
            modifier = Modifier
                .size(10.dp)
        )
        // STARS
        Row(
            horizontalArrangement = Arrangement.spacedBy(3.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(5) { index ->
                val starNumber = index + 1
                val isSelected = starNumber <= selectedRating
                Icon(
                    imageVector = if (isSelected) {
                        Icons.Filled.Star
                    } else {
                        Icons.Outlined.StarBorder
                    },
                    contentDescription = "$starNumber sao",
                    tint = if (isSelected) {
                        Color(0xFFFFA800)
                    } else {
                        Color(0xFFD1D5DB)
                    },
                    modifier = Modifier
                        .size(32.dp)
                        .clickable {
                            // CHỌN SỐ SAO
                            selectedRating =
                                starNumber
                            // TRẢ RATING RA NGOÀI
                            onRatingSelected(
                                starNumber.toFloat()
                            )
                        }
                )
            }
        }
    }
}