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

@Composable
fun MainScreen(
    onNavigateToBrandDetail: (String) -> Unit = {},
    onProductClick: (Int) -> Unit = {}
) {
    var selectedTab by remember { mutableStateOf("Home") }
    var selectedBrands by remember {
        mutableStateOf<Set<String>>(emptySet())
    }
    val context = LocalContext.current
    val db = remember {
        AppDatabase.getDatabase(context)
    }

    // Danh sách sản phẩm lấy từ Room DB
    var productList by remember {
        mutableStateOf<List<ProductEntity>>(emptyList())
    }

    // Tự động kiểm tra và chèn dữ liệu
    // nếu Database đang trống
    LaunchedEffect(Unit) {
        withContext(Dispatchers.IO) {
            val dao = db.productDao()
            dao.getAllProducts().collect { list ->
                if (list.isEmpty()) {
                    // Chèn danh sách sản phẩm ban đầu
                    dao.insertProducts(
                        ProductRepository.initialProducts
                    )
                } else {
                    // Database đã có dữ liệu
                    productList = list
                }
            }
        }
    }
    val displayedBrands = when (selectedTab) {

        "Office" -> listOf(
            "LENOVO",
            "DELL",
            "HP",
            "MACBOOK",
            "ASUS"
        )

        "Gaming" -> listOf(
            "LENOVO",
            "DELL",
            "ASUS",
            "ACER",
            "MSI",
            "GIGABYTE"
        )

        "Business" -> listOf(
            "LENOVO",
            "DELL",
            "MACBOOK",
            "MICROSOFT",
            "LG"
        )

        else -> listOf(
            "LENOVO",
            "DELL",
            "HP",
            "MACBOOK",
            "ASUS",
            "ACER",
            "MSI",
            "MICROSOFT",
            "LG",
            "GIGABYTE"
        )
    }

    // LỌC sản phẩm theo ProductCode
    val filteredProducts = remember(
        productList,
        selectedBrands
    ) {
        if (selectedBrands.isEmpty()) {
            productList
        } else {
            val selectedProductCodes = selectedBrands
                .map {
                    it.take(2).uppercase()
                }
                .toSet()
            // Lọc sản phẩm
            productList.filter { product ->
                product.productCode in selectedProductCodes
            }
        }
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            if (selectedTab != "Account") {
                Box(
                    modifier = Modifier.statusBarsPadding()
                ) {
                    HomeHeader(
                        onSearchClick = {},
                        onCartClick = {},
                        onChatClick = {}
                    )
                }
            }
        },
        bottomBar = {
            Box(
                modifier = Modifier.navigationBarsPadding()
            ) {
                HomeFooter(
                    selectedTab = selectedTab,
                    onTabSelected = { tabName ->
                        selectedTab = tabName
                        selectedBrands = emptySet()
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
                BrandCategoryRow(
                    brands = displayedBrands,
                    selectedBrands = selectedBrands,
                    onBrandClick = { brand ->
                        selectedBrands =
                            if (brand in selectedBrands) {
                                selectedBrands - brand
                            } else {
                                selectedBrands + brand
                            }
                    }
                )
                Spacer(
                    modifier = Modifier.height(4.dp)
                )

                LazyVerticalGrid(
                    modifier = Modifier.fillMaxSize(),
                    columns = GridCells.Fixed(2),
                    contentPadding = PaddingValues(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    items(filteredProducts) { product ->
                        ProductCard(
                            product = product,
                            onClick = {
                                onProductClick(product.id)
                            }
                        )
                    }
                }
            }
        }
    }
}