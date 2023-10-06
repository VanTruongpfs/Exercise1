package Exercise15;

public class Address {
	private int houseNumber;
	private String stressName;
	private String city;
/**
 * this is a address constructor
 * 
 * @param houseNumber: house number
 * @param stressName: stress name
 * @param city: city
 * 
 * ex:
 * 	new Address(23, "Maple Street", "Brookline");
 * 	new Address(5, "Joye Road", "Newton");
 * 	new Áddress(83, "Winslow Road", "Waltham");
 */
	public Address(int houseNumber, String stressName, String city) {
		this.houseNumber = houseNumber;
		this.stressName = stressName;
		this.city = city;
	}


}
