package com.Shibu.main;

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

	    Employee emp2 = new Employee();
	    emp2.setName("Amit");
	    emp2.setGender("Male");
	    emp2.setSalary(60000);

	    Address add1 = new Address();
	    add1.setCity("Siwan");
	    add1.setState("Bihar");

	    Address add2 = new Address();
	    add2.setCity("Noida");
	    add2.setState("UP");

	    Address add3 = new Address();
	    add3.setCity("Meerut");
	    add3.setState("UP");

	    // relationship set
	    emp1.getAddresses().add(add1);
	    emp1.getAddresses().add(add2);

	    emp2.getAddresses().add(add2);
	    emp2.getAddresses().add(add3);

	    Session session = EmpConfiguration.getSessionFactory().openSession();
	    Transaction tx = session.beginTransaction();

	    session.persist(emp1);
	    session.persist(emp2);

	    tx.commit();
	    session.close();
	}


}