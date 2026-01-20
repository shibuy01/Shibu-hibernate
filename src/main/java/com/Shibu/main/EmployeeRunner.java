package com.Shibu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Shibu.entity.config.EmpConfiguration;
import com.Shibu.entity.Address;
import com.Shibu.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Niraj", "Male", 90000);
		Address addresh1 = new Address("Siwan", "Bihar");
		
		emp1.setAddress(addresh1);

		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();

		
		session.persist(addresh1);
		session.persist(emp1);
		
		tx.commit();
		session.close();
	}

}