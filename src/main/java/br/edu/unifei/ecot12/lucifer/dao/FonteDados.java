package br.edu.unifei.ecot12.lucifer.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FonteDados {

private static EntityManagerFactory emf =
Persistence.createEntityManagerFactory("luciferPU");

public static EntityManager createManager() {
	return emf.createEntityManager();
}
	
}

