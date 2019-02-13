package com.vcs.lects.l18.rests.library.service;

import java.util.List;
import java.util.Optional;

import com.vcs.lects.l18.rests.library.entities.Book;

public interface PublicLibraryService {

	Optional<Book> findById(long id);

	List<Book> findByAnyText(String text);

	List<Book> findByNameAndAuthor(String author, String name);

	List<Book> findByNameOrAuthor(String author, String name);

	boolean takeBook(long id);

	boolean returnBook(long id);

}
