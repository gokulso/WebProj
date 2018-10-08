
package test.generics;

import java.util.ArrayList;
import java.util.List;

public class TestWildCards {

	public static void main(String[] args) throws InterruptedException {
		List<Animal> animals = new ArrayList<>();
		animals.add(new Dog());
		animals.add(new Dog());
		animals.add(new Cat());
		//animals.add(new Animal());
		
		
		Bar bar = new Bar();
		bar.doInsert(animals);
		
	
		
		for(Animal a : animals){
			System.out.println(a);
		}

	}
	


}
