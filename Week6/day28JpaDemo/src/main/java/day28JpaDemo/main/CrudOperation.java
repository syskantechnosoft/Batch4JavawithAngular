package day28JpaDemo.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class CrudOperation {

	// TODO Auto-generated method stub
	public void insertEntity() {
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		User1 user = new User1("Ramesh", "rameshfadatare@javaguides.com", "Fadatare", "india");
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void findEntity() {
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
		User1 user = entityManager.find(User1.class, 1);
		System.out.println("student id :: " + user.getId());
		System.out.println("student firstname :: " + user.getName());

		System.out.println("student email :: " + user.getEmail());
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void updateEntity() {
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		User1 user = entityManager.find(User1.class, 1);
		System.out.println("User id :: " + user.getId());
		System.out.println("user firstname :: " + user.getName());
//		System.out.println("user lastname :: " + user.getLastName());
		System.out.println("user email :: " + user.getEmail());

		// The entity object is physically updated in the database when the transaction
		// is committed
		user.setName("Ram");
		user.setEmail("emil");
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void removeEntity() {
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();

		User1 user = entityManager.find(User1.class, 1);
		System.out.println("student id :: " + user.getId());
		System.out.println("student firstname :: " + user.getName());
//		System.out.println("student lastname :: " + user.getLastName());
		System.out.println("student email :: " + user.getEmail());
		entityManager.remove(user);
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}
