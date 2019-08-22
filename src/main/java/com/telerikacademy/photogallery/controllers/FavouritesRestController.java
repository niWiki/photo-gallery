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
    int pages = 10;

    @GetMapping
    public List<String> getPhotoUrls() {
        int b = calc(1,2);
        return new ArrayList<>(photoUrls);
    }

    private int calc(int a, int b){
        return a + b;
    }
}
