package com.example.daggerretrofit.apis;

import com.example.daggerretrofit.mode.RandomUsers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UsersApi {

    @GET("api")
    Call<RandomUsers> getRandomUsers(@Query("results") int size);
}
