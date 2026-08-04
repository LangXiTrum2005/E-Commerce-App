package com.example.e_commercelaptop.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "products")
data class ProductEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val brand: String,
    val price: String,
    val description: String,
    val imageUrl: String? = null,
    val status: String = "Còn hàng"
){
    val productCode: String
        get() = if (brand.length >= 2) brand.substring(0,2).uppercase() else brand.uppercase()
}