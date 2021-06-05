package com.aim.app.accounts.controllers;

import java.util.List;

import com.aim.app.accounts.models.Books;
import com.aim.app.books.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addProduct")
    public Books addBook(@RequestBody Books book){
        return bookService.saveBook(book);
    }

    @PostMapping("/addProducts")
    public List<Books> addBooks(@RequestBody List <Books> book){
        return bookService.saveBooks(book);
    }

    // Find by ID

    
}
