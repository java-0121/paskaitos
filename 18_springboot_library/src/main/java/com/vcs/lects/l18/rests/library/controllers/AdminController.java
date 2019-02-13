package com.vcs.lects.l18.rests.library.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcs.lects.l18.rests.library.entities.Book;
import com.vcs.lects.l18.rests.library.service.PrivateAdminService;

@RestController
@RequestMapping("/admin/book")
public class AdminController {

	private final static Logger LOG = LoggerFactory.getLogger(AdminController.class);

	@Autowired
	private PrivateAdminService service;

	@PostMapping("/list")
	public List<Book> getAll() {
		LOG.info("Feching all...");
		List<Book> all = service.getAll();
		LOG.info("Feching all OK. Total: {}", all.size());
		return all;
	}

	@PostMapping("/add/one")
	public Book addBook(@RequestBody Book book) {
		LOG.info("Adding new book...");
		Book newOne = service.save(book);
		LOG.info("Adding new book OK. ID: {}", newOne.getId());
		return newOne;
	}

	@PostMapping("/add/many")
	public ResponseEntity<Void> addBooks(@RequestBody List<Book> books) {
		LOG.info("Adding many books...");
		service.saveAll(books);
		LOG.info("Adding many books OK. Total: {}", books.size());
		return ResponseEntity.ok().build();
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<Void> removeById(@PathVariable("id") Long id) {
		LOG.info("Removing by ID {}", id);
		service.delete(id);
		return ResponseEntity.ok().build();
	}

}
