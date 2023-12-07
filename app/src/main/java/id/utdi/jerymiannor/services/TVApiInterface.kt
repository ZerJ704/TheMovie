package id.utdi.jerymiannor.services

import id.utdi.jerymiannor.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

//TODO 4: Pada tahapan ini, TVApiInterface dibuat untuk membuat endpoinnt ke popular movies dengan api key
interface TVApiInterface {
    @GET("/3/tv/popular?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
    fun getTVList(): Call<TVResponse>

}