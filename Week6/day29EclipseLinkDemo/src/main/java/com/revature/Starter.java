package com.revature;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.revature.entity.Todo;
import com.revature.entity.User1;

public class Starter {
	private static final String PERSISTENCE_UNIT_NAME = "day29EclipseLinkDemo";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		// read the existing entries and write to console
		

		// create new todo
		em.getTransaction().begin();
		Todo todo = new Todo();
		todo.setSummary("This is a test");
		todo.setDescription("This is a test");
		em.persist(todo);
		em.getTransaction().commit();
		
		//Read Operation (JPQL Query)
		Query q = em.createQuery("select t from Todo t");
		List<Todo> todoList = q.getResultList();
		for (Todo todos : todoList) {
			System.out.println(todos);
		}
		System.out.println("Size: " + todoList.size());
		
		
		//Read Operation for User1 Table
		Query q1 = em.createQuery("select u from User1 u");
		List<User1> usersList = q1.getResultList();
		for (User1 user1 : usersList) {
			System.out.println(user1);
		}

		em.close();
	}

}
