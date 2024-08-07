package com.example.bookstoreBakersButBetter.service;

import com.example.bookstoreBakersButBetter.models.Review;
import com.example.bookstoreBakersButBetter.models.User;

public interface ReviewService {
    void updateById(Review updated, String id);
    Review save(Review newReview);

}
