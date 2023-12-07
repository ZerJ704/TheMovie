package id.utdi.jerymiannor.services

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//TODO 3: Pada tahapan ini, instance Retrofit pada MovieApiService digunakan untuk membuat panggilan ke API bagian TV dan mendapatkan datanya.
class TVApiService {
    companion object{
        private const val BASE_URL = "https://api.themoviedb.org"
        private var retrofit : Retrofit? = null

        fun getInstance() : Retrofit {
            if(retrofit == null){
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}