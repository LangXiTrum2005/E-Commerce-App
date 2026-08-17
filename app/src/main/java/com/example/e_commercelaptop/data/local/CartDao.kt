package com.example.e_commercelaptop.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CartDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOrUpdate(cartItem: CartItemEntity): Long

    @Query("SELECT * FROM cart_items")
    fun getAllCartItems(): Flow<List<CartItemEntity>>

    @Query("SELECT SUM(quantity) FROM cart_items")
    fun getTotalQuantity(): Flow<Int?>

    @Query("DELETE FROM cart_items WHERE productId = :productId")
    suspend fun deleteById(productId: Int): Int

    @Query("UPDATE cart_items SET quantity = :quantity WHERE productId = :productId")
    suspend fun updateQuantity(productId: Int, quantity: Int): Int

    @Query("SELECT * FROM cart_items WHERE productId = :productId")
    suspend fun getCartItemById(productId: Int): CartItemEntity?
}
