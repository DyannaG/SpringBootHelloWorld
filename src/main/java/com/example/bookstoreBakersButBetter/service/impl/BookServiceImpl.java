package com.example.bookstoreBakersButBetter.service.impl;

import java.util.List;

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
}
