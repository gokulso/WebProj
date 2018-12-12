package testone.collections.TreeSetTest;

public class Person implements Comparable<Person> {
	
	private int age;
	private String name;
	
	
	
	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Person o) {
		if (this.age == o.getAge())
			return 0;
		if (this.age < o.getAge())
			return -1;

		return 1;
	}


	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
	
	

}
