package com.mappings;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppTest {

	public static void main(String[] args) {
		
	    UserDetails user = new UserDetails("Üser_One");
	    Vehicle porshe = new Vehicle("Porshe");
	    Vehicle jeep = new Vehicle("Jeep");
		
	    user.getVehicleList().add(porshe);
	    user.getVehicleList().add(jeep);
	    
	    porshe.getUserList().add(user);
	    jeep.getUserList().add(user);
	    
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		session.beginTransaction();
		
		session.save(user); 
		session.save(porshe);
		session.save(jeep);
		
		
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
