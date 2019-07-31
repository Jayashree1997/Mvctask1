package com.stackroute.controller;

public class User {
    String message;

    public User(String message){
        this.message=message;
    }

    @Override
    public String toString() {
        return "User{" +
                "message='" + message + '\'' +
                '}';
    }
}
