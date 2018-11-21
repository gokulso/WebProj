package test.generics;

public class GenericMethodTest {

	public static void main(String[] args) {
		
		genericVersion(" String input");
		
		genericVersion(1000);
		
		genericVersion(100.2256);
		
		genericVersion(new Dog());
	
	}
	
	public static <T extends Object> void genericVersion(T element){
		System.out.println(element.getClass().getName() + element);
	}

}
