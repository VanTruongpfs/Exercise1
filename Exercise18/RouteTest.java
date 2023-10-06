package Exercise18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RouteTest {
/**
 * this is a constructor test for Route
 * 
 * ex:
 * 	new Route("Ho Chi Minh City","Nha Trang City");
 * 	new Route("Quy Nhon City","Nha Trang City");
 * 	new Route("Ho Chi Minh City","Quy Nhon City");
 */
	@Test
	void testConstructor() {
		new Route("Ho Chi Minh City","Nha Trang City");
		new Route("Quy Nhon City","Nha Trang City");
		new Route("Ho Chi Minh City","Quy Nhon City");
	}

}
