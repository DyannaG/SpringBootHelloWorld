package com.example.bookstoreBakersButBetter.repository;

import com.example.bookstoreBakersButBetter.models.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.bookstoreBakersButBetter.models.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
    @Query("{_id:'?0'}")
    Book findItemById(String id);
}
