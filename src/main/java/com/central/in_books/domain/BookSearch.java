package com.central.in_books.domain;

import java.util.List;

public class BookSearch {
	
	private List<Integer> authors;
	private List<Integer> category;
	private List<Integer> genre;
	private List<Integer> theme;
	
	public List<Integer> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Integer> authors) {
		this.authors = authors;
	}
	public List<Integer> getCategory() {
		return category;
	}
	public void setCategory(List<Integer> category) {
		this.category = category;
	}
	public List<Integer> getGenre() {
		return genre;
	}
	public void setGenre(List<Integer> genre) {
		this.genre = genre;
	}
	public List<Integer> getTheme() {
		return theme;
	}
	public void setTheme(List<Integer> theme) {
		this.theme = theme;
	}
	
	public BookSearch(List<Integer> authors, List<Integer> category, List<Integer> genre, List<Integer> theme) {
		super();
		this.authors = authors;
		this.category = category;
		this.genre = genre;
		this.theme = theme;
	}

}
