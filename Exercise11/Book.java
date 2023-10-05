package Exercise11;

public class Book {
	private String authorsName;
	private String title;
	private double price;
	private int yearOfPublication;
/**
 * this is a book constructor;
 * 
 * @param authorsName: author's name
 * @param title: title
 * @param price: price
 * @param yearOfPublication: year of publication
 * ex:
 * 	new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719);
 * 	new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
 * 	new Book("Pat Conroy", "Beach Music", 9.50, 1996);
 */
 public Book(String authorsName, String title, double price, int yearOfPublication) {
	 this.authorsName = authorsName;
	 this.title = title; 
	 this.price = price;
	 this.yearOfPublication = yearOfPublication;
	
 }
}