package com.example.e_commercelaptop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commercelaptop.MainScreen
import com.example.e_commercelaptop.user.ItemDetail.ItemDetailScreen

object AppRoutes {

    const val MAIN = "main"
    const val ITEM_DETAIL = "item_detail"
}

@Composable
fun MainScreen_to_ItemDetailScreen() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppRoutes.MAIN
    ) {

        // =========================================================
        // MAIN SCREEN
        // =========================================================

        composable(
            route = AppRoutes.MAIN
        ) {

            MainScreen(

                onProductClick = {

                    // Khi click BẤT KỲ ProductCard nào
                    // → chuyển sang ItemDetailScreen

                    navController.navigate(
                        AppRoutes.ITEM_DETAIL
                    )
                }
            )
        }


        // =========================================================
        // ITEM DETAIL SCREEN
        // =========================================================

        composable(
            route = AppRoutes.ITEM_DETAIL
        ) {

            ItemDetailScreen(

                onBackClick = {

                    // ← quay lại MainScreen

                    navController.popBackStack()
                }
            )
        }
    }
}