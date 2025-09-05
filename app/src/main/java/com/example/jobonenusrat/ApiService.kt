package com.example.jobonenusrat

import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts(): List<Product>
}