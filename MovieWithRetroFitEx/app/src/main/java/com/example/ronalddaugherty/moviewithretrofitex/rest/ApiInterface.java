package com.example.ronalddaugherty.moviewithretrofitex.rest;

/**
 * Created by ronalddaugherty on 6/5/17.
 */


import com.example.ronalddaugherty.moviewithretrofitex.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("movie/top_rated")
    Call<MovieResponse> getTopRatedMovies(@Query("api_key") String apiKey);
    @GET("movie/{id}")
    Call<MovieResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}
