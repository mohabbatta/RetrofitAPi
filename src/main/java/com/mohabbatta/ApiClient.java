package com.mohabbatta;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiClient {

    @GET("/users/{username}")
    Call<User> getUser(@Path("username") String username);
}
