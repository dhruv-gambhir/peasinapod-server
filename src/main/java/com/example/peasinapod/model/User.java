package com.example.peasinapod.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import com.google.gson.annotations.SerializedName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

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

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }
}

