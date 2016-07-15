package com.binarybolts.controllers;

import com.binarybolts.domain.Book;
import com.binarybolts.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/books")
public class BookController {

    private final BookRepository bookRepository;

    @Autowired
    BookController(BookRepository repository) {
        this.bookRepository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Book> books() {
        return bookRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Book create(@RequestBody Book book) {
        return bookRepository.save(book);
    }

}
