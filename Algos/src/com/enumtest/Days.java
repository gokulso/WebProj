package com.enumtest;

public enum Days {
	
	 SUNDAY("SUN"), MONDAY("MON"), TUESDAY("TUES"), WEDNESDAY("WED"),
	   THURSDAY("THURS"), FRIDAY("FRI"), SATURDAY("SAT");
	
	private String days;
	
	 Days(String days ){
		 
		this.days = days;
		
		System.out.println("Constructor called for : " +  this.toString());
	}
	 
	 public String getAbbreviationOfDay(){
		 
		 System.out.println("Printing Value " + this.days);
		 return this.days;
	 }

}



