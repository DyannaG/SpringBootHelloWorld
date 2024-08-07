package com.example.bookstoreBakersButBetter.service;

import java.util.List;

import com.example.bookstoreBakersButBetter.models.Book;

public interface BookService {

    List<Book> findAll();

    Book save(Book book);

    void delete(String id);
}