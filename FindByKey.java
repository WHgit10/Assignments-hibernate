package com.hibernate.source;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.bean.Student;

public class FindByKey extends RuntimeException {
	public Student findbyid(int id) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Student find=entityManager.find(Student.class,id);
	if(find!=null) {
	String FindById="From Student where id= :id";
	Query query=entityManager.createQuery(FindById);
	query.setParameter("id", id );
	Student student=(Student) query.getSingleResult();
	System.out.println(student);
	return new Student();}
	else {
	try {
		Exceptionnew.exception();
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
	return find;

}
}
