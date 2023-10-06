package Exercise18;

public class Schedule {
	private ClockTime departure;
	private ClockTime arriaval;
/**
 * this is a constructor of Schedule
 * 
 * @param departure
 * @param arriaval
 * 
 * ex:
 *	new Schedule(new ClockTime(7,30),new ClockTime(9,30));
 *	new Schedule(new ClockTime(9,30),new ClockTime(11,30));
 *	new Schedule(new ClockTime(7,30),new ClockTime(11,30));
 * 
 */
	public Schedule(ClockTime departure, ClockTime arriaval) {
		this.departure = departure;
		this.arriaval = arriaval;
	}
	

}
