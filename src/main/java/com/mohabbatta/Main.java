package com.mohabbatta;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter Username: ");
        String userName = scanner.next();

        ApiClient apiClient = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(ApiClient.class);
        apiClient.getUser(userName).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                assert response.body() != null;
                System.out.println("username: "+response.body().getLogin());
                System.out.println("following: "+response.body().getFollowing());
                System.out.println("follower: "+response.body().getFollowers());
                System.out.println("gists: "+response.body().getPublic_gists());
                System.out.println("publicRepos: "+response.body().getPublic_repos());

            }

            @Override
            public void onFailure(Call<User> call, Throwable throwable) {
                System.out.println(throwable);
            }
        });
    }
}
