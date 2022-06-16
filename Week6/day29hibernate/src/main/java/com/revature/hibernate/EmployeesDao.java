package com.revature.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.hibernate.model.Employee;
import com.revature.hibernate.util.HibernateUtil;

public class EmployeesDao {

	public List<Employee> getEmployeeList() {

		Session session = null;
		List<Employee> empList = null;
		try {
			session = HibernateUtil.getSession();
			String queryStr = "select emp from Employee emp";
			Query query = session.createQuery(queryStr);
			empList = query.list();
		} catch (Exception ex) {
			ex.printStackTrace();
			// handle exception here
		} finally {
			try {
				if (session != null)
					session.close();
			} catch (Exception ex) {
			}
		}
		return empList;
	}

	public Employee getEmployeeById(Long empId) {

		Session session = null;
		Employee emp = null;
		try {
			session = HibernateUtil.getSession();
			String queryStr = "select emp from Employee emp";
			emp = session.get(Employee.class, empId);

		} catch (Exception ex) {
			ex.printStackTrace();
			// handle exception here
		} finally {
			try {
				if (session != null)
					session.close();
			} catch (Exception ex) {
			}
		}
		return emp;
	}

	public void insertEmployee(Employee emp) {

		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			session.save(emp);
			System.out.println("inserted employee: " + emp.getName());
			transaction.commit();
		} catch (Exception ex) {
			ex.printStackTrace();
			// handle exception here
			if (transaction != null)
				transaction.rollback();
		} finally {
			try {
				if (session != null)
					session.close();
			} catch (Exception ex) {
			}
		}
	}

	public void deleteEmployee(Employee emp) {

		Session session = null;
		Transaction transaction = null;
		try {
			session = HibernateUtil.getSession();
			transaction = session.beginTransaction();
			session.delete(emp);
			transaction.commit();
			System.out.println("deleted employee: " + emp.getName());
		} catch (Exception ex) {
			ex.printStackTrace();
			// handle exception here
			if (transaction != null)
				transaction.rollback();
		} finally {
			try {
				if (session != null)
					session.close();
			} catch (Exception ex) {
			}
		}
	}

	public static void main(String a[]) {

		EmployeesDao empDao = new EmployeesDao();

		Employee emp = new Employee();
		emp.setName("Babu");
		emp.setDepartment("Security");
		emp.setJoinedOn(new Date());
		emp.setSalary(new Long(5250));
		empDao.insertEmployee(emp);

		System.out.println("---------------------------");

		List<Employee> empList = empDao.getEmployeeList();
		System.out.println("emp size: " + empList.size());
		empList.stream().forEach(System.out::println);

		System.out.println("---------------------------");

		Employee empObj = empDao.getEmployeeById(emp.getEmpId());
		System.out.println(empObj);

		System.out.println("---------------------------");
		empDao.deleteEmployee(empObj);

		System.out.println("---------------------------");

		empList = empDao.getEmployeeList();
		System.out.println("emp size: " + empList.size());
		empList.stream().forEach(System.out::println);

		System.out.println("---------------------------");
	}
}