package com.example.bookstoreBakersButBetter.controller;

import java.util.List;

import com.example.bookstoreBakersButBetter.models.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookstoreBakersButBetter.models.Book;
import com.example.bookstoreBakersButBetter.service.BookService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    @GetMapping(value = "/findAll")
    public List<Book> getAllBooks() {
        System.out.println("XXX - found");
        return bookService.findAll();
    }

    @RequestMapping(value = "/createBook", method = RequestMethod.POST)
    public Book createBook(@RequestBody Book book) {
        return bookService.save(book);
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable String id) {
    bookService.delete(id);
}
}

