package com.cg.project.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import com.cg.project.util.EntityManagerFactoryProvider;

public class MainClass {

	public static void main(String[] args) {
		EntityManagerFactory factory= EntityManagerFactoryProvider.getEntityManagerFactory();

	}

}
