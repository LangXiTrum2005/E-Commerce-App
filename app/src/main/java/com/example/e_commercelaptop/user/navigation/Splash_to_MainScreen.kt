package com.example.e_commercelaptop.user.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.e_commercelaptop.screen.ItemDetailScreen
import com.example.e_commercelaptop.screen.MainScreen
import com.example.e_commercelaptop.data.OnboardingPrefs
import com.example.e_commercelaptop.user.cart.CartScreen
import com.example.e_commercelaptop.user.welcome.WelcomeScreen
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import com.example.e_commercelaptop.data.local.AppDatabase
@Composable
fun Splash_to_MainScreen() {

    val context = LocalContext.current

    val onboardingPrefs =
        remember {
            OnboardingPrefs(context)
        }

    val isFirstTime =
        remember {
            onboardingPrefs.isFirstTime()
        }

    val navController =
        rememberNavController()

    NavHost(
        navController = navController,

        startDestination =
            if (isFirstTime) {
                "welcome"
            } else {
                "main"
            }
    ) {
        // WELCOME
        composable("welcome") {

            WelcomeScreen(

                onWelcomeClick = {

                    onboardingPrefs
                        .setFirstTimeCompleted()

                    navController.navigate("main") {

                        popUpTo("welcome") {
                            inclusive = true
                        }
                    }
                }
            )
        }
        // MAIN
        composable("main") {
            MainScreen(
                onProductClick = { productId ->
                    // Truyền ID cho sản phẩm được click
                    navController.navigate(
                        "item_detail/$productId"
                    )
                },
                onCartClick = {
                    navController.navigate("cart")
                }
            )
        }

        // CART
        composable("cart") {
            val database = remember { AppDatabase.getDatabase(context) }
            val coroutineScope = rememberCoroutineScope()

            val cartItems by database.cartDao().getAllCartItems().collectAsState(initial = emptyList())
            val allProducts by database.productDao().getAllProducts().collectAsState(initial = emptyList())

            val cartProducts = remember(cartItems, allProducts) {
                cartItems.mapNotNull { cartItem ->
                    allProducts.find { it.id == cartItem.productId }
                }
            }

            val quantities = remember(cartItems) {
                cartItems.associate { it.productId to it.quantity }
            }

            var selectedProductIds by remember {
                mutableStateOf(emptySet<Int>())
            }

            CartScreen(
                products = cartProducts,
                quantities = quantities,
                selectedProductIds = selectedProductIds,
                onBackClick = {
                    navController.popBackStack()
                },
                onProductSelected = { productId, isSelected ->
                    selectedProductIds = if (isSelected) {
                        selectedProductIds + productId
                    } else {
                        selectedProductIds - productId
                    }
                },
                onDecreaseQuantity = { productId ->
                    val currentQty = quantities[productId] ?: 1
                    if (currentQty > 1) {
                        coroutineScope.launch {
                            database.cartDao().updateQuantity(productId, currentQty - 1)
                        }
                    }
                },
                onIncreaseQuantity = { productId ->
                    val currentQty = quantities[productId] ?: 1
                    coroutineScope.launch {
                        database.cartDao().updateQuantity(productId, currentQty + 1)
                    }
                },
                onDeleteProduct = { productId ->
                    coroutineScope.launch {
                        database.cartDao().deleteById(productId)
                    }
                },
                onDeleteBrand = { brandName ->
                    coroutineScope.launch {
                        val productsInBrand = cartProducts.filter { it.brand == brandName }
                        productsInBrand.forEach { product ->
                            database.cartDao().deleteById(product.id)
                        }
                    }
                },
                onSelectAll = {
                    val allIds = cartProducts.map { it.id }.toSet()
                    selectedProductIds = if (selectedProductIds.size == allIds.size) {
                        emptySet()
                    } else {
                        allIds
                    }
                }
            )
        }

        // =====================================================
        // ITEM DETAIL
        // =====================================================

        composable(

            route = "item_detail/{productId}",

            arguments = listOf(

                navArgument("productId") {

                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->

            val productId =
                backStackEntry
                    .arguments
                    ?.getInt("productId")
                    ?: return@composable

            ItemDetailScreen(

                productId = productId,

                onBackClick = {

                    navController.popBackStack()
                },

                onCartClick = {
                    navController.navigate("cart")
                }
            )
        }
    }
}