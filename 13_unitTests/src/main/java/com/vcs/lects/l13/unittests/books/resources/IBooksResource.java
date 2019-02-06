package com.vcs.lects.l13.unittests.books.resources;

import java.util.List;

import com.vcs.lects.l13.unittests.books.Book;

public interface IBooksResource {

	public List<Book> getAllBooks();

	public Book getByISBN(String codeISBN);

	public List<Book> searchBy(boolean available);
	
}
