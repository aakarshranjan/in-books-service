package com.central.in_books.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.central.in_books.domain.BookSearch;
import com.central.in_books.entity.Author;
import com.central.in_books.entity.Book;
import com.central.in_books.entity.Category;
import com.central.in_books.entity.Genre;
import com.central.in_books.entity.Theme;
import com.central.in_books.service.SearchService;

@Service
public class SearchServiceImpl implements SearchService{
	
	static List<Book> books = new ArrayList<Book>(Arrays.asList(
			new Book((long) 1,"Angels & Demons",
					"A thrilling chase of the shadow society Illuminati. Dive into the history and unravel the latest scientific moves.",
					"https://m.media-amazon.com/images/I/71U17PxlH7L._AC_UF1000,1000_QL80_.jpg", 
					new Author((long) 1,"Dan Brown","https://upload.wikimedia.org/wikipedia/commons/8/8b/Dan_Brown_bookjacket_cropped.jpg","Lorem Ipsum"), 
					new Category((long) 1,"Novels","https://picsum.photos/id/237/200/300","No Info yet"), 
					new Genre((long) 6,"Mystery","https://cdn-icons-png.flaticon.com/512/2040/2040703.png","No Info yet"), 
					new Theme((long) 2,"Detective","https://www.shutterstock.com/image-vector/black-detective-icon-vector-260nw-573069310.jpg","No Info")),
			new Book((long) 2,"The Da Vinci Code",
					"A thrilling chase of the shadow society Illuminati. Dive into the history and unravel the latest scientific moves.",
					"https://m.media-amazon.com/images/I/71jDX01PzaL._AC_UF1000,1000_QL80_.jpg", 
					new Author((long) 1,"Dan Brown","https://upload.wikimedia.org/wikipedia/commons/8/8b/Dan_Brown_bookjacket_cropped.jpg","Lorem Ipsum"), 
					new Category((long) 1,"Novels","https://picsum.photos/id/237/200/300","No Info yet"), 
					new Genre((long) 6,"Mystery","https://cdn-icons-png.flaticon.com/512/2040/2040703.png","No Info yet"), 
					new Theme((long) 2,"Detective","https://www.shutterstock.com/image-vector/black-detective-icon-vector-260nw-573069310.jpg","No Info")),
			new Book((long) 3,"The Inferno",
					"A thrilling chase of the shadow society Illuminati. Dive into the history and unravel the latest scientific moves.",
					"https://m.media-amazon.com/images/I/81Kjb+TgdSL._AC_UF1000,1000_QL80_.jpg", 
					new Author((long) 1,"Dan Brown",
							"https://upload.wikimedia.org/wikipedia/commons/8/8b/Dan_Brown_bookjacket_cropped.jpg",
							"Lorem Ipsum"), 
					new Category((long) 1,"Novels","https://picsum.photos/id/237/200/300","No Info yet"),
					new Genre((long) 6,"Mystery","https://cdn-icons-png.flaticon.com/512/2040/2040703.png","No Info yet"), 
					new Theme((long) 3,"Historical","https://static.thenounproject.com/png/4211989-200.png","No Info")),
			new Book((long) 4,"The Lost Symbol",
					"A thrilling chase of the shadow society Illuminati. Dive into the history and unravel the latest scientific moves.",
					"https://m.media-amazon.com/images/I/81BlXbpNmuL._AC_UF1000,1000_QL80_.jpg", 
					new Author((long) 1,"Dan Brown","https://upload.wikimedia.org/wikipedia/commons/8/8b/Dan_Brown_bookjacket_cropped.jpg","Lorem Ipsum"), 
					new Category((long) 1,"Novels","https://picsum.photos/id/237/200/300","No Info yet"),
					new Genre((long) 6,"Mystery","https://cdn-icons-png.flaticon.com/512/2040/2040703.png","No Info yet"),
					new Theme((long) 1,"Art & Architecture","https://static.thenounproject.com/png/4139825-200.png","No Info")),
			new Book((long) 5,"The Origin",
					"A thrilling chase of the shadow society Illuminati. Dive into the history and unravel the latest scientific moves.",
					"https://m.media-amazon.com/images/I/91ZeWa2jVaL._AC_UF1000,1000_QL80_.jpg", 
					new Author((long) 1,"Dan Brown","https://upload.wikimedia.org/wikipedia/commons/8/8b/Dan_Brown_bookjacket_cropped.jpg","Lorem Ipsum"), 
					new Category((long) 1,"Novels","https://picsum.photos/id/237/200/300","No Info yet"),
					new Genre((long) 6,"Mystery","https://cdn-icons-png.flaticon.com/512/2040/2040703.png","No Info yet"),
					new Theme((long) 2,"Detective","https://www.shutterstock.com/image-vector/black-detective-icon-vector-260nw-573069310.jpg","No Info")),
			new Book((long) 6,"Half Girlfriend",
					"A thrilling chase of the shadow society Illuminati. Dive into the history and unravel the latest scientific moves.",
					"https://m.media-amazon.com/images/I/712HEn9SNwL._AC_UF1000,1000_QL80_.jpg", 
					new Author((long) 2,"Chetan Bhagat","https://yt3.googleusercontent.com/ytc/AIdro_kr4Xv6GpEaeOVO9n6gQ29NDGs4YuW2HJkGOSqaZ1IAoA=s900-c-k-c0x00ffffff-no-rj","No Info"), 
					new Category((long) 1,"Novels","https://picsum.photos/id/237/200/300","No Info yet"),
					new Genre((long) 7,"Romance","https://cdn-icons-png.flaticon.com/512/9656/9656139.png","No Info"), 
					new Theme((long) 1,"Art & Architecture","https://static.thenounproject.com/png/4139825-200.png","No Info")),
			new Book((long) 7,"Revolution 2020",
					"A thrilling chase of the shadow society Illuminati. Dive into the history and unravel the latest scientific moves.",
					"https://upload.wikimedia.org/wikipedia/en/4/44/Revolution_2020.jpg", 
					new Author((long) 2,"Chetan Bhagat","https://yt3.googleusercontent.com/ytc/AIdro_kr4Xv6GpEaeOVO9n6gQ29NDGs4YuW2HJkGOSqaZ1IAoA=s900-c-k-c0x00ffffff-no-rj","No Info"), 
					new Category((long) 1,"Novels","https://picsum.photos/id/237/200/300","No Info yet"),
					new Genre((long) 7,"Romance","https://cdn-icons-png.flaticon.com/512/9656/9656139.png","No Info"), 
					new Theme((long) 1,"Art & Architecture","https://static.thenounproject.com/png/4139825-200.png","No Info")),
			new Book((long) 8,"One night at the Call Center",
					"aasA thrilling chase of the shadow society Illuminati. Dive into the history and unravel the latest scientific moves.s",
					"https://m.media-amazon.com/images/I/71ey4H8M1DL._AC_UF350,350_QL80_.jpg", 
					new Author((long) 2,"Chetan Bhagat","https://yt3.googleusercontent.com/ytc/AIdro_kr4Xv6GpEaeOVO9n6gQ29NDGs4YuW2HJkGOSqaZ1IAoA=s900-c-k-c0x00ffffff-no-rj","No Info"), 
					new Category((long) 1,"Novels","https://picsum.photos/id/237/200/300","No Info yet"),
					new Genre((long) 3,"Drama","https://cdn-icons-png.freepik.com/512/8363/8363675.png","No Info"), 
					new Theme((long) 1,"Art & Architecture","https://static.thenounproject.com/png/4139825-200.png","No Info"))
			)); 

	@Override
	public List<Book> searchBooks(BookSearch body) {
		List <Book> filteredBooks = books.stream().filter(book -> 
			body.getAuthors().contains(book.getAuthor().getId().intValue()) &&
			body.getCategory().contains(book.getCategory().getId().intValue()) &&
			body.getGenre().contains(book.getGenre().getId().intValue()) &&
			body.getTheme().contains(book.getTheme().getId().intValue())
			).collect(Collectors.toList());
		return filteredBooks;
	}
	

}
