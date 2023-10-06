package Exercise18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScheduleTest {
/**
 * this is a constructor test for Schedule
 * 
 * ex:
 * 	new Schedule(new ClockTime(7,30),new ClockTime(9,30));
 *	new Schedule(new ClockTime(9,30),new ClockTime(11,30));
 *	new Schedule(new ClockTime(7,30),new ClockTime(11,30));
 */

	@Test
	void testConstructor() {
		new Schedule(new ClockTime(7,30),new ClockTime(9,30));
		new Schedule(new ClockTime(9,30),new ClockTime(11,30));
		new Schedule(new ClockTime(7,30),new ClockTime(11,30));
	}

}
