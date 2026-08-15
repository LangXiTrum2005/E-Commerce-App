package com.example.e_commercelaptop.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDao{
    @Query("SELECT * FROM products")
    fun getAllProducts(): Flow<List<ProductEntity>>

    @Query("SELECT * FROM products WHERE id = :productId LIMIT 1")
    fun getProductById(productId: Int): Flow<ProductEntity?>

    @Insert
    fun insertProducts(products: List<ProductEntity>)
}