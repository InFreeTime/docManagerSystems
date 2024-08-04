package com.example.docManagerSystems.service;

import com.example.docManagerSystems.entity.Rating;
import com.example.docManagerSystems.repository.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    public List<Rating> getAllRating(){
        return ratingRepository.findAll();
    }

    public Rating createRating(Rating rating){
        return ratingRepository.save(rating);
    }

    public Rating updateRating(Long id, Rating ratingDetails){
        Optional<Rating> optionalRating = ratingRepository.findById(id);
        if (optionalRating.isPresent()){
            Rating rating = optionalRating.get();
            rating.setName(ratingDetails.getName());
            return ratingRepository.save(rating);
        } else {
            throw new RuntimeException("Rating not found width id " + id);
        }
    }
}
