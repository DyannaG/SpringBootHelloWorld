package com.example.bookstoreBakersButBetter.service;

import com.example.bookstoreBakersButBetter.models.Review;

public interface ReviewService {
    void updateById(Review updated, String id);
    Review save(Review newReview);

    //void addReview(String reviewId, String id);

}
