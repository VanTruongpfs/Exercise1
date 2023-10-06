package Exercise16;

import org.junit.jupiter.api.Test;

class BookTest {
/**
 * this is a constructor test of Book
 * ex:
 * 	new Book(new Author("Jeffrey Acher",1940),"Kane and Abel",15,1979);
 * 	new Book(new Author("Jeffrey Acher",1940),"Only time will tell",6,2011);
 * 	new Book(new Author("Jeffrey Acher",1940),"Straitors Gate",18,2023);
 * 
 */
	@Test
	void testConstructor() {
		new Book(new Author("Jeffrey Acher",1940),"Kane and Abel",15,1979);
		new Book(new Author("Jeffrey Acher",1940),"Only time will tell",6,2011);
		new Book(new Author("Jeffrey Acher",1940),"Straitors Gate",18,2023);
	}

}
