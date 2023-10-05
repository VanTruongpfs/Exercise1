/**
 * 
 */
package Exercise14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * this is a Junit test of Apoint;
 */
class ApointTest {
/**
 * this is a constructor's test;
 *ex:
 * 	new Apoint(24,30,00);
 * 	new Apoint(24,40,50);
 * 	new Apoint(24,59,59);
 */

	@Test
	void testConstructor() {
		new Apoint(24,30,00);
		new Apoint(24,40,50);
		new Apoint(24,59,59);
	}

}
