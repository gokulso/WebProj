package SerializationTest;

import java.io.Serializable;

public class Address{
	

	private String area;
	private int pin;
	
	public Address(){}
	
	public Address(String area, int pin) {
		super();
		this.area = area;
		this.pin = pin;
	}



	@Override
	public String toString() {
		return "Address [area=" + area + ", pin=" + pin + "]";
	}
	
 
}
