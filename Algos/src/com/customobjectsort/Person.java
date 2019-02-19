package com.customobjectsort;

public class Person implements Comparable<Person> {
	
	
	private int id;
	private String name;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.id > o.getId()?1:this.id==o.getId()?0:-1;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
