package com.telerikacademy.photogallery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/favourites")
public class FavouritesRestController {
    List<String> photoUrls = new ArrayList<>();

    @GetMapping
    public List<String> getPhotoUrls() {
        return new ArrayList<>(photoUrls);
    }
}
