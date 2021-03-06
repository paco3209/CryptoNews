package com.example.cryptonews



data class NewsResponse(
    val Data: List<Data>,
    val HasWarning: Boolean,
    val Message: String,
    val Promoted: List<Any>,
    val RateLimit: RateLimit,
    val Type: Int
)