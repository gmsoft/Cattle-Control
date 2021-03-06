package com.example.freddy.cattlecontrol.Class;

import java.util.ArrayList;
import java.util.Observable;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Freddy on 8/4/2018.
 */

public interface ApiCattleCow {

    //Get users
    @GET("user")
    Call<ArrayList<User>> getUsers();

    //Create users
    @POST("user")
    Call<User> createUser(@Body User user);


}
