package com.kelvin.uasandroid.services;

import com.kelvin.uasandroid.model.GetUser;
import com.kelvin.uasandroid.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/users")
    Call<GetUser> getUsersList();
}
