package com.ymphai.minorproject.remote;

import com.ymphai.minorproject.model.ResObj;
import retrofit2.Call;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Field;


public interface UserService {
    @FormUrlEncoded
    @POST("login")
    Call<ResObj> login(@Field("username") String username, @Field("password") String password);
}
