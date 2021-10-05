package com.hibernate.source;
import com.hibernate.bean.Student;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Insert {
	public void add() {
		Scanner sc=new Scanner(System.in);
	Student student=new Student();
	System.out.println("Enter rollno");
	int roll=sc.nextInt();
	System.out.println("enter name");
	String name=sc.next();
	System.out.println("Enter phno");
	long phno=sc.nextLong();
	System.out.println("enter standard");
	int stan=sc.nextInt();
	
	
	EntityManagerFactory Factory=null;
	EntityManager manager=null;
	EntityTransaction transaction=null;
	
		try {
			Factory=Persistence.createEntityManagerFactory("emp");
			manager=Factory.createEntityManager();
			transaction=manager.getTransaction();
			transaction.begin();
			student.setRollno(roll);
			student.setName(name);
			student.setPhno(phno);
			student.setStandard(stan);
			
			
			manager.persist(student);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			if(transaction!=null)
				transaction.rollback();
		}
		finally {
			if(Factory!=null){
				Factory.close();
			}
			if(manager!=null){
				Factory.close();
			}
		}
		System.out.println("data inserted successfully");

}

}
