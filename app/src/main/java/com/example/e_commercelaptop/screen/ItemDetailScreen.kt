package com.example.e_commercelaptop.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.e_commercelaptop.data.local.AppDatabase
import com.example.e_commercelaptop.data.local.CartItemEntity
import com.example.e_commercelaptop.data.local.ProductEntity
import com.example.e_commercelaptop.user.itemdetail.ItemDetailBottomActionBar
import com.example.e_commercelaptop.user.itemdetail.ItemDetailHeader
import com.example.e_commercelaptop.user.itemdetail.ProductDescription
import com.example.e_commercelaptop.user.itemdetail.QuantitySelector
import com.example.e_commercelaptop.user.itemdetail.ReviewSection
import com.example.e_commercelaptop.user.itemdetail.ServiceFeatures
import com.example.e_commercelaptop.user.itemdetail.productinfo.ProductInfo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@Composable
fun ItemDetailScreen(
    productId: Int,
    onBackClick: () -> Unit,
    onCartClick: () -> Unit
) {
    var selectedTab by remember {
        mutableIntStateOf(0)
    }

    var quantity by remember {
        mutableIntStateOf(1)
    }

    val context = LocalContext.current

    val database = remember {
        AppDatabase.getDatabase(context)
    }

    val coroutineScope = rememberCoroutineScope()

    val totalQuantity by database.cartDao().getTotalQuantity().collectAsState(initial = 0)

    var product by remember(productId) {
        mutableStateOf<ProductEntity?>(null)
    }

    // =========================================================
    // LẤY ĐÚNG PRODUCT THEO ID
    // =========================================================

    LaunchedEffect(productId) {

        product = withContext(Dispatchers.IO) {

            database
                .productDao()
                .getProductById(productId)
                .first()
        }
    }

    Scaffold(
        topBar = {

            ItemDetailHeader(
                onBackClick = onBackClick,
                onFavoriteClick = {},
                onShareClick = {},
                onCartClick = onCartClick,
                cartItemCount = totalQuantity ?: 0
            )
        },

        bottomBar = {

            ItemDetailBottomActionBar(
                onAddToCartClick = {
                    coroutineScope.launch {
                        val existingItem = database.cartDao().getCartItemById(productId)
                        val newQuantity = (existingItem?.quantity ?: 0) + quantity
                        database.cartDao().insertOrUpdate(
                            CartItemEntity(productId = productId, quantity = newQuantity)
                        )
                    }
                },
                onBuyNowClick = {}
            )
        }

    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color(0xFFF9FAFB))
                .verticalScroll(
                    rememberScrollState()
                )
        ) {

            // =================================================
            // PRODUCT INFO
            // =================================================

            if (product != null) {

                ProductInfo(
                    product = product!!
                )

            } else {

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .background(Color.White),

                    contentAlignment = Alignment.Center
                ) {

                    Text(
                        text = "Đang tải sản phẩm...",
                        fontSize = 14.sp,
                        color = Color.Gray
                    )
                }
            }

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            // =================================================
            // QUANTITY
            // =================================================

            Box(
                modifier = Modifier.background(
                    Color.White
                )
            ) {

                QuantitySelector(
                    quantity = quantity,
                    onQuantityChanged = { newQuantity ->
                        quantity = newQuantity
                    }
                )
            }

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            // =================================================
            // SERVICE FEATURES
            // =================================================

            Box(
                modifier = Modifier.background(
                    Color.White
                )
            ) {

                ServiceFeatures()
            }

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            // =================================================
            // TABS
            // =================================================

            Column(
                modifier = Modifier.background(
                    Color.White
                )
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(48.dp),

                    verticalAlignment =
                        Alignment.CenterVertically
                ) {

                    TabItem(
                        text = "Mô tả sản phẩm",
                        isSelected = selectedTab == 0,
                        modifier = Modifier.weight(1f),
                        onClick = {
                            selectedTab = 0
                        }
                    )

                    TabItem(
                        text = "Đánh giá",
                        isSelected = selectedTab == 1,
                        modifier = Modifier.weight(1f),
                        onClick = {
                            selectedTab = 1
                        }
                    )
                }

                HorizontalDivider(
                    thickness = 1.dp,
                    color = Color(0xFFF3F4F6)
                )

                // =================================================
                // TAB CONTENT
                // =================================================

                if (selectedTab == 0) {

                    ProductDescription(
                        description =
                            product?.description ?: ""
                    )

                } else {

                    ReviewSection()
                }
            }

            Spacer(
                modifier = Modifier.height(20.dp)
            )
        }
    }
}

@Composable
private fun TabItem(
    text: String,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .clickable {
                onClick()
            },

        verticalArrangement =
            Arrangement.Center,

        horizontalAlignment =
            Alignment.CenterHorizontally
    ) {

        Text(
            text = text,

            fontSize = 15.sp,

            fontWeight =
                if (isSelected) {
                    FontWeight.Bold
                } else {
                    FontWeight.Medium
                },

            color =
                if (isSelected) {
                    Color(0xFF2875F2)
                } else {
                    Color(0xFF6B7280)
                }
        )

        if (isSelected) {

            Spacer(
                modifier = Modifier.height(4.dp)
            )

            Box(
                modifier = Modifier
                    .width(40.dp)
                    .height(2.dp)
                    .background(
                        Color(0xFF2875F2)
                    )
            )
        }
    }
}