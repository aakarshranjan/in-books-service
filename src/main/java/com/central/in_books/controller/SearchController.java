package com.central.in_books.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.central.in_books.domain.BookSearch;
import com.central.in_books.entity.Author;
import com.central.in_books.entity.Book;
import com.central.in_books.service.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	private SearchService searchService;
	
//	@GetMapping(value="/authors")
//	public ResponseEntity<String> getAuthors() {
//		Author a1 = new Author((long) 1,"Dan Brown","https://upload.wikimedia.org/wikipedia/commons/8/8b/Dan_Brown_bookjacket_cropped.jpg","ndustry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
//		
//		return "";
//	}
	
	@PostMapping(value="/books/search")
	public ResponseEntity<List<Book>> getBooksByCustomSearch(@RequestBody BookSearch body) {
		List<Book> books = searchService.searchBooks(body);			
		ResponseEntity<List<Book>> res = new ResponseEntity<>(books, HttpStatus.OK);
		return res;
	}

}
