package Exercise11;
import org.junit.jupiter.api.Test;

class BookTest {
	
/**
* this is a constructor test of Book
*ex:
* new Book("Daniel Defoe", "Robinson Crusoe", 15.50, 1719)=>true;
* new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902)=>true;
* new Book("Pat Conroy", "Beach Music", 9.50, 1996)=>true;
*/

	@Test
	void testConstructor() {
		new Book("Daniel Defoe","Robinson Crusoe",15.50,1719);
		new Book("Joseph Conrad", "Heart of Darkness", 12.80, 1902);
		new Book("Pat Conroy", "Beach Music", 9.50, 1996);
	}

}
