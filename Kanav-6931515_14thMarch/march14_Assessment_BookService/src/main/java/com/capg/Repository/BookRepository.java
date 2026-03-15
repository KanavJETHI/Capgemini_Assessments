package com.capg.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.Bean.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String>{
	
}
