package com.vcs.lects.l13.unittests.books;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.vcs.lects.l13.unittests.books.resources.IBooksResource;

public class Library {

	private IBooksResource resource = null;

	public Library(IBooksResource resource) {
		this.resource = resource;
	}

	public List<Book> getAvailableBookByName(String name) {

		if (name == null) {
			return new ArrayList<>();
		}

		List<Book> result = new ArrayList<>();
		for (Book book : resource.searchBy(true)) {

			if (filterCheck(book, name)) {
				result.add(book);
			}
		}
		return result;

	}

	boolean filterCheck(Book book, String name) {
		boolean c = book.getName().toLowerCase().contains(name.toLowerCase());
		return c && book.isAvailable();
	}

}
