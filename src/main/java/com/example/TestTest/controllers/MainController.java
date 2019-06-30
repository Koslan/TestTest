package com.example.TestTest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.TestTest.repositories.AuthorRepository;
import com.example.TestTest.repositories.BookRepository;
import com.example.TestTest.repositories.GenreRepository;


@Controller
public class MainController {
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private GenreRepository genreRepository;
	@Autowired
	private AuthorRepository authorRepository;

	@GetMapping("/")
	private String getBooks(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		model.addAttribute("authors", authorRepository.findAll());
		model.addAttribute("genres", genreRepository.findAll());
		model.addAttribute("contentPage", "books");
		return "index";
	}
}
