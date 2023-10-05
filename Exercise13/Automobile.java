package Exercise13;

public class Automobile {
	private String model;
	private double price;
	private double mileage;
	private boolean used;
/**
 * this is a automobile constructor;
 * 
 * @param model: model
 * @param price: price
 * @param mileage: mileage
 * @param used: used
 * 
 * ex:
 * 	new Automobile("Mercedes",109.800,10,false);
 * 	new Automobile("Vinfat lux A2.0",52.000,15,true);
 * 	new Automobile("BMW X4",61.000,20,false);
 * 
 */
public Automobile(String model, double price, double mileage, boolean used) {
	this.model = model;
	this.price = price;//in dollars
	this.mileage = mileage;//in miles per gallon
	this.used = used;
}
}
