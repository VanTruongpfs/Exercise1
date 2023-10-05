package Exercise15;

public class House {
	private String kind;
	private int numberOfRooms;
	private double askingPrice;
	private Address address;
	/**
	 * this is a house constructor
	 * 
	 * @param kind: kind
	 * @param numberOfRooms: number of rooms
	 * @param askingPrice: asking price
	 * @param address: address
	 * 
	 * ex:
	 * new House("Ranch", 7, 375.000, new Address(23 ,"Maple Street", "Brookline"));
	 * new House("Colonial", 9, 450.000,new Address(5 ,"Joye Road", "Newton"));
	 * new House("Cape", 6 , 235.000,new Address(83 ,"Winslow Road", "Waltham"));
	 */
	public House(String kind, int numberOfRooms, double askingPrice, Address address) {
		this.kind = kind;
		this.numberOfRooms = numberOfRooms;
		this.askingPrice = askingPrice;
		this.address = address;
	}
	


}
