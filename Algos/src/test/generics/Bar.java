package test.generics;

import java.util.List;

public class Bar {
	
	/**
	 *  [PECS] Producer-Extends Consumer-Super
	 * 
	 *  Suppose you have a method that takes as its parameter a collection of things, 
	 *  but you want it to be more flexible than just accepting a Collection<Thing>.
	 *  
	 *  <p>Case 1: You want to go through the collection and do things with each item.
	 *  Then the list is a producer, so you should use a Collection<? extends Thing>.
	 *  The reasoning is that a Collection<? extends Thing> could hold any subtype of Thing, 
	 *  and thus each element will behave as a Thing when you perform your operation. 
	 *  (You actually cannot add anything to a Collection<? extends Thing>, 
	 *  because you cannot know at runtime which specific subtype of Thing the collection holds.)
	 *  
	 *  
	 *  <p>Case 2: You want to add things to the collection.
	 *  Then the list is a consumer, so you should use a Collection<? super Thing>.
	 *  The reasoning here is that unlike Collection<? extends Thing>, 
	 *  Collection<? super Thing> can always hold a Thing no matter what the actual parameterized type is. 
	 *  Here you don't care what is already in the list as long as it will allow a Thing to be added; this is what ? super Thing guarantees
	 * 
	 * 
	 * @param list
	 **/
	
	//public void doInsert(List<? extends Animal> list) {
	public void doInsert(List<? super Animal> list) {

		synchronized (this) {
			list.add(new Dog());
			list.add(new Cat());
			list.add(new Animal());
			//list.add(new Object());
		}

	}

}
