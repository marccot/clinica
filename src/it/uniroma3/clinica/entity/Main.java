package it.uniroma3.clinica.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("clinica-unit");
		EntityManager em = emf.createEntityManager();
		
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		em.persist(product);
//		tx.commit();
		em.close();
		emf.close();
	}
	
}
