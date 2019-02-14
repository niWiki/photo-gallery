package com.telerikacademy.photogallery.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/photos")
public class PhotosRestController {
    public PhotosRestController(){
        
    }

    @GetMapping
    public List<String> getPhotosUrls() {
        return new ArrayList<String>() {
        };
    }

}
