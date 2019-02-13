package com.vcs.lects.l18.rests.library.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vcs.lects.l18.rests.library.entities.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByName(String name);

	List<Book> findByAuthorOrName(String author, String name);

	List<Book> findByAuthorAndName(String author, String name);

}
