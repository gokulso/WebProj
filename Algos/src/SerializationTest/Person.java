package SerializationTest;

import java.io.Closeable;
import java.io.Serializable;

public class Person implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int age;
	private String name;
	private String city;
	
	public Person(int age, String name , String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", city=" + city + "]";
	}

/*	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}*/
	
	
	
	

}
