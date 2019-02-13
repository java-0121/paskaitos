package com.vcs.lects.l18.rests.library.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.lects.l18.rests.library.entities.Book;
import com.vcs.lects.l18.rests.library.service.LibraryService;

@RestController
@RequestMapping("/")
public class LibraryAPI {

	private final static Logger LOG = LoggerFactory.getLogger(LibraryAPI.class);

	@Autowired
	private LibraryService service;

	// private

	@GetMapping
	public List<Book> getAll() {
		LOG.info("Retrieving all...");
		return service.getAll();
	}

	/*
	 * @GetMapping("/id/{id}") public ResponseEntity<Book>
	 * searchById(@PathVariable("id") @NumberFormat long id) {
	 * 
	 * LOG.info("Fetch by ID {}", id); Book book =
	 * daoFactory.getResource().getById(id);
	 * 
	 * if (book != null) { return ResponseEntity.ok(book); }
	 * 
	 * LOG.info("Not found by {}", id); return
	 * ResponseEntity.status(HttpStatus.NOT_FOUND).build(); }
	 */

	@GetMapping("/name/{n}/author/{a}")
	public List<Book> searchByName(@PathVariable("n") String name, @PathVariable("a") String author) {
		LOG.info("Search by name {} or {}", name, author);
		// return service.findByName(name);
		return service.findByAuthorOrName(author, name);
	}

	@PostMapping
	public Book addBook(@RequestBody Book book) {
		LOG.info("Adding new book...");
		Book newOne = service.save(book);
		LOG.info("Book added {}", newOne.getId());
		return newOne;
	}
	//
	// @PostMapping("many")
	// public void addBooks(@RequestBody List<Book> books) {
	// LOG.info("Adding many books...");
	//
	// for (Book book : books) {
	// addBook(book);
	// }
	//
	// LOG.info("Books added {}", books.size());
	// }

	@DeleteMapping("/{id}")
	public Boolean removeById(@PathVariable("id") Long id) {
		LOG.info("Removing by ID {}", id);
		service.delete(id);
		return true;
	}

}
