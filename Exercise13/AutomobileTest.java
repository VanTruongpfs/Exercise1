package Exercise13;

import org.junit.jupiter.api.Test;

class AutomobileTest {
/**
 * this is a constructor test for Automobile
 * 
 * ex:
 * 	new Automobile("Mercedes",109.800,10,true);
 *  new Automobile("Vinfat lux A2.0",52.000,15,true);
 *  new Automobile("BMW X4",61.000,20,false);
 */
	@Test
	void testConstructor() {
		new Automobile("Mercedes",109.800,10,true);
		new Automobile("Vinfat lux A2.0",52.000,15,true);
		new Automobile("BMW X4",61.000,20,false);
	}

}
