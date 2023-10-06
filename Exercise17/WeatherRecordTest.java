package Exercise17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WeatherRecordTest {
/**
 * this is a constructor test for WeatherRecord
 * 
 * ex:
 * new WeatherRecord(new Date(5,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
 * new WeatherRecord(new Date(6,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
 * new WeatherRecord(new Date(7,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
 * 
 */

	@Test
	void testConstructor() {
		new WeatherRecord(new Date(5,10,2023),new TemperatureRange(25,30),new TemperatureRange(24,30),new TemperatureRange(23,32),19.1);
		new WeatherRecord(new Date(6,10,2023),new TemperatureRange(23,32),new TemperatureRange(25,30),new TemperatureRange(24,30),21.7);
		new WeatherRecord(new Date(7,10,2023),new TemperatureRange(24,30),new TemperatureRange(23,32),new TemperatureRange(25,30),22.5);
	}

}
