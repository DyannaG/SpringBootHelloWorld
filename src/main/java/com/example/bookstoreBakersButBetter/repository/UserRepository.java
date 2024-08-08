package com.example.bookstoreBakersButBetter.repository;

import com.example.bookstoreBakersButBetter.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookstoreBakersButBetter.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    @Query("{_id:'?0'}")
    User findItemById(String id);
}
