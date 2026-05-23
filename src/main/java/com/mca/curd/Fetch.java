package com.mca.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mca.entity.Nation;


public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("rit");
		EntityManager em = emf.createEntityManager();
		
		Nation n1 = em.find(Nation.class, 1);
		System.out.println(n1);
		
		System.out.println("--------------------------");
		Nation n2 = em.find(Nation.class, 1);
		System.out.println(n2);
		
		System.out.println("--------------------------");
		
		Nation n3 = em.find(Nation.class, 1);
		System.out.println(n3);
		
		System.out.println("----------------------------");
		
		Nation n4 = em.find(Nation.class, 2);
		System.out.println(n4);
		
		System.out.println("-----------------------------");
		
		Nation n5 = em.find(Nation.class, 2);
		System.out.println(n5);
		
		System.out.println("-----EM2-------");
		
		EntityManager em2 = emf.createEntityManager();
		
		Nation n6 = em2.find(Nation.class, 1);
		System.out.println(n6);
		
		System.out.println("----------------------------");
		
		Nation n7 = em2.find(Nation.class, 1);
		System.out.println(n7);
		
		System.out.println("----------------------------");
		
		Nation n8 = em2.find(Nation.class, 1);
		System.out.println(n8);
		
		System.out.println("----------------------------");
		
		Nation n9 = em2.find(Nation.class, 2);
		System.out.println(n9);
	}
}
