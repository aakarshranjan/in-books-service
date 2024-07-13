package com.central.in_books.service;

import java.util.List;

import com.central.in_books.domain.BookSearch;
import com.central.in_books.domain.BookResponse;

public interface SearchService {
	
	public List<BookResponse> searchBooks(BookSearch body);

}
