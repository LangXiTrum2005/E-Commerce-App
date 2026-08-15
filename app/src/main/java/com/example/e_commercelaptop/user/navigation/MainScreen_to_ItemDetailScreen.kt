package com.example.e_commercelaptop.user.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.e_commercelaptop.screen.ItemDetailScreen
import com.example.e_commercelaptop.screen.MainScreen

object AppRoutes {

    const val MAIN = "main"
    const val ITEM_DETAIL = "item_detail/{productId}"
}

@Composable
fun MainScreen_to_ItemDetailScreen() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppRoutes.MAIN
    ) {

        // MAIN SCREEN

        composable(
            route = AppRoutes.MAIN
        ) {

            MainScreen(

                onProductClick = { productId ->

                    // Khi click BẤT KỲ ProductCard nào
                    // → chuyển sang ItemDetailScreen
                    navController.navigate(
                        "item_detail/$productId"
                    )
                }
            )
        }


        // =========================================================
        // ITEM DETAIL SCREEN
        // =========================================================

        composable(
            route = AppRoutes.ITEM_DETAIL,
            arguments = listOf(
                navArgument("productId") { type = NavType.IntType }
            )
        ) { backStackEntry ->
            val productId = backStackEntry.arguments?.getInt("productId") ?: 0

            ItemDetailScreen(
                productId = productId,
                onBackClick = {

                    // ← quay lại MainScreen
                    navController.popBackStack()
                }
            )
        }
    }
}