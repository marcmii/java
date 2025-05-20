package Objectes_MarcMiquel;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book("978-3-16-148410-0", "El llibre 1", "Autor 1", 250);
		Book book2 = new Book("123-4-55-112309-1", "El llibre 2", "Autor 2", 351);
		Book book3 = new Book("122-6-45-584829-4", "El llibre 3", "Autor 3", 677);
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		
		Book maxPagesBook = book1;
		
		if (book2.getPageCount() > maxPagesBook.getPageCount()) {
			maxPagesBook = book2;
		}
		if (book3.getPageCount() > maxPagesBook.getPageCount()) {
			maxPagesBook = book3;
		}
		
		
		System.out.println("El llibre que te més pàgines és " + maxPagesBook.getTitle());
	}

}
