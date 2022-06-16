package com.revature;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.eclipse.persistence.jpa.config.NamedQuery;

import com.revature.entity.User1;

public class UserCrud {
	private static final String PERSISTENCE_UNIT_NAME = "day29EclipseLinkDemo";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();

		// Read Operation 1
		em.getTransaction().begin();

		// TypedQuery<User1> query = em.createNamedQuery("User1.findAll", User1.class);
		Query query = em.createNamedQuery("User1.findAll");
		List<User1> results = query.getResultList();
		for (User1 user1 : results) {
			System.out.println(user1);
		}

		em.getTransaction().commit();

		// Write /add/insert Operation
		User1 u = new User1();
		u.setCountry("USA");
		u.setEmail("test@gmail.com");
		u.setName("test");
		u.setPassword("password");

		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		
		
		//delete operation
		em.getTransaction().begin();
		Query q = em.createQuery("");
		em.remove(args);
		em.getTransaction().commit();

	}

}
