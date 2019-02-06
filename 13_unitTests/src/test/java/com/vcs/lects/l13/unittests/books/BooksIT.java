package com.vcs.lects.l13.unittests.books;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.vcs.lects.l13.unittests.books.resources.BooksResource;
import com.vcs.lects.l13.unittests.books.resources.IBooksResource;

public class BooksIT {

	@Test
	public void gettingDataFromResources() {

		IBooksResource resource = new BooksResource();
		Library library = new Library(resource);

		List<Book> books = library.getAvailableBookByName("js");

		Assert.assertEquals(0, books.size());

	}

}
