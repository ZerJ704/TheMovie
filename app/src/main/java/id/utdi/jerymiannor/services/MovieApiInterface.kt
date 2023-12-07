package id.utdi.jerymiannor.services

import retrofit2.Call
import id.utdi.jerymiannor.models.MovieResponse
import retrofit2.http.GET

//TODO 2: Pada tahapan ini, MovieApiInterface dibuat untuk membuat endpoinnt ke popular movies dengan api key
interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=bbf5a3000e95f1dddf266b5e187d4b21")
    fun getMovieList(): Call<MovieResponse>

}