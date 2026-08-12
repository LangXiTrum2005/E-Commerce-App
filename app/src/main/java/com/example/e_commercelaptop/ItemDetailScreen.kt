package com.example.e_commercelaptop.user.ItemDetail

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter


@Composable
fun ItemDetailScreen(
    onBackClick: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {

        // =========================================================
        // HEADER
        // =========================================================

        ItemDetailHeader(

            onBackClick = {

                // Quay lại MainScreen

                onBackClick()
            },

            onFavoriteClick = {
                // TODO: xử lý Favorite sau
            },

            onShareClick = {
                // TODO: xử lý Share sau
            },

            onCartClick = {
                // TODO: xử lý Cart sau
            }
        )


        // =========================================================
        // PRODUCT INFO
        // =========================================================
        //
        // Tạm thời để khoảng trống.
        // Sau này sẽ thêm ProductInfo.
        //

        Spacer(
            modifier = Modifier
                .weight(1f)
        )


        // =========================================================
        // QUANTITY SELECTOR
        // =========================================================

        QuantitySelector()


        // =========================================================
        // SERVICE FEATURES
        // =========================================================

        ServiceFeatures()


        // =========================================================
        // PRODUCT DESCRIPTION
        // =========================================================

        ProductDescription()


        // =========================================================
        // REVIEW SECTION
        // =========================================================

        ReviewSection()


        // =========================================================
        // BOTTOM ACTION BAR
        // =========================================================

        BottomActionBar()
    }
}

@Composable
fun BottomActionBar() {
    TODO("Not yet implemented")
}