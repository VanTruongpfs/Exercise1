package Exercise18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockTimeTest {
/**
 * this is a constructor test for ClockTime
 * 
 * ex:
 * 	new ClockTime(7,30);
 *  new ClockTime(9,30);
 *  new ClockTime(11,30);
 */

	@Test
	void testConstructor() {
		new ClockTime(7,30);
		new ClockTime(9,30);
		new ClockTime(11,30);
	}

}
