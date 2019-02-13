package com.vcs.lects.l18.rests.library.service;

import java.util.List;

import com.vcs.lects.l18.rests.library.entities.Book;

public interface LibraryService {

	List<Book> getAll();

	void delete(Long id);

	Book save(Book book);
	
	List<Book> findByName(String name);
	
	List<Book> findByAuthorOrName(String author, String name);

}
