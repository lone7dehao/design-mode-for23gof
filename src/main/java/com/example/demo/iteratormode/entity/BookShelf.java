package main.java.com.example.demo.iteratormode.entity;

import main.java.com.example.demo.iteratormode.entity.itfc.Aggregate;
import main.java.com.example.demo.iteratormode.entity.itfc.Iterator;

public class BookShelf implements Aggregate{

	private Book[] books;
	private int last;
	
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}

	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appenBook(Book book) {
		books[last] = book;
		last ++;
	}
	
	public int getLength() {
		return last;
	}
	
	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}

}
