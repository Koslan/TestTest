package com.example.TestTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TestTest.models.Book;


public interface BookRepository extends JpaRepository<Book, Integer> {

}

