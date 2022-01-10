package com.example.cryptonews

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(
        tableName = "news"
)
data class Data(
    val body: String,
    val categories: String,
    val downvotes: String,
    val guid: String,
    @PrimaryKey
    val id: String,
    val imageurl: String,
    val lang: String,
    val published_on: Int,
    val source: String,
    val tags: String,
    val title: String,
    val upvotes: String,
    val url: String
)