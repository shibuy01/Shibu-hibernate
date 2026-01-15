package com.Shibu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name,gender;
	private int salary;
	
	//does'not save in database
	@Transient
	private String Country;
	
	public Employee() {
		super();
	}


	public Employee(String name, String gender, int salary,String Country) {
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		this.Country = Country;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getCountry() {
		return Country;
	}
	
	public void SetCountry(String Country) {
		this.Country = Country;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", salary=" + salary + ", country="+Country+"]";
	}

}