package com.central.in_books.domain;

import java.util.List;

public class BookSearch {
	
	private List<Long> author;
	private List<Long> category;
	private List<Long> genre;
	private List<Long> theme;
	
	public List<Long> getAuthor() {
		return author;
	}
	public void setAuthor(List<Long> author) {
		this.author = author;
	}
	public List<Long> getCategory() {
		return category;
	}
	public void setCategory(List<Long> category) {
		this.category = category;
	}
	public List<Long> getGenre() {
		return genre;
	}
	public void setGenre(List<Long> genre) {
		this.genre = genre;
	}
	public List<Long> getTheme() {
		return theme;
	}
	public void setTheme(List<Long> theme) {
		this.theme = theme;
	}
	
	public BookSearch(List<Long> author, List<Long> category, List<Long> genre, List<Long> theme) {
		super();
		this.author = author;
		this.category = category;
		this.genre = genre;
		this.theme = theme;
	}

}
