import com.akirachix.dishhub.Dairy

import retrofit2.Call
import retrofit2.http.GET

interface DairyApiService {
    @GET("api/categories/4/food-items/")
    fun getFoodItems(): Call<List<Dairy>>
}
