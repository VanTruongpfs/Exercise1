package Exercise14;

public class Apoint {
	private int hours;
	private int minutes;
	private int seconds;
/**
 * this is a point constructor;
 * 
 * @param hours: hours
 * @param minutes: minutes
 * @param seconds: seconds
 * 
 * ex:
 * 	new Apoint(24,30,00);
 * 	new Apoint(24,40,50);
 * 	new Apoint(24,59,59);
 * 
 */
public Apoint(int hours, int minutes, int seconds) {
	this.hours = hours;
	this.minutes = minutes;
	this.seconds = seconds;
}

}
