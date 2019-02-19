package com.howtodoinjava.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.howtodoinjava.beans.BeanA;

public class BeanDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
		
		BeanA a  = (BeanA) context.getBean("beanA");
		
		//BeanA a = new BeanA();
		
		//System.out.println(a.getBeanB());
		System.out.println(a.getTestInterface());
	}
}
