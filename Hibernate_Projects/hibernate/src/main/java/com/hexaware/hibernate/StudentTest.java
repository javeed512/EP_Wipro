package com.hexaware.hibernate;


import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Student;


public class StudentTest {

	public static void main(String[] args) {


		SessionFactory sessionFactory =		HibernateUtil.getSessionFactory();
		
		Session session =			sessionFactory.openSession();
		
			Transaction tr =	session.beginTransaction();
			
			
			// insert new record using save();
			/*
			 * Student student = new Student(101, "Raju", 5000);
			 * 
			 * Serializable ser = session.save(student);
			 * 
			 * System.out.println(ser.toString() +"Record effected...");
			 */
			
			
			// insert or update record using saveOrUpdate();
			/*
			 * Student student = new Student(102, "Rajander kumar", 12000);
			 * 
			 * session.saveOrUpdate(student);
			 */
			// select by sid 
			
			/*
			 * Student student = session.get(Student.class, 101);
			 * 
			 * System.out.println(student);
			 */
				
				// delete by student obj
				
			//	session.delete(student);
			
			
			// get single record using HQL query and positional params
			/*
			 * Query<Student> query = session.
			 * createQuery("select s from Student s  where s.sid = ?1  and s.sname = ?2");
			 * 
			 * query.setParameter(1, 101); query.setParameter(2, "king");
			 * 
			 * System.out.println(query.getSingleResult());
			 */
			
			// get all students using JPQL or HQL query
			/*
			 * Query<Student> query = session.createQuery("Select s from Student s");
			 * 
			 * List<Student> list = query.getResultList();
			 * 
			 * for (Student student : list) {
			 * 
			 * System.out.println(student);
			 * 
			 * }
			 */
			
			
			// using NamedQueries in Student Entity class and createNamedQuery()
		
		
			
		Query<Student> query =	session.createNamedQuery("getAll");
			
			List<Student>  list =		query.getResultList();
		
				for (Student student : list) {
					
					System.out.println(student);
					
				}
			
				// using NamedQueries in Student Entity class and getNamedQuery()		
			TypedQuery<Student>  query2 =	session.getNamedQuery("getStudent");
			
						query2.setParameter("id", 101);
						
				Student  student1 =		query2.getSingleResult();
				
				System.out.println(student1);
			
			tr.commit();
			
			sessionFactory.close();
		

	}

}
