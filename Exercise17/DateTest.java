package Exercise17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {
/**
 * this is a constructor test for Date
 * 
 *ex:
 *	new Date(5,10,2023);
	new Date(6,10,2023);
	new Date(7,10,2023);
 *   
 */

	@Test
	void testConstructor() {
		new Date(5,10,2023);
		new Date(6,10,2023);
		new Date(7,10,2023);
	}

}
