package com.mohabbatta;

public class User {

    private String login;
    private int public_repos;
    private int public_gists;
    private int followers;
    private int following;

    public String getLogin() { return login; }

    public int getPublic_repos() {
        return public_repos;
    }

    public int getPublic_gists() {
        return public_gists;
    }

    public int getFollowers() {
        return followers;
    }

    public int getFollowing() {
        return following;
    }
}
