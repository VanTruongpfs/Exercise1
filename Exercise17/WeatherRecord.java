package Exercise17;

public class WeatherRecord {
	private Date d;
	private TemperatureRange today;
	private TemperatureRange normal;
	private TemperatureRange record;
	private double precipitation;
/**
 * this is a WeatherRecord constructor
 * @param d
 * @param today
 * @param normal
 * @param record
 * ex:
 * 	new WeatherRecord(new Date(5,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * 	new WeatherRecord(new Date(6,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * 	new WeatherRecord(new Date(7,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 * 
 * 
 * 
 */
	public WeatherRecord(Date d, TemperatureRange today, TemperatureRange normal, TemperatureRange record, double precipitation) {
		this.d = d;
		this.today = today;
		this.normal = normal;
		this.record = record;
	}
	
	

}
