package com.example.cryptonews.db

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.cryptonews.Data

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveNews(data: Data): Long

    @Query("SELECT * from news")
    fun getLocalNews():LiveData<List<Data>>

    @Delete
    suspend fun deleteNews(data:Data)
}