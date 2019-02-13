package com.vcs.lects.l18.rests.library.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.lects.l18.rests.library.entities.Book;
import com.vcs.lects.l18.rests.library.repositories.BookRepository;

@Service
public class LibraryServiceImpl implements LibraryService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAll() {
		List<Book> books = new ArrayList<Book>();
		bookRepository.findAll().forEach((b) -> {
			books.add(b);
		});
		return books;
	}

	@Override
	public void delete(Long id) {
		bookRepository.deleteById(id);
	}

	@Override
	public Book save(Book book) {
		Book result = bookRepository.save(book);
		return result;
	}

	@Override
	public List<Book> findByName(String name) {
		return bookRepository.findByName(name);
	}

	@Override
	public List<Book> findByAuthorOrName(String author, String name) {
		return bookRepository.findByAuthorOrName(author, name);
	}

}
