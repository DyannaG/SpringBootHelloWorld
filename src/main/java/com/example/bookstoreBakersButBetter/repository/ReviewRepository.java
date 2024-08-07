package com.example.bookstoreBakersButBetter.repository;

import com.example.bookstoreBakersButBetter.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, String> {
    @Query("{_id:'?0'}")
    Review findItemById(String id);
}
