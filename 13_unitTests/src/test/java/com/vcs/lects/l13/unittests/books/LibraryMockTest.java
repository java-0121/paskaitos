package com.vcs.lects.l13.unittests.books;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.vcs.lects.l13.unittests.books.resources.IBooksResource;

public class LibraryMockTest {

	private IBooksResource resource;
	private Library library;

	@Before
	public void init() {

		resource = mock(IBooksResource.class);

		library = new Library(resource);
	}

	@Test
	public void successCases0() {

		when(resource.searchBy(anyBoolean())).thenReturn(new ArrayList<>());

		List<Book> books = library.getAvailableBookByName("asas");

		verify(resource).searchBy(true);
		verify(resource, never()).getAllBooks();

		// verify(resource).searchBy(false);

	}

}
