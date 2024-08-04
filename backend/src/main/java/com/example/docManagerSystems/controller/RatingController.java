package com.example.docManagerSystems.controller;

import com.example.docManagerSystems.entity.Rating;
import com.example.docManagerSystems.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping
    public List<Rating> getAllRating() {
        return ratingService.getAllRating();
    }

    @PostMapping
    public Rating createRating(@RequestBody Rating rating) {
        return ratingService.createRating(rating);
    }


    public Rating updateRating(@PathVariable Long id, @RequestBody Rating ratingDetails) {
        return ratingService.updateRating(id, ratingDetails);
    }
}
