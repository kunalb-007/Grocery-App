package com.example.mygroceryapp.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mygroceryapp.database.entity.GroceryEntities

@Dao
interface GroceryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryEntities)

    @Delete
    suspend fun delete(item: GroceryEntities)

    @Query("SELECT * FROM grocery_data")
    fun getAllGroceryItems(): LiveData<List<GroceryEntities>>
}







