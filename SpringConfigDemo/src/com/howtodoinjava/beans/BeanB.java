package com.howtodoinjava.beans;

import org.springframework.stereotype.Component;

@Component
public class BeanB {
	public BeanB(){
		System.out.println("Creating bean BeanB");
	}

	@Override
	public String toString() {
		return "BeanB [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
