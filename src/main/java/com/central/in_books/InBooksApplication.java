package com.central.in_books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "http://localhost:3001")
public class InBooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(InBooksApplication.class, args);
	}

}
