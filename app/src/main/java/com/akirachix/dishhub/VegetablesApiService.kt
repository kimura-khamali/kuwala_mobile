
package com.akirachix.dishhub
import Vegetables
import retrofit2.http.Query

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("api/categories/1/food-items/")
    fun getFoodItems(): Call<List<Vegetables>>

    // Define the recipe fetching method
    @GET("api/recipes") // Adjust the endpoint based on your actual API path
    fun getRecipes(@Query("ingredients") ingredientsQuery: String): Call<List<Recipes>>
}
