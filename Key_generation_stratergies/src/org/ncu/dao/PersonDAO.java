package org.ncu.dao;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.ncu.embedable.PersonAddress;
import org.ncu.entity.Person;


public class PersonDAO {
	
	SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	
	/* saving object state into the database */
	public void create() {
		Person person = new Person("Peter", 9696, new Date(), 42);
		PersonAddress p = new PersonAddress("UK", "London", "New Hampshire", 3242464, "Office/Work");
		
		person.setPerson_add(p);
		
		// step 1: create a new session or open an existing session
		Session session = sessionFactory.openSession();
	
		// step 2: create a transaction boundary
		session.beginTransaction();
		
		// step 3: perform save/insert operation
		session.save(person);
		
		// step 4: commit the transaction
		session.getTransaction().commit();
		
		// step 5: close the session
		session.close();
		System.out.println("Data saved succcessfully!!");
	}
	
}