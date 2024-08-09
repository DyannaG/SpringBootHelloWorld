package com.example.bookstoreBakersButBetter.controller;

import com.example.bookstoreBakersButBetter.models.Review;
import com.example.bookstoreBakersButBetter.models.User;
import com.example.bookstoreBakersButBetter.repository.ReviewRepository;
import com.example.bookstoreBakersButBetter.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
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
    public Review editReview(@RequestBody Review updated, @PathVariable String id) {
        service.updateById(updated, id);
        return null;
    }

    @RequestMapping(value = "/delete/adminpass={adminpass}/{id}", method = RequestMethod.DELETE)
    public void deleteReview(@PathVariable String adminpass, @PathVariable String id) {
        if(adminpass.equals("bread1")) {
            service.delete(id);
            System.out.println("Deleted.");
        }
        else{
            System.out.println("Invalid permissions.");
        }
    }


}
