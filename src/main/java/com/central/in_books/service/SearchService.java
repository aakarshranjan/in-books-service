package com.central.in_books.service;

import java.util.List;

import com.central.in_books.domain.BookSearch;
import com.central.in_books.entity.Book;

public interface SearchService {
	
	public List<Book> searchBooks(BookSearch body);

}
