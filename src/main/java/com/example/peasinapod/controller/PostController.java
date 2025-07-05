package com.example.peasinapod.controller;

import com.example.peasinapod.model.Post;
import com.example.peasinapod.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping
    public Post savePost(@RequestBody Post post) {
        return postService.addPost(post);
    }
}
