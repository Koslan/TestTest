package com.example.TestTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TestTest.models.Author;
 

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
