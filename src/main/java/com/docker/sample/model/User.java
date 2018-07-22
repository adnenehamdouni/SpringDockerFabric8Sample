package com.docker.sample.model;

/**
 * Created by adnenehamdouni on 22/07/2018.
 */

public class User {
    private String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
