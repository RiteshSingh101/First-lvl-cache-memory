package com.mca.curd;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.mca.entity.Nation;
import com.mca.entity.Parties;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rit");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Nation n1 = new Nation();
		n1.setNid(2);
		n1.setName("USA");
		
		Parties p1 = new Parties();
		p1.setPid(201);
		p1.setPname("Democratic Party");
		p1.setNation(n1);
		
		Parties p2 = new Parties();
		p2.setPid(202);
		p2.setPname("Republican Party");
		p2.setNation(n1);
		
		Parties p3 = new Parties();
		p3.setPid(203);
		p3.setPname("Libertarian Party");
		p3.setNation(n1);
		
		et.begin();
		em.persist(n1);
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		et.commit();
		System.out.println("Saved....");
	}
}
