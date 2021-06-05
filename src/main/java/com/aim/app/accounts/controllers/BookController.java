package com.aim.app.accounts.controllers;

import java.util.List;
import java.util.Optional;

import com.aim.app.accounts.models.Books;
import com.aim.app.books.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    // GET routes

    @GetMapping("/products")
    public List<Books>findAlBooks(){
        return bookService.getBooks();
    }

    // Find by ID
    @GetMapping("/product/{id}")
    public Optional<Books> findBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    
}
