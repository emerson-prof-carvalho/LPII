package model;

import java.util.Date;

public class Book {
	// Atributos da classe
	private String ISBN = "";
	private String title = "";
	private String author = "";
	private String publisher = "";
	private int pages = 0;
	private Date year = null;
	private boolean sold = false; 
	
	// Contrutores
	public Book() {
		ISBN = "1234";
		title = "Ainda não definido";
		author = "Desconhecido";
	}
	
	public Book(String isbn) {
		ISBN = isbn;
	}

	public String getISBN() {
		return ISBN;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPages() {
		return pages;
	}

	public Date getYear() {
		return year;
	}

	public boolean isSold() {
		return sold;
	}
}
