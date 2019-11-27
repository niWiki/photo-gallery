package com.telerikacademy.photogallery.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotosRestController {
    private List<String> photoUrls;
    private String galleryTitle;

    public PhotosRestController(){
        photoUrls = new ArrayList<String>() {};
    }

    @GetMapping
    public List<String> getPhotoUrls() {
        int b = 10;
        b = b+10;
        int c = 10;
        b = b+10;
        return new ArrayList<>(photoUrls);
    }

    @PostMapping
    public void bla1(){
int c = 10;
    }

    @PutMapping
    public void bla11(){

    }
}
