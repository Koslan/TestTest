package com.example.TestTest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TestTest.models.Genre;


public interface GenreRepository extends JpaRepository<Genre, Integer> {

}
