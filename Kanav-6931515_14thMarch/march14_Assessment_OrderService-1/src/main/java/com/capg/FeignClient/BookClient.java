package com.capg.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capg.Bean.BookDTO;
import java.util.List;

@FeignClient(name="BOOK-SERVICE", url = "http://localhost:9091")
public interface BookClient {
	
	@GetMapping("/books/getallbooks")
    List<BookDTO> getAllBooks();

    @GetMapping("/books/getbookbyid/{id}")
    BookDTO getBookById(@PathVariable String id);

    @PostMapping("/books/addbook")
    String addBook(@RequestBody BookDTO book);

    @PutMapping("/books/updatebook/{id}")
    void updateBook(@PathVariable String id, @RequestBody BookDTO book);
	

}
