package com.aim.app.accounts.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Books {

    @Id
    @GeneratedValue
    private int id;
    private String book_name;
    private String ISBN;
    
}
