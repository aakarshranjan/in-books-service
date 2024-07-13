package com.central.in_books.domain;

public class BookResponse {
	
	private Long id;
	
	private String name;
	
	private String imgUrl;
	
	private String description;
	
	private Field author;
	
	private Field category;
	
	private Field genre;
	
	private Field theme;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Field getAuthor() {
		return author;
	}

	public void setAuthor(Field author) {
		this.author = author;
	}

	public Field getCategory() {
		return category;
	}

	public void setCategory(Field category) {
		this.category = category;
	}

	public Field getGenre() {
		return genre;
	}

	public void setGenre(Field genre) {
		this.genre = genre;
	}

	public Field getTheme() {
		return theme;
	}

	public void setTheme(Field theme) {
		this.theme = theme;
	}

	public BookResponse(Long id, String name, String imgUrl, String description, Field author, Field category,
			Field genre, Field theme) {
		super();
		this.id = id;
		this.name = name;
		this.imgUrl = imgUrl;
		this.description = description;
		this.author = author;
		this.category = category;
		this.genre = genre;
		this.theme = theme;
	}
	

}
