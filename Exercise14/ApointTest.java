package Exercise14;

import org.junit.jupiter.api.Test;


class APointTest {
/**
 * this is a constructor test for APoint;
 *ex:
 * 	new Apoint(24,30,00);
 * 	new Apoint(24,40,50);
 * 	new Apoint(24,59,59);
 */

	@Test
	void testConstructor() {
		new APoint(24,30,00);
		new APoint(24,40,50);
		new APoint(24,59,59);
	}

}
