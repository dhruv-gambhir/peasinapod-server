package com.example.peasinapod.model;

import jakarta.persistence.*;
import com.google.gson.annotations.SerializedName;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {

    @Id
    @SerializedName("id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    @SerializedName("username")
    private String username;

    @SerializedName("email")
    private String email;


    @SerializedName("password")
    private String password;

    @SerializedName("profile_picture")
    private String profilePicture;

    public User() {}

    public User(long id, String username, String email, String password, String profilePicture) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.profilePicture = profilePicture;
    }
}

