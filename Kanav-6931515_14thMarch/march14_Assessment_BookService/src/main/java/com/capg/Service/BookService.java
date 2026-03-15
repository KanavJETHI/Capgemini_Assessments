package com.capg.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Bean.Book;
import com.capg.Repository.BookRepository;
import java.util.*;

@Service
public class BookService {
	
	@Autowired
	BookRepository bs;
	
	public List<Book> getAllBooks(){
		List<Book> books = new ArrayList<Book>();
		
		bs.findAll().forEach(b1 -> books.add(b1));
		
		return books;
	}
	
	public Book getBookById(String id) {
		return bs.findById(id).orElse(null);
		
	}
	
	
	public void addBook(Book book) {
		bs.save(book);
	}
	
	public void updateBook(String id, Book book) {
		Book findBook = bs.findById(id).orElse(null);
		
		if(findBook == null) {
			return;
		}
		
		
		
		findBook.setAuthor(book.getAuthor());
		findBook.setTitle(book.getTitle());
		findBook.setIsbn(book.getIsbn());
		findBook.setPrice(book.getPrice());
		
		bs.save(findBook);
	}
	
	
	
	
}
