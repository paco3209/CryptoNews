package com.example.cryptonews.api

import com.example.cryptonews.NewsResponse
import com.example.cryptonews.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("/data/v2/news")
    suspend fun getLatestNews(
            @Query("lang")
            lang: String = "EN",
            @Query("api_key")
            apiKey: String = API_KEY
    ) : Response<NewsResponse>


}