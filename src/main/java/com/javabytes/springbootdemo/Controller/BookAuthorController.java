package com.javabytes.springbootdemo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javabytes.springbootdemo.Entities.Books;
import com.javabytes.springbootdemo.Services.BookServiceImpl;

@RestController
public class BookAuthorController {
	
	@Autowired
	BookServiceImpl service;

	@GetMapping("/books")
	public List<Books> getBooksList() {
		return service.getAllBooks();
		
	}
}