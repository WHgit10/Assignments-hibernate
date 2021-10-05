package com.hibernate.source;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Delete {
	public void delete(int id1) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("emp");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction transaction=entityManager.getTransaction();
	transaction.begin();
	
	String delete="delete From Student where rollno=:id ";
	Query query=entityManager.createQuery(delete);
	query.setParameter("id",id1);
	int result=query.executeUpdate();
	transaction.commit();
}
}