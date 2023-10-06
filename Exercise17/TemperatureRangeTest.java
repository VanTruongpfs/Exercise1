package Exercise17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureRangeTest {
/**
 * this is a constructor test for TemperatureRange
 * 
 * ex:
 * new TemperatureRange(25,30);
 * new TemperatureRange(23,32);
 * new TemperatureRange(24,30);
 */

	@Test
	void test() {
		new TemperatureRange(25,30);
		new TemperatureRange(23,32);
		new TemperatureRange(24,30);
	}

}
