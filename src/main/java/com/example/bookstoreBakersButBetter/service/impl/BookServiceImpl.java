package com.example.bookstoreBakersButBetter.service.impl;

import java.util.List;

import com.example.bookstoreBakersButBetter.models.User;
import org.springframework.stereotype.Service;

import com.example.bookstoreBakersButBetter.models.Book;
import com.example.bookstoreBakersButBetter.repository.BookRepository;
import com.example.bookstoreBakersButBetter.service.BookService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void delete(String id) {
        bookRepository.deleteById(id);
    }

    //review code so if this breaks its my fault - ella
    @Override
    public void addReview(String reviewId, String id) {
        Book obj = bookRepository.findItemById(id);
        System.out.println(obj);
        obj.getReviewIds().add(reviewId);
        System.out.println(obj);
        bookRepository.save(obj);
    }
}
