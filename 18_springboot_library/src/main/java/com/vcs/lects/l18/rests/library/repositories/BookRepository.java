package com.vcs.lects.l18.rests.library.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.vcs.lects.l18.rests.library.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByAuthorContainingIgnoreCaseAndNameContainingIgnoreCase(String author, String name);
	
	List<Book> findByAuthorContainingIgnoreCaseOrNameContainingIgnoreCase(String author, String name);
	
	
	// Performance killer SQL :)
	
	@Query("SELECT b FROM Book b WHERE (b.count > 0 OR :available = TRUE)"
			+ " AND (UPPER(b.name) LIKE UPPER(CONCAT('%',:searchtext,'%'))"
			+ " OR UPPER(b.author) LIKE UPPER(CONCAT('%',:searchtext,'%'))"
			+ " OR UPPER(b.codeISBN) LIKE UPPER(CONCAT('%',:searchtext,'%')))")
    List<Book> fetchBooks(@Param("searchtext") String searchtext, @Param("available") boolean onlyAvailable);
	
	

}
