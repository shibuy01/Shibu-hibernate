package com.Shibu.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Shibu.entity.config.EmpConfiguration;
import com.Shibu.entity.Address;
import com.Shibu.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Shibu");
		emp1.setGender("Male");
		emp1.setSalary(50000);
		
		
		Address addresh1 = new Address();
		addresh1.setCity("Siwan");
		addresh1.setState("Bihar");
		Address addresh2 = new Address();
		addresh2.setCity("Noida");
		addresh2.setState("UP");
		Address addresh3 = new Address();
		addresh3.setCity("Meerut");
		addresh3.setState("UP");
		
		ArrayList<Address> listOfAddresh = new ArrayList<>();
		listOfAddresh.add(addresh1);
		listOfAddresh.add(addresh2);
		listOfAddresh.add(addresh3);
		
		emp1.setAddresses(listOfAddresh);
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp1);
		tx.commit();
		
//		Address address = session.find(Address.class, 1);
//		System.out.println(address);
//		System.out.println(address.getEmployee());
		
		session.close();
	}

}