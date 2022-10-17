package com.sujalchoudhari;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

class LibraryBook {
	String name;
	String author;
	String issuedOn;
	String issuedTo;

	public LibraryBook(String name, String author) {
		this.name = name;
		this.author = author;
		this.issuedOn = "";
		this.issuedTo = "";
	}

	public String toString() {
		String str = "* " + name.toUpperCase() + " -" + author;
		if (!issuedTo.equalsIgnoreCase("")) {
			str += " issued to " + issuedTo + " on " + issuedOn;
		}
		return str;
	}
}

class Library {
	ArrayList<LibraryBook> books;
	ArrayList<String> students;

	public Library() {
		this.books = new ArrayList<LibraryBook>(10);
		this.students = new ArrayList<String>(10);
	}

	void addStudent(String name) {
		this.students.add(name);
	}

	void addBook(String name, String author) {
		this.books.add(new LibraryBook(name, author));
	}

	void issueBook(String name, String to) {
		for (LibraryBook book : books) {
			if (book.name.equalsIgnoreCase(name)) { // Book found
				book.issuedTo = to;

				LocalDate dt = LocalDate.now();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				book.issuedOn = dt.format(format);
				return;
			}
		}
	}

	void returnBook(String name) {
		for (LibraryBook book : books) {
			if (book.name.equalsIgnoreCase(name)) { // Book found
				book.issuedTo = "";
				book.issuedOn = "";
				return;
			}
		}
	}
	
	void printBooks() {
		System.out.println("----------------------");
		if(books.size() ==0) {
			System.out.println("No book added");
			return;
		}
		for(LibraryBook book: books) {
			System.out.println(book.toString());
		}
		System.out.println("----------------------");
	}

}

public class EX_09_LibraryManagementSystem {

	public static void main(String[] args) {
		Library l = new Library();
		Scanner sc = new Scanner(System.in);
		mainMenu(sc, l);
	}

	public static void mainMenu(Scanner sc, Library l) {
		int choice = 4;

		do {
			System.out.println("Library Management System");
			System.out.println("All Books:");
			l.printBooks();
			
			System.out.println("-------------------------------------");
			System.out.println("0> Add a Student");
			System.out.println("1> Add a Book");
			System.out.println("2> Issue a Book to a Registered Student");
			System.out.println("3> Return a Issued Book");
			System.out.println("4> Exit");

			System.out.println(">>> ");
			choice = sc.nextInt();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n");

			switch (choice) {
			case 0:
				addStudentMenu(sc, l);
				break;
			case 1:
				addBookMenu(sc, l);
				break;
			case 2:
				issueBookMenu(sc,l);
				break;
			case 3:
				returnBookMenu(sc,l);
				break;
			default:
				choice = 4;
			}

		} while (choice != 4);

		System.out.println("-------------------------------------");
		System.out.println("Library Exited");
	}

	public static void addStudentMenu(Scanner sc, Library l) {
		System.out.println("You Chose to add a Student");
		System.out.println("-------------------------------------");
		System.out.println("Enter Students Name");

		System.out.println(">>> ");
		String choice = sc.next();
		choice += sc.nextLine();

		// check if exists
		for (String student : l.students) {
			if (student.equalsIgnoreCase(choice)) {
				System.out.println("This name is already registered");
				System.out.println("-------------------------------------");
				return;
			}
		}

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		l.addStudent(choice);
		System.out.println(choice + " added Successfully");
		System.out.println("-------------------------------------");
	}

	public static void addBookMenu(Scanner sc, Library l) {
		System.out.println("You Chose to add a Book");
		System.out.println("-------------------------------------");
		System.out.println("Enter Book Name");

		System.out.println(">>> ");
		String name = sc.next();
		name += sc.nextLine();

		// check if exists
		for (LibraryBook book : l.books) {
			if (book.name.equalsIgnoreCase(name)) {
				System.out.println("This book is already registered");
				System.out.println("-------------------------------------");
				return;
			}
		}

		System.out.println("Enter Book Author");

		System.out.println(">>> ");
		String author = sc.next();
		author += sc.nextLine();

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		l.addBook(name, author);
		System.out.println(name + " by "+ author + " added Successfully");
		System.out.println("-------------------------------------");
	}

	public static void issueBookMenu(Scanner sc, Library l) {
		System.out.println("You Chose to issue a Book");
		l.printBooks();
		System.out.println("-------------------------------------");
		System.out.println("Enter Book Name");

		System.out.println(">>> ");
		String name = sc.next();
		name += sc.nextLine();

		// check if exists
		for (LibraryBook book : l.books) {
			// check if book exists and is issued.
			if (book.name.equalsIgnoreCase(name) && !book.issuedTo.equalsIgnoreCase("")) {
				System.out.println("This book is already issued");
				System.out.println("-------------------------------------");
				return;
			}
		}

		System.out.println("Enter Your Name");

		System.out.println(">>> ");
		String to = sc.next();
		to += sc.nextLine();

		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		l.issueBook(name, to);
		System.out.println(name + " is issued to "+ to);
		System.out.println("-------------------------------------");
	}
	
	
	public static void returnBookMenu(Scanner sc, Library l) {
		System.out.println("You Chose to return a Book");
		l.printBooks();
		System.out.println("-------------------------------------");
		System.out.println("Enter Book Name");

		System.out.println(">>> ");
		String name = sc.next();
		name += sc.nextLine();

		// check if exists
		for (LibraryBook book : l.books) {
			// check if book exists and is issued.
			if (book.name.equalsIgnoreCase(name) && book.issuedTo.equalsIgnoreCase("")) {
				System.out.println("This book was not issued");
				System.out.println("-------------------------------------");
				return;
			}
		}


		System.out.println("\n\n\n\n\n\n\n\n\n\n\n");
		l.returnBook(name);
		System.out.println(name + " is returned back ");
		System.out.println("-------------------------------------");
	}

}
