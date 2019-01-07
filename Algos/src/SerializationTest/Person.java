package SerializationTest;

import java.io.Closeable;
import java.io.Serializable;

public class Person extends Address implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int age;
	private String name;
	private String city;
	private String contry;
	//private Address add;
	
	public Person(int age, String name , String city) {
		super("Baner",411045);
		this.age = age;
		this.name = name;
		this.city = city;
		//this.add = add;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", city=" + city + ", contry=" + contry + "]";
	}

	

/*	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}*/
	
	
	
	

}
