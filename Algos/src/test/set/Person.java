package test.set;

public class Person implements Comparable<Person> {

	private int personId;
	private String name;
	
	

	public Person(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {

		return this.personId > o.getPersonId() ? 1 : this.personId == o.getPersonId() ? 0 : -1;
		
		//return this.name.compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + "]";
	}

     
	
	
}
