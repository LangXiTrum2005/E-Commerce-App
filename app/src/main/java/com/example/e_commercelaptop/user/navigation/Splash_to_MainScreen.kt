package com.example.e_commercelaptop.user.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.e_commercelaptop.screen.ItemDetailScreen
import com.example.e_commercelaptop.screen.MainScreen
import com.example.e_commercelaptop.data.OnboardingPrefs
import com.example.e_commercelaptop.user.welcome.WelcomeScreen

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

        // =====================================================
        // WELCOME
        // =====================================================

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

        // =====================================================
        // MAIN
        // =====================================================

        composable("main") {

            MainScreen(

                onProductClick = { productId ->

                    // =========================================
                    // TRUYỀN ID CỦA SẢN PHẨM ĐƯỢC CLICK
                    // =========================================

                    navController.navigate(
                        "item_detail/$productId"
                    )
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
                }
            )
        }
    }
}