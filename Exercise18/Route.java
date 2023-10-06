package Exercise18;

public class Route {
	private String origin;
	private String destination;
/**
 * 
 * this is a constructor of Route
 * 
 * @param origin
 * @param destination
 * 
 * ex:
 * 	new Route("Ho Chi Minh City","Nha Trang City");
 * 	new Route("Quy Nhon City","Nha Trang City");
 * 	new Route("Ho Chi Minh City","Quy Nhon City");
 */
	public Route(String origin, String destination) {
		this.origin = origin;
		this.destination = destination;
	}

	

}
