package com.vcs.lects.l13.unittests.books.app;

import java.util.List;

import com.vcs.lects.l13.unittests.books.Book;
import com.vcs.lects.l13.unittests.books.Library;
import com.vcs.lects.l13.unittests.books.resources.BooksResource;
import com.vcs.lects.l13.unittests.books.resources.IBooksResource;

public class Main {

	public static void main(String[] args) {

		IBooksResource resource = new BooksResource();

		Library l = new Library(resource);

		List<Book> searchResult = l.getAvailableBookByName("6");

		for (Book book : searchResult) {
			System.out.println(book.getName());
		}

	}

}
