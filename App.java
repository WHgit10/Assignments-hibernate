package com.hibernate.assignment;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.hibernate.bean.Student;
import com.hibernate.source.FindAll;
import com.hibernate.source.FindByKey;
import com.hibernate.source.Insert;
import com.hibernate.source.Update;
import com.hibernate.source.Delete;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Student world");
		String s1 = null;
		Student student=new Student();

		do {
			System.out.println("press 0 to add data");
			System.out.println("Press 1 to see all data");
			System.out.println("Press 2 to see a single record");
			System.out.println("press 3 for update");
			System.out.println("press 4 for delete");
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			switch (input) {
			case 0:Insert insert=new Insert();
			       insert.add();
			
			       break;
			case 1:
				FindAll all = new FindAll();
				all.alldetails();

				break;
			case 2:
				System.out.println("enter the id to check the data");
				int idin = s.nextInt();
				FindByKey byKey = new FindByKey();
				byKey.findbyid(idin);

				break;
			case 3:
				System.out.println("Enter id to update data");
				int idup = s.nextInt();
				EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("emp");
				EntityManager entityManager = entityManagerFactory.createEntityManager();
				Student find = entityManager.find(Student.class, idup);
				if (find != null) {
					System.out.println("Enter 1 to update name");
					System.out.println("enter 2 to update phoneno");
					System.out.println("enter 3 to update standard");
					int idsub = s.nextInt();
					switch (idsub) {
					case 1:
						Update update = new Update();
						update.updatename(idup);
						System.out.println("name updated");
						break;
					case 2:
						Update update1 = new Update();
						update1.updatephno(idup);
						System.out.println("phoneno updated");
						break;
					case 3:
						Update update3 = new Update();
						update3.updatestan(idup);
						System.out.println("standard updated");
						break;

					default:System.out.println("not a valid data");
					break;
					}
					break;

				}
			case 4:
				System.out.println("enter id to delete data");
				int delete=s.nextInt();
				EntityManagerFactory entityManagerFactory1 = Persistence.createEntityManagerFactory("emp");
				EntityManager entityManager1 = entityManagerFactory1.createEntityManager();
				Student find1 = entityManager1.find(Student.class, delete);
				if (find1 != null) {
					Delete delete1=new Delete();
					delete1.delete(delete);

				}
			
				
			
			} 
			System.out.println("Do you want to continue...type yes or no...");
	        s1 = s.next();
		
	
	}while (s1.equalsIgnoreCase("yes"));
		
		}
}