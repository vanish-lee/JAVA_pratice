package code_review;

import java.util.*;

public class BookTracker {
	public static final int ERROR = -1;
	private List books;
	public BookTracker() {
		books = new ArrayList();
	}
	public void add(LibraryBook book) {
		books.add(book);
	}
	public double getCharge() {
		return getCharge(new GregorianCalendar());
	}
	public double getCharge(GregorianCalendar returnDate) {
		if(books.isEmpty()) {
			return ERROR;
		}else {
			return totalCharge(returnDate);
		}
	}
	public String getList() {
		StringBuffer result = new StringBuffer("");
		String lineSeparator = System.getProperty("line.separator");
		Iterator itr = books.iterator();
		while(itr.hasNext()) {
			LibraryBook book = (LibraryBook) itr.next();
			result.append(book.toString()+lineSeparator);
		}
		return result.toString();
		}
	private double totalCharge(GregorianCalendar returnDate) {
		double totalCharge = 0.0;
		Iterator itr = books.iterator();
		while(itr.hasNext()) {
			LibraryBook book=(LibraryBook) itr.next();
			totalCharge+=book.computeCharge(returnDate);
		}
		return totalCharge;
	}
}
