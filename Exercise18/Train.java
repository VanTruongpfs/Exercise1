package Exercise18;

public class Train {
	private Schedule schedule;
	private Route route;
	private boolean local;
/**
 * 
 * this is a constructor of Train
 * 
 * @param schedule
 * @param route
 * @param local
 * 
 * ex:
 * 	new Train(new Schedule(new ClockTime(7,30),new ClockTime(9,30)),new Route("Ho Chi Minh City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(9,30),new ClockTime(11,30)),new Route("Quy Nhon City","Nha Trang City"),true);
 *  new Train(new Schedule(new ClockTime(7,30),new ClockTime(11,30)),new Route("Ho Chi Minh City","Quy Nhon City"),false);
 * 	
 */
	public Train(Schedule schedule, Route route, boolean local) {
		this.schedule = schedule;
		this.route = route;
		this.local = local;
	}
	

}
