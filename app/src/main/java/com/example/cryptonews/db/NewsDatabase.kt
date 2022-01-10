package com.example.cryptonews.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cryptonews.Data

@Database(entities = [Data::class],version = 1, exportSchema = false)
abstract class NewsDatabase : RoomDatabase(){
    abstract fun NewsDao(): NewsDao

    companion object {

        private var INSTANCE: NewsDatabase ? = null

        fun creataDb(context: Context): NewsDatabase {
            INSTANCE =  INSTANCE ?: Room.databaseBuilder(context.applicationContext,NewsDatabase::class.java,"news").build()
            return INSTANCE!!
        }

    }

}