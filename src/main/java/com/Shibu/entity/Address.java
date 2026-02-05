package com.Shibu.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String city;
    private String state;

    @ManyToMany(mappedBy = "addresses")
    private List<Employee> employees = new ArrayList<>();
    
    

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int id, String city, String state, List<Employee> employees) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.employees = employees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", employees=" + employees + "]";
	}

 
}
