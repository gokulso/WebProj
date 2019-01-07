package com.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	
	
	
	
	
	public static void main(String[] args)  {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		Vehicle porshe = new Vehicle("Porshe");
		Vehicle ferrari = new Vehicle("Ferrari");
		
		session.save(porshe);
		session.save(ferrari);
		
		session.getTransaction().commit();
		session.close();
		

		
	
	}
}
