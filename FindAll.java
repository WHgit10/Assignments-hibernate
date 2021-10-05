package com.hibernate.source;
import com.hibernate.bean.Student;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAll {
		
		public Student alldetails() {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
			EntityManager entityManager=entityManagerFactory.createEntityManager();
			String FindAll="from Student";
			Query query=entityManager.createQuery(FindAll);
			List<Student> list=query.getResultList();
			System.out.println(list);
			System.out.println("-----------------------------");
			for (Student student : list) {
				System.out.println(student);
			}
			return new Student();
			
			
		}

	}


