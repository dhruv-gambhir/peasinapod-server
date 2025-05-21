// User Model

package com.example.peasinapod.model;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class User implements Serializable {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("email")
    private String email;
    @SerializedName("profile_picture")
    private String profilePicture;

    public User(String id, String name, String email, String profilePicture) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.profilePicture = profilePicture;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getProfilePicture() {
        return profilePicture;
    }
}

