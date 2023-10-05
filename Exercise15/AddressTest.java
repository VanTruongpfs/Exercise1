package Exercise15;

import org.junit.jupiter.api.Test;

class AddressTest {
/**
 * this is a contructor test for Address
 * ex:
 * 	new Address(23 ,Maple Street, Brookline);
 * 	new Address(5 ,Joye Road, Newton);
 * 	new Address(83 ,Winslow Road, Waltham);
 */
	@Test
	void testConstructor() {
		new Address(23 ,"Maple Street", "Brookline");
		new Address(5 ,"Joye Road","Newton");
		new Address(83 ,"Winslow Road", "Waltham");
		
	}

}
