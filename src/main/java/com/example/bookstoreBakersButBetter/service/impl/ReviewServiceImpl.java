package com.example.bookstoreBakersButBetter.service.impl;

import com.example.bookstoreBakersButBetter.models.Review;
import com.example.bookstoreBakersButBetter.repository.ReviewRepository;

import com.example.bookstoreBakersButBetter.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    @Autowired
    private final ReviewRepository repo;


    @Override
    public void updateById(Review updated, String id) {
        Review temp = repo.findItemById(id);
        Review oldObj = repo.findItemById(id);

        //System.out.println(oldObj);

        if (!temp.getSummary().equals(updated.getSummary())) {
            temp.setSummary(updated.getSummary());
        }

        if (!temp.getReviewTitle().equals(updated.getReviewTitle())) {
            temp.setReviewTitle(updated.getReviewTitle());
        }

        if (!temp.getRating().equals(updated.getRating())) {
            temp.setRating(updated.getRating());
        }

     //   temp.setDatePosted(updated.getDatePosted());

        repo.save(temp);
        System.out.println("Successfully updated " + oldObj + " to " + repo.findItemById(id));
    }


    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }

    @Override
    public Review save(Review newReview) {
        return repo.save(newReview);
     //   return newReview;
    }
//    @Override
//    public void addReview(String reviewId, String id, Object bookOrUser) {
//
//    }
}
