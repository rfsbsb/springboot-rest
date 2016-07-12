package com.binarybolts.controllers;

import com.binarybolts.domain.Author;
import com.binarybolts.repositories.AuthorRepository;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("api/authors")
public class AuthorController {

    private final AuthorRepository authorRepository;

    @Autowired
    AuthorController(AuthorRepository repository) {
        this.authorRepository = repository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Author> authors() {
        return authorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Author create(@RequestBody Author author) {
        return authorRepository.save(author);
    }

}
