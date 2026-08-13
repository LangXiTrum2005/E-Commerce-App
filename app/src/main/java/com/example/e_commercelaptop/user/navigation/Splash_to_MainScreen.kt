package com.example.e_commercelaptop.user.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commercelaptop.MainScreen
import com.example.e_commercelaptop.ItemDetailScreen
import com.example.e_commercelaptop.data.OnboardingPrefs
import com.example.e_commercelaptop.user.welcome.WelcomeScreen

@Composable
fun Splash_to_MainScreen() {
    val context = LocalContext.current
    val onboardingPrefs = remember { OnboardingPrefs(context) }
    val isFirstTime = remember { onboardingPrefs.isFirstTime() }
    
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = if (isFirstTime) "welcome" else "main"
    ) {

        composable("welcome") {
            WelcomeScreen(
                onWelcomeClick = {
                    onboardingPrefs.setFirstTimeCompleted()
                    navController.navigate("main") {
                        // Không cho quay lại Welcome
                        popUpTo("welcome") {
                            inclusive = true
                        }
                    }
                }
            )
        }

        composable("main") {
            MainScreen(
                onProductClick = { productId ->
                    navController.navigate("item_detail")
                }
            )
        }

        composable("item_detail") {
            ItemDetailScreen(
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}