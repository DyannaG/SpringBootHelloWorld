package com.example.bookstoreBakersButBetter.controller;

import com.example.bookstoreBakersButBetter.models.Review;
import com.example.bookstoreBakersButBetter.models.User;
import com.example.bookstoreBakersButBetter.repository.ReviewRepository;
import com.example.bookstoreBakersButBetter.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    private ReviewService service;


    @RequestMapping(value = "/editReview/{id}", method = RequestMethod.PUT)
//    @RequestMapping
//    @PutMapping("/editReview/{id}")
    public User editReview(@RequestBody Review updated, @PathVariable String id) {
        service.updateById(updated, id);
        return null;
    }


}
