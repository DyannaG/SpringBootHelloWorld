package com.example.bookstoreBakersButBetter.service;

import java.util.List;

import com.example.bookstoreBakersButBetter.models.Book;
import com.example.bookstoreBakersButBetter.models.Review;

public interface BookService {

    List<Book> findAll();

    Book save(Book book);

    void delete(String id);
    //review code so if this breaks its my fault - ella
    void addReview(String reviewId, String id);

}