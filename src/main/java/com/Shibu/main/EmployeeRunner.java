package com.Shibu.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Shibu.entity.config.EmpConfiguration;
import com.Shibu.entity.Address;
import com.Shibu.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("vinay");
		emp1.setGender("M");
		emp1.setSalary(40000);
		
		
		Address addresh1 = new Address();
		addresh1.setCity("Siwan");
		addresh1.setState("Bihar");
		addresh1.setEmployee(emp1);
		
		emp1.setAddress(addresh1);

		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(addresh1);
		session.persist(emp1);
		tx.commit();
		
		
		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		Address address = session.find(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getEmployee());
		
		session.close();
	}

}