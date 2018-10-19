package com.cg.project.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int customerNo;
	private String firstName,lastName,email;
	
	@OneToMany(mappedBy="customer")
	private List<Car> cars;

	public Customer() {
		super();
	}
	
}
