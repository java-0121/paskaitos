package com.vcs.lects.l13.unittests.books;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import com.vcs.lects.l13.unittests.books.resources.IBooksResource;

public class LibraryTest {

	private IBooksResource resource;
	private Library library;
	private List<Book> books;

	@Before
	public void init() {
		books = new ArrayList<>();

		resource = new IBooksResource() {

			@Override
			public List<Book> searchBy(boolean available) {
				return books;
			}

			@Override
			public Book getByISBN(String codeISBN) {
				throw new RuntimeException();
			}

			@Override
			public List<Book> getAllBooks() {
				throw new RuntimeException();
			}
		};

		library = new Library(resource);

	}

	@Test
	public void filterCheckFailSsuccess() {
		Assert.assertTrue(library.filterCheck(new Book("0", "a JAVA b", true), "ava"));
		Assert.assertTrue(library.filterCheck(new Book("0", "a JAVA b", true), "AVA"));
		Assert.assertTrue(library.filterCheck(new Book("0", "a JAVA b", true), " "));
	}

	@Test
	public void filterCheckFail() {

		Assert.assertFalse(library.filterCheck(new Book("0", "a JAVA b", true), "COBOL"));
		Assert.assertFalse(library.filterCheck(new Book("0", "a JAVA b", true), "AVAJ"));
		Assert.assertFalse(library.filterCheck(new Book("0", "a JAVA b", true), "  "));

	}

	@Test
	public void getAvailableBookByNameSuccess1() {

		books.add(new Book("0", "a JAVA b", true));
		books.add(new Book("2", "a java b", true));
		books.add(new Book("3", "a Java b", true));
		books.add(new Book("4", "JAVA a", true));
		books.add(new Book("5", "a JAVA", true));

		List<Book> books = library.getAvailableBookByName("jAVA");

		Assert.assertEquals(5, books.size());
		Assert.assertEquals("0", books.get(0).getCodeISBN());
		Assert.assertEquals("2", books.get(1).getCodeISBN());
		Assert.assertEquals("3", books.get(2).getCodeISBN());
		Assert.assertEquals("4", books.get(3).getCodeISBN());
		Assert.assertEquals("5", books.get(4).getCodeISBN());

	}

	@Test(expected = NullPointerException.class)
	@Ignore
	public void getAvailableBookByNameNullPointer() {

		books.add(new Book("0", "a JAVA b", true));
		library.getAvailableBookByName(null);

		Assert.fail();
	}

	@Test
	public void getAvailableBookByNameNull() {

		books.add(new Book("0", "a JAVA b", true));
		library.getAvailableBookByName(null);

	}

	@Test
	public void jiraTicket456465() {
		books.add(new Book("0", "Java pradziamokslis", true));
		books.add(new Book("1", "Java pazengusiems", true));
		books.add(new Book("2", "Java kava", false));
		books.add(new Book("3", "Java zemes ukyje su COBOL", true));
		books.add(new Book("4", "Programavimas JAVA", true));
		books.add(new Book("5", "Kodel?", false));
		books.add(new Book("6", "As nenoriu mokytis", true));
		books.add(new Book("7", "Kaip neperskaityti knygos", false));
		books.add(new Book("8", "Kodinimas JAVA zemes ukyje", true));

		List<Book> books = library.getAvailableBookByName("jAVA");

		Assert.assertEquals(5, books.size());
		Assert.assertEquals("0", books.get(0).getCodeISBN());
		Assert.assertEquals("1", books.get(1).getCodeISBN());
		Assert.assertEquals("3", books.get(2).getCodeISBN());
		Assert.assertEquals("4", books.get(3).getCodeISBN());
		Assert.assertEquals("8", books.get(4).getCodeISBN());
	}

}
