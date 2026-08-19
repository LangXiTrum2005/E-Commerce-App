package com.example.e_commercelaptop.user.cart

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.e_commercelaptop.data.local.ProductEntity

@Composable
fun CartScreen(
    products: List<ProductEntity>,
    quantities: Map<Int, Int>,
    selectedProductIds: Set<Int>,
    onBackClick: () -> Unit,
    onProductSelected: (Int, Boolean) -> Unit,
    onDecreaseQuantity: (Int) -> Unit,
    onIncreaseQuantity: (Int) -> Unit,
    onDeleteProduct: (Int) -> Unit,
    onDeleteBrand: (String) -> Unit,
    onSelectAll: () -> Unit,
    onLaptopVoucherClick: () -> Unit = {},
    onBuyClick: () -> Unit = {}
) {

    val totalQuantity = quantities.values.sum()
    val selectedCount = selectedProductIds.size
    val totalPriceValue = products
        .filter { selectedProductIds.contains(it.id) }
        .sumOf { product ->
            val priceValue = product.price.replace(Regex("[^0-9]"), "").toLongOrNull() ?: 0L
            priceValue * (quantities[product.id] ?: 1)
        }
    val formattedTotalPrice = java.text.DecimalFormat("#,###")
        .format(totalPriceValue)
        .replace(",", ".") + "₫"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
         // HEADER
         Surface(
            modifier = Modifier.fillMaxWidth(),
            color = Color.White
        ) {
            CartHeader(
                cartItemCount = totalQuantity,
                onBackClick = onBackClick
            )
        }
        // CONTENT
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth(),
            contentPadding = PaddingValues(top = 8.dp, bottom = 8.dp)
        ) {
            // GROUP PRODUCTS BY BRAND
             val groupedProducts = products.groupBy {
                it.brand
            }
            groupedProducts.forEach { (brand, brandProducts) ->
                item(
                    key = "brand_$brand"
                ) {
                    CartBrandHeader(
                        brand = brand,
                        products = brandProducts,
                        selectedProductIds = selectedProductIds,
                        onToggleBrand = { isSelected ->
                            brandProducts.forEach { product ->
                                onProductSelected(product.id, isSelected)
                            }
                        },
                        onDeleteBrand = {
                            onDeleteBrand(brand)
                        }
                    )
                }
                items(
                    items = brandProducts,
                    key = { product ->
                        product.id
                    }
                ) { product ->
                    CartItemRow(
                        product = product,
                        quantity = quantities[product.id] ?: 1,
                        isSelected = selectedProductIds.contains(
                            product.id
                        ),
                        onSelectedChange = { selected ->
                            onProductSelected(
                                product.id,
                                selected
                            )
                        },
                        onDecrease = {
                            onDecreaseQuantity(product.id)
                        },
                        onIncrease = {
                            onIncreaseQuantity(product.id)
                        },
                        onDelete = {
                            onDeleteProduct(product.id)
                        }
                    )
                }
            }
        }
        //BOTTOM BAR
       CartBottomBar(
            selectedCount = selectedCount,
            totalPrice = formattedTotalPrice,
            allSelected = products.isNotEmpty() &&
                    selectedProductIds.size == products.size,
            onSelectAll = onSelectAll,
            onLaptopVoucherClick = onLaptopVoucherClick,
            onBuyClick = onBuyClick
        )
    }
}
