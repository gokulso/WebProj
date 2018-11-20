package test.maps;

public class PersonTest {

	public static void main(String[] args) {

       Person p1 = new Person("Sam", 31);
       Person p2 = new Person("Sam", 31);
       
       System.out.println(p1 == p2);
       
       System.out.println(p1.equals(p2));
       
       System.out.println(p1.hashCode());
       System.out.println(p2.hashCode());


	}

}
