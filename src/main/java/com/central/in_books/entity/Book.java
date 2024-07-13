package com.central.in_books.entity;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="book")
public class Book implements Serializable{
	
	private static final long serialVersionUID = -3213731360408209802L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="img")
	private String imgUrl;
	
	@Column(name="description")
	private String description;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="author_id", referencedColumnName="id")
	private Author author;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="category_id", referencedColumnName="id")
	private Category category;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="genre_id", referencedColumnName="id")
	private Genre genre;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="theme_id", referencedColumnName="id")
	private Theme theme;

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

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Theme getTheme() {
		return theme;
	}

	public void setTheme(Theme theme) {
		this.theme = theme;
	}

	public Book(Long id, String name, String imgUrl, String description, Author author, Category category, Genre genre,
			Theme theme) {
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
	
	public Book() {
		super();
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", imgUrl=" + imgUrl + ", description=" + description + ", author="
				+ author + ", category=" + category + ", genre=" + genre + ", theme=" + theme + "]";
	}
	
}
