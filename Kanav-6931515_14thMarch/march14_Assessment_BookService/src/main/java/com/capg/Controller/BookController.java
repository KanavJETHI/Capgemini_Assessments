package com.capg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Bean.Book;
import com.capg.Service.BookService;


@RestController
@RequestMapping("/books")
public class BookController {
	
	@Autowired
	BookService bs;
	
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks(){
		return bs.getAllBooks();
	}
	
	@GetMapping("/getbookbyid/{id}")
	public Book getBookById(@PathVariable String id) {
		return bs.getBookById(id);
	}
	
	@PostMapping("/addbook")
	public String addBook(@RequestBody Book book) {
		bs.addBook(book);
		
		return book.getBookId();
	}
	
	@PutMapping("/updatebook/{id}")
	public void updateBook(@PathVariable String id, @RequestBody Book book) {
		bs.updateBook(id, book);
	}
	
	
	
	
	
	
}
