package com.central.in_books.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.central.in_books.domain.BookResponse;
import com.central.in_books.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	
//	@Query("SELECT b from Book b where b.author.id IN (:authorId) or b.category.id IN (:categoryId) or b.genre.id IN (:genreId) or b.theme.id IN (:themeId)")
//	List<Book> getBooksCustomSearch(@Param("authorId") List<Long> authorIds, 
//			@Param("categoryId") List<Long> categoryIds,
//			@Param("genreId") List<Long> genreIds,
//			@Param("themeId") List<Long> themeIds);
	
	@Query("SELECT new com.central.in_books.domain.BookResponse(b.id, b.name, b.imgUrl, b.description, "
			+ "new com.central.in_books.domain.Field(b.author.id, b.author.name), "
			+ "new com.central.in_books.domain.Field(b.category.id, b.category.name), "
			+ "new com.central.in_books.domain.Field(b.genre.id, b.genre.name), "
			+ "new com.central.in_books.domain.Field(b.theme.id, b.theme.name)) from Book b "
			+ "where b.author.id IN (:authorId) or b.category.id IN (:categoryId) or b.genre.id IN (:genreId) or b.theme.id IN (:themeId)")
	List<BookResponse> getBooksCustomSearch(@Param("authorId") List<Long> authorIds, 
			@Param("categoryId") List<Long> categoryIds,
			@Param("genreId") List<Long> genreIds,
			@Param("themeId") List<Long> themeIds);
	
	
//	@Query("SELECT b from Book b where b.name=:name")
//	List<Book> getBookByName(@Param("name") String name);

}
