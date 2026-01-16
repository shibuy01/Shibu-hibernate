package com.Shibu.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.Shibu.entity.Employee;
import com.Shibu.entity.config.EmpConfiguration;

public class EmployeeRunner {

	public static void main(String[] args)   {
		
		
		Employee emp = new Employee("Ankita", "FeMale", 240000,"India");
		Employee emp2 = new Employee("Anita", "FeMale", 12098,"India");
		Employee emp3 = new Employee("Akash", "Male", 12098,"India");
		Employee emp4 = new Employee("Ankit", "Male", 240000,"India");
		Employee emp5 = new Employee("Anjali", "Male", 23456,"India");
		
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
//		session.persist(emp);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
//		session.persist(emp5);
		
// 		Examples of HQL to get the all the records
//		Query query = session.createQuery("from Employee");
//		List list = query.list();
//		System.out.println(list);
		
////		HQL to get records with pagination
//		Query query = session.createQuery("from Employee");
//		query.setFirstResult(2);
//		query.setMaxResults(8);
//		List list = query.list();
//		System.out.println(list);
		
////		HQL update Query
//		MutationQuery mutationQuery = session.createMutationQuery("update Employee set name=:n where id=:i"); 
//		mutationQuery.setParameter("n","Pankaj"); 
//		mutationQuery.setParameter("i",4); 
//		System.out.println("status: "+mutationQuery.executeUpdate()); 
		

//		HQL Delete Query
		MutationQuery q=session.createMutationQuery("delete from Employee where id = 12");
		q.executeUpdate();
		
		
		tx.commit();
	}

}