package Exercise18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrainTest {
/**
 * thia is a constructor test for Train
 * 
 * ex:
 * 	new Train(new Schedule(new ClockTime(7,30),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(7,30),new ClockTime(11,30)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 */
	@Test
	void testConstructor() {
		new Train(new Schedule(new ClockTime(7,30),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
		new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
		new Train(new Schedule(new ClockTime(7,30),new ClockTime(11,30)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
	}

}
