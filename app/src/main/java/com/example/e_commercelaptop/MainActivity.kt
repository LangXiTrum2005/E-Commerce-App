package com.example.e_commercelaptop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.e_commercelaptop.ui.theme.ECommerceLaptopTheme
import com.example.e_commercelaptop.user.navigation.AppNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ECommerceLaptopTheme {
                AppNavigation()
            }
        }
    }
}
