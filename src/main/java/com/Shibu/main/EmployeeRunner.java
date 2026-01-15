package com.Shibu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.Shibu.entity.Employee;
import com.Shibu.entity.config.EmpConfiguration;

public class EmployeeRunner {

	public static void main(String[] args)   {
		
		
		Employee emp = new Employee("Rahul", "Male", 240000,"India");
		
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);;
		tx.commit();
	}

}