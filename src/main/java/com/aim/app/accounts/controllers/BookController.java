package com.aim.app.accounts.controllers;

import com.aim.app.accounts.models.Books;
import com.aim.app.books.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    public Books addBooks(@RequestBody Books book){
        return bookService.saveBook(book);
    }
    
}
