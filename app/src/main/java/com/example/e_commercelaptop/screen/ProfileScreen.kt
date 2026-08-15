package com.example.e_commercelaptop.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.e_commercelaptop.user.profile.CustomerServiceSection
import com.example.e_commercelaptop.user.profile.OfferSection
import com.example.e_commercelaptop.user.profile.OrderSection
import com.example.e_commercelaptop.user.profile.ProfileHeader
import com.example.e_commercelaptop.user.profile.UtilitySection
import com.example.e_commercelaptop.user.profile.VipBanner

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .verticalScroll(rememberScrollState())
    ) {
        ProfileHeader()
        VipBanner()
        OrderSection()
        Spacer(modifier = Modifier.height(8.dp).background(Color(0xFFF5F5F5)))
        OfferSection()
        Spacer(modifier = Modifier.height(8.dp).background(Color(0xFFF5F5F5)))
        UtilitySection()
        Spacer(modifier = Modifier.height(8.dp).background(Color(0xFFF5F5F5)))
        CustomerServiceSection()
        Spacer(modifier = Modifier.height(24.dp))
    }
}