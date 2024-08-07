package com.example.bookstoreBakersButBetter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.bookstoreBakersButBetter.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
