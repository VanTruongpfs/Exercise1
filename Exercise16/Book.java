package Exercise16;

public class Book {
	private Author author;
	private String title;
	private double price;
	private int yearOfPulication;
/**
 * this is a constructor of Book
 * @param author
 * @param title
 * @param price
 * @param yearOfPulication
 * 
 * ex:
 *  new Book(new Author("Jeffrey Acher",1940),"Kane and Abel",15,1979);
 *  new Book(new Author("Jeffrey Acher",1940),"Only time will tell",6,2011);
 *  new Book(new Author("Jeffrey Acher",1940),"Straitors Gate",18,2023);
 */
	public Book(Author author, String title, double price, int yearOfPulication) {
		this.author = author;
		this.title = title;
		this.price = price;//in dollas
		this.yearOfPulication = yearOfPulication;
	}

	

}
