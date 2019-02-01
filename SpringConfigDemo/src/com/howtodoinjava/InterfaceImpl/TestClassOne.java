package com.howtodoinjava.InterfaceImpl;

import org.springframework.stereotype.Component;

import com.howtodoinjava.beans.TestInterface;

@Component
public class TestClassOne implements TestInterface {

	@Override
	public void show() {
		System.out.println("Class TestClassOne");
		
	}

}
