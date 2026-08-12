package com.example.e_commercelaptop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commercelaptop.data.local.AppDatabase
import com.example.e_commercelaptop.data.local.ProductEntity
import com.example.e_commercelaptop.data.local.ProductRepository
import com.example.e_commercelaptop.user.home.BrandCategoryRow
import com.example.e_commercelaptop.user.home.HomeFooter
import com.example.e_commercelaptop.user.home.HomeHeader
import com.example.e_commercelaptop.user.branddetail.ProductCard
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@Preview
@Composable
fun MainScreen(
    onNavigateToBrandDetail: (String) -> Unit = {},
    onProductClick: (Int) -> Unit = {} // Sự kiện khi bấm vào card sản phẩm
) {
    var selectedTab by remember { mutableStateOf("Home") }

    // 1. Khởi tạo Room Database
    val context = LocalContext.current
    val db = remember { AppDatabase.getDatabase(context) }

    // Biến chứa danh sách sản phẩm lấy từ Room DB
    var productList by remember { mutableStateOf<List<ProductEntity>>(emptyList()) }

    // 2. Tự động kiểm tra và chèn dữ liệu từ ProductRepository.initialProducts vào Room nếu DB trống
    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            val dao = db.productDao()
            dao.getAllProducts().collect { list ->
                if (list.isEmpty()) {
                    // Chèn danh sách 18 laptop từ ProductRepository.initialProducts
                    dao.insertProducts(ProductRepository.initialProducts)
                } else {
                    productList = list
                }
            }
        }
    }

    // Dải thương hiệu đổi theo Tab
    val displayedBrands = when (selectedTab) {
        "Office" -> listOf("LENOVO", "DELL", "HP", "MACBOOK", "ASUS")
        "Gaming" -> listOf("LENOVO", "DELL", "ASUS", "ACER", "MSI", "GIGABYTE")
        "Business" -> listOf("LENOVO", "DELL", "MACBOOK", "MICROSOFT", "LG")
        else -> listOf("LENOVO", "DELL", "HP", "MACBOOK", "ASUS", "ACER", "MSI", "MICROSOFT", "LG", "GIGABYTE")
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            if (selectedTab != "Account") {
                Box(modifier = Modifier.statusBarsPadding()) {
                    HomeHeader(
                        onSearchClick = {},
                        onCartClick = {},
                        onChatClick = {}
                    )
                }
            }
        },
        bottomBar = {
            Box(modifier = Modifier.navigationBarsPadding()) {
                HomeFooter(
                    selectedTab = selectedTab,
                    onTabSelected = { tabName ->
                        selectedTab = tabName
                    }
                )
            }
        }
    ) { innerPadding ->
        if (selectedTab == "Account") {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White)
                    .padding(innerPadding)
            )
        } else {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFFF5F5F5))
                    .padding(innerPadding)
            ) {
                // Dải nút thương hiệu cuộn ngang
                BrandCategoryRow(
                    brands = displayedBrands,
                    onBrandClick = { brand ->
                        onNavigateToBrandDetail(brand)
                    }
                )

                Spacer(modifier = Modifier.height(4.dp))

                // Lưới hiển thị 2 cột danh sách laptop lấy từ Room DB
                LazyVerticalGrid(
                    columns = GridCells.Fixed(2),
                    contentPadding = PaddingValues(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(productList) { product ->
                        ProductCard(
                            product = product,
                            onClick = { onProductClick(product.id) }
                        )
                    }
                }
            }
        }
    }
}