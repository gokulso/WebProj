package casting.test;

public class CastingTest {

	public static void main(String[] args) {
		
	/*	Animal animal = new Dog();
		Dog d = (Dog) animal;
		d.playDead();    */               //downcast
		
	
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (Animal animal : a) {
			animal.makeNoise();
			if (animal instanceof Dog) {
				Dog d = (Dog) animal;         //downcast
				d.playDead();
			}
		}
	
	System.out.println("----------------------------------------------");

	Dog d = new Dog();
	Animal a1 = d;                 // upcast ok with no explicit cast
	Animal a2 = (Animal) d;       // upcast ok with an explicit cast
	a1.makeNoise();
	a2.makeNoise();
	
	
	Object aSentenceObject = "This is just a regular sentence";
	String aSentenceString = (String)aSentenceObject;
	
	
	}

}
