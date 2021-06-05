package com.aim.app.accounts.repositories;

import com.aim.app.accounts.models.Books;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Books,Integer> {
    
}
