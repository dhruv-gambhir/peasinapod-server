package com.example.peasinapod.model;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

@Entity
public class Post implements Serializable {
    @Id
    private String id;

    @SerializedName("username")
    private String username;

}
