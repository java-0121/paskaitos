package com.vcs.lects.l18.rests.library.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@NotBlank
	private String codeISBN;

	@NotBlank
	private String name;

	@NotBlank
	private String author;

	@PositiveOrZero
	private int count;

	// public Book() {
	//
	// }
	//
	// public Book(Integer id, String codeISBN, String name, String author, int
	// count) {
	// this.id = id;
	// this.codeISBN = codeISBN;
	// this.name = name;
	// this.author = author;
	// this.count = count;
	// }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCodeISBN() {
		return codeISBN;
	}

	public void setCodeISBN(String codeISBN) {
		this.codeISBN = codeISBN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
