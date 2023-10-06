package Exercise16;

import org.junit.jupiter.api.Test;

class AuthorTest {
/**
 * this is a constructor test for Author
 * 
 * ex:
 * 	new Author("Jeffrey Acher",1940);
 *	new Author("Jeffrey Acher",1940);
 * 	new Author("Jeffrey Acher",1940);
 */

	@Test
	void testCostructor() {
		new Author("Jeffrey Acher",1940);
		new Author("Jeffrey Acher",1940);
		new Author("Jeffrey Acher",1940);
	}

}
