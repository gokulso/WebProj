package com.test;



import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mappings.Vehicle;

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
		
		CriteriaBuilder builder = factory.getCriteriaBuilder();
	    CriteriaQuery<Vehicle> query = builder.createQuery(Vehicle.class);
	    Root<Vehicle> vehicleRoot = query.from(Vehicle.class);
	    query.select(vehicleRoot);
		
	    TypedQuery<Vehicle> q = session.createQuery(query);
	    List<Vehicle> allitems = q.getResultList();
	    allitems.forEach(o -> System.out.println(o));
	  
	    
		session.getTransaction().commit();
		session.close();
		factory.close();
		
		

		
	
	}
}
