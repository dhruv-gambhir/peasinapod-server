package com.example.peasinapod.model;

import com.google.gson.annotations.SerializedName;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "posts")
public class Post implements Serializable {
    @Id
    private String id;

    @SerializedName("username")
    private String username;

    @SerializedName("audio_url")
    private String audioUrl;

    @SerializedName("image_url")
    private String imageUrl;

    @SerializedName("caption")
    private String caption;

    public Post() {}

    public Post(String id, String username, String audioUrl, String imageUrl, String caption) {
        this.id = id;
        this.username = username;
        this.audioUrl = audioUrl;
        this.imageUrl = imageUrl;
        this.caption = caption;
    }
}
