package com.hibernate.source;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Update {
	
	public void updatename(int id1) {
		    
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			EntityTransaction transaction=entityManager.getTransaction();
			transaction.begin();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter name");
			String name=sc.next();
			String update="update Student set name=:name where rollno=:id1";
			Query query=entityManager.createQuery(update);
			query.setParameter("name",name);
			query.setParameter("id1",id1);
			int result=query.executeUpdate();
			transaction.commit();
	}
	public void updatephno(int id1) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter phonenumber");
		long phno=sc.nextLong();
		String update="update Student set phno=:phno where rollno=:id1";
		Query query=entityManager.createQuery(update);
		query.setParameter("phno",phno);
		query.setParameter("id1", id1);
		
		int result=query.executeUpdate();
		transaction.commit();
}
public void updatestan(int id1) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter standard");
		int stan=sc.nextInt();
		String update="update Student set standard=:stan where rollno=:id1";
		Query query=entityManager.createQuery(update);
		query.setParameter("stan", stan);
		query.setParameter("id1",id1);
		int result=query.executeUpdate();
		transaction.commit();
}
	
			
}