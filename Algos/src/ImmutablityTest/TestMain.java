package ImmutablityTest;

import java.util.Date;

public class TestMain {
	public static void main(String[] args) {
		ImmutableClass im = ImmutableClass.createNewInstance(100, "test", new Date());
		System.out.println(im);
		tryModification(im.getImmutableField1(), im.getImmutableField2(), im.getMutableField());
		System.out.println(im);
		
		ImmutableWithoutFinal  immmute1 = ImmutableWithoutFinal.create("Immute");
		immmute1.getImmutableField().toUpperCase();
		
		System.out.println(immmute1);
	}

	private static void tryModification(Integer immutableField1, String immutableField2, Date mutableField) {
		immutableField1 = 10000;
		immutableField2 = "test changed";
		mutableField.setDate(10);
	}
}