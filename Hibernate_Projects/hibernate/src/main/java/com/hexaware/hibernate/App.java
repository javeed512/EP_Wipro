package com.hexaware.hibernate;

import java.io.Serializable;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		System.out.println(sessionFactory);

		Session session = sessionFactory.openSession();

		Transaction tr = session.beginTransaction();

		// INSERT
		 Employee emp = new Employee(501, "Javeed", 30000); // new entity for insert

		 Serializable ser = session.save(emp);

	 System.out.println(ser.toString() + " record inserted");

		// UPDATE

		// Employee emp = new Employee(501, "Javeed Khan", 55000);

		/*
		 * Employee emp = new Employee(104, "Pankaj", 35000); session.saveOrUpdate(emp);
		 */

		//System.out.println("Record Updated");

		// Select By eid = 101
		//Employee empRecord = session.get(Employee.class, 101);

		//System.out.println(empRecord);

		// delete by entity obj
		// session.delete(empRecord);

		// getall or select all record

		// createQuery() using positional param

		/*
		 * Query<Employee> query =
		 * session.createQuery("select e from Employee e  where e.eid = ?1");
		 * 
		 * query.setParameter(1, 102);
		 * 
		 * System.out.println(query.getSingleResult());
		 * 
		 * Query<Employee> query2 = session.createQuery("select  e from Employee e");
		 * 
		 * List<Employee> list = query2.getResultList();
		 * 
		 * System.out.println("Select All using createQuery() ");
		 * 
		 * for (Employee employee : list) {
		 * 
		 * System.out.println(employee);
		 * 
		 * }
		 * 
		 * // createNamedQuery() using jpa or hibernate
		 * 
		 * javax.persistence.Query query3 = session.createNamedQuery("getEmpRecord");
		 * 
		 * List<Employee> list2 = query3.getResultList();
		 * 
		 * System.out.println("Select All using createNameQuery() ");
		 * 
		 * for (Employee employee : list2) {
		 * 
		 * System.out.println(employee); }
		 * 
		 * // Hibernate Named Query using getNamedQuery()
		 * 
		 * TypedQuery<Employee> query4 = session.getNamedQuery("selectByName");
		 * query4.setParameter("name", "Ashwin");
		 * 
		 * Employee e1 = query4.getSingleResult();
		 * 
		 * System.out.println(e1);
		 * 
		 * 
		 * // INSERT record with PK auto generated option
		 * 
		 * Employee e2 = new Employee(); e2.setEname("Rishab"); e2.setSalary(75000);
		 * 
		 * Serializable ser = session.save(e2);
		 * 
		 * System.out.println("Record inserted for eid "+ser.toString());
		 * 
		 */
		tr.commit();

		sessionFactory.close();

	}
}
