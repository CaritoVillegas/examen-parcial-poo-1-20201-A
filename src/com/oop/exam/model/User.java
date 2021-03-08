package com.oop.exam.model;

public class User {
    private String user;
    private String email;

    public User(String user, String email) {
        this.user = user;
        this.email = email;
    }

    public String getUsername() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
