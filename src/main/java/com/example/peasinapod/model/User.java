package com.example.peasinapod.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.google.gson.annotations.SerializedName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

@Entity
public class User implements Serializable {

    @Id
    @SerializedName("id")
    private int id;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @JsonIgnore
    @SerializedName("password")
    private String password;
    @SerializedName("profile_picture")
    private String profilePicture;

    public User() {}

    public User(int id, String username, String email, String password, String profilePicture) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
        this.profilePicture = profilePicture;
    }
}

