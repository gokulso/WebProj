package inhertancetest;

import java.util.ArrayList;
import java.util.List;

import testone.collections.Person;

public class Test implements InterfaceOne {

	public static void main(String[] args) {
   /*
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(new Integer(50));
		
		Inserter insrt = new Inserter();
		
		insrt.insert(list);
	
    for(Integer p : list){
    	System.out.println(p);
    }*/
		
/*		
		InterfaceOne t = new Test();
		
		t.show();*/
		
		
		ClassA obj = new ClassB();
		System.out.println(obj.a);
			
		System.out.println(obj.getA());
		
	
		

	}

/*	@Override
	public void show() {
		// TODO Auto-generated method stub
		InterfaceTwo.super.show();
	}
	*/



}