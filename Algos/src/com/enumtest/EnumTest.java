package com.enumtest;

public class EnumTest {

	public static void main(String[] args) {
		Days d1 = Days.MONDAY;
		
		System.out.println(d1);
		d1.getAbbreviationOfDay();
		
		System.out.println(Days.valueOf("FRIDAY"));
		
	}

}
