package com.aim.app.books;

import com.aim.app.accounts.models.Books;
import com.aim.app.accounts.repositories.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Creating post methods
    public Books saveBook(Books book) {
        return bookRepository.save(book);
    }

    public List<Books> saveBooks(List<Books> books){
        return bookRepository.saveAll(books);

    }

}