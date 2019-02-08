package main.java.com.example.demo.iteratormode.entity;

import main.java.com.example.demo.iteratormode.entity.itfc.Iterator;

public class BookShelfIterator implements Iterator{

	private BookShelf bookShelf;
	private int index;
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index ++;
		return book;
	}

	public static void main(String[] args) {
		BookShelf bookShelf2 = new BookShelf(4);
		bookShelf2.appenBook(new Book("环游世界80天"));
		bookShelf2.appenBook(new Book("圣经"));
		bookShelf2.appenBook(new Book("灰姑娘"));
		bookShelf2.appenBook(new Book("斗破苍穹"));
		
		Iterator iterator = bookShelf2.iterator();
		while (iterator.hasNext()) {
			Book book = (Book)iterator.next();
			System.out.println(book);
		}
	}
}
