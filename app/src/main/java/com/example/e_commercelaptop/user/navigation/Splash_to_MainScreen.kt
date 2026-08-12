package com.example.e_commercelaptop.user.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commercelaptop.MainScreen
import com.example.e_commercelaptop.user.welcome.WelcomeScreen

@Composable
fun Splash_to_MainScreen() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {



        composable("welcome") {

            WelcomeScreen(
                onWelcomeClick = {

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

            MainScreen()
        }
    }
}