package com.vcs.lects.l18.rests.library.service;

import java.util.List;

import com.vcs.lects.l18.rests.library.entities.Book;

public interface PrivateAdminService {

	List<Book> getAll();

	void delete(Long id);

	Book save(Book book);

	void saveAll(List<Book> books);

}
