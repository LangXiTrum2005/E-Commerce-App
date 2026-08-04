package com.example.e_commercelaptop.user.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Business
import androidx.compose.material.icons.outlined.Games
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Laptop
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HomeFooter(
    selectedTab: String = "Home",
    onTabSelected: (String) -> Unit = {}
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(Color.White)
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        FooterItem(
            icon = Icons.Outlined.Home,
            label = "Home",
            isSelected = selectedTab == "Home",
            onClick = {onTabSelected("Home")},
            modifier = Modifier.weight(1f)
        )

        FooterItem(
            icon = Icons.Outlined.Laptop,
            label = "Office",
            isSelected = selectedTab == "Office",
            onClick = {onTabSelected("Office")},
            modifier = Modifier.weight(1f)
        )

        FooterItem(
            icon = Icons.Outlined.Games,
            label = "Gaming",
            isSelected = selectedTab == "Gaming",
            onClick = {onTabSelected("Gaming")},
            modifier = Modifier.weight(1f)
        )

        FooterItem(
            icon = Icons.Outlined.Business,
            label = "Business",
            isSelected = selectedTab == "Business",
            onClick = {onTabSelected("Business")},
            modifier = Modifier.weight(1f)
        )

        FooterItem(
            icon = Icons.Outlined.AccountCircle,
            label = "Account",
            isSelected = selectedTab == "Account",
            onClick = {onTabSelected("Account")},
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun FooterItem(
    icon: ImageVector,
    label: String,
    isSelected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
){
    val itemColor = if (isSelected) Color(0xFFEE4D2D) else Color.Gray
    Column(
        modifier = modifier
            .fillMaxHeight()
            .clickable{onClick()},
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            imageVector = icon,
            contentDescription = label,
            tint = itemColor,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(4.dp))

        Text(
            text = label,
            fontSize = 10.sp,
            color = Color.Gray
        )
    }
}