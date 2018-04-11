package code_review;
import java.util.*;
public class Step2Main {
	public static void main(String[] args) {
		BookTracker bookTracker = new BookTracker();
		
		GregorianCalendar dueDate,returnDate;
		LibraryBook book;
		
		returnDate = new GregorianCalendar(2004,Calendar.MARCH,15);
		System.out.println("Error: No books added. Return code -"+bookTracker.getCharge(returnDate));
		System.out.println("output for empty book list:\n"+bookTracker.getList());
		System.out.println("\nAdding 20 books...\n");
		for(int i=0;i<20;i++) {
			dueDate = new GregorianCalendar(2004,Calendar.MARCH,i);
			book = new LibraryBook(dueDate);
			book.setTitle("Book Number"+i);
			
			bookTracker.add(book);
		}
		System.out.println("Total Charge: $"+bookTracker.getCharge(returnDate));
		System.out.println("\n");
		System.out.println("List: \n" + bookTracker.getList());
		
	}
}
