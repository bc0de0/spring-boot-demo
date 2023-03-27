package com.javabytes.springbootdemo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javabytes.springbootdemo.Entities.Books;

@Service
public class BookServiceImpl implements BookService{

	
	
	private static List<Books> createBookObj(){
		int cnt = 0;
		List<Books> books = new ArrayList<Books>();
		books.add(new Books(++cnt, "Wings of Fire", "Abdul Kalam", "motivation"));
		books.add(new Books(++cnt, "Power of positive thought", "Vincent Peale", "motivation"));
		books.add(new Books(++cnt, "The Alchemist", "Poulo Coelho", "enlightining"));
		return books;
	}
	@Override
	public List<Books> getAllBooks() {
		return BookServiceImpl.createBookObj();
	}

}
