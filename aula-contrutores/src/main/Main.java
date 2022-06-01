package main;

import model.Book;

public class Main {

	public static void main(String[] args) {

		Book java = new Book();
			
		System.out.println(java.getISBN());
		System.out.println(java.getAuthor());
		System.out.println(java.getPages());
		System.out.println(java.getPublisher());
		System.out.println(java.getTitle());
		System.out.println(java.getYear());
		System.out.println(java.isSold());
	}
}
