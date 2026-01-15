package com.Shibu.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.Shibu.entity.Employee;

public class EmployeeRunner {

	public static void main(String[] args)   {
		
		
		Employee emp = new Employee("Raugh", "male", 150000);
		
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg1.xml").buildSessionFactory();
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg1.xml").build();
//		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metadata.buildSessionFactory();
		
		
		SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder()
				.configure("hibernate.cfg.xml").build()).getMetadataBuilder().build()
				.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(emp);;
		tx.commit();
	}

}