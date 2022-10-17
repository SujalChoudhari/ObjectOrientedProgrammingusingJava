package com.sujalchoudhari;

class Book {
	public boolean isIssued;
	public String name;

	Book(String name) {
		this.name = name;
		this.isIssued = false;
	}
}

class ELibrary {
	private int m_BookCount;
	private Book[] m_Books;

	ELibrary() {
		m_BookCount = 0;
		m_Books = new Book[20];
	}

	public void addBook(String name) {
		m_Books[m_BookCount] = new Book(name);
		m_BookCount++;
	}

	public void issueBook(String name) {
		for (int i=0; i <m_BookCount;i++) {
			Book book = m_Books[i];
			if (book.name.equalsIgnoreCase(name)) {
				if (book.isIssued) {
					System.out.println("Book is already issued");
					return;
				}
				book.isIssued = true;
				return;
			}
		}
		System.out.println("Book not found");
	}

	public void returnBook(String name) {
		for (int i=0; i <m_BookCount;i++) {
			Book book = m_Books[i];
			if (book.name.equalsIgnoreCase(name)) {
				if (!book.isIssued) {
					System.out.println("This book was not issued at all");
					return;
				}
				book.isIssued = false;
				return;
			}
		}
		System.out.println("Book not found");
	}

	public void showAvailableBooks() {
		for (int i=0; i <m_BookCount;i++) {
			Book book = m_Books[i];
			if (book.isIssued) {
				System.out.println("Book: "+book.name + " (issued)");
			} else {
				System.out.println("Book: "+book.name);
			}
		}
	}

}

public class EX_06_ELibrary {
	public static void main(String[] args) {
		ELibrary l = new ELibrary();
		char c= 'A';
		
		for(int i=0; i< 20;i++) {
			l.addBook(Character.toString((char)c+i));
		}
		l.issueBook("S");
		l.issueBook("S");
		l.returnBook("W");
		l.returnBook("S");
		
		l.showAvailableBooks();
	}
}
