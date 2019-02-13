package com.vcs.lects.l18.rests.library.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcs.lects.l18.rests.library.entities.Book;
import com.vcs.lects.l18.rests.library.repositories.BookRepository;

@Service
public class PrivateAdminServiceImpl implements PrivateAdminService {

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
	public void saveAll(List<Book> books) {
		bookRepository.saveAll(books);
	}

}
