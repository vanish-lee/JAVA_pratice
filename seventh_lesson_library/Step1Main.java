package code_review;
import java.util.*;

public class Step1Main {
	public static void main(String[] args) {
		LibraryBook book1,book2,book3,book4;
		GregorianCalendar dueDate,returnDate;
		returnDate = new GregorianCalendar(2004,Calendar.MARCH,15);
		
		dueDate = new GregorianCalendar(2004,Calendar.MARCH,14);
		book1 = new LibraryBook(dueDate);
		
		dueDate = new GregorianCalendar(2004,Calendar.FEBRUARY,13);
		book2 = new LibraryBook(dueDate);
		book2.setTitle("Library book No 2");
		dueDate = new GregorianCalendar(2004,Calendar.JANUARY,12);
		book3 = new LibraryBook(dueDate);
		book3.setTitle("JAVA for Smarties");
		dueDate = new GregorianCalendar(2004,Calendar.JANUARY,1);
		book4 = new LibraryBook(dueDate,1.50,230.00,"Me and My Java");
		
		System.out.println(book1.toString());
		System.out.println(book2.toString());
		System.out.println(book3.toString());
		System.out.println(book4.toString());
	}
}
