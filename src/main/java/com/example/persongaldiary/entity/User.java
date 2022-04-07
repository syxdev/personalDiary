package com.example.persongaldiary.entity;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String password;
    private String address;
    private String telephone;
    private String email;

    public User(String username, String password, String address, String telephone, String email) {
        this.username = username;
        this.password = password;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }
}
