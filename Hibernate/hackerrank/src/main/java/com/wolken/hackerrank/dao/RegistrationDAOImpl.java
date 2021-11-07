package com.wolken.hackerrank.dao;

import javax.persistence.RollbackException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.hackerrank.entity.LoginEntity;
import com.wolken.hackerrank.entity.UserEntity;

public class RegistrationDAOImpl implements RegistrationDAO{

	public String save(UserEntity entity) {
		Session session = null;
		SessionFactory factory;
		try {
			factory = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
	    	session = factory.openSession();
	    	Transaction tx = session.beginTransaction();
	    	session.save(entity);
	    	tx.commit();
		}
		catch(RollbackException e) {
			return "Save Failed";
		}
		finally {
			if(session!=null)
				session.close();
		}
		
		return "Saved Successfully";
	}
	
	public LoginEntity getByEmail(String email) {
		Session session = null;
		SessionFactory factory;
		LoginEntity entity= null;
		try{
			factory = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
	    	session = factory.openSession();
	    	Query query = session.getNamedQuery("getByEmail");
	    	query.setParameter("email", email);
	    	entity = (LoginEntity) query.uniqueResult();
		}
		finally {
			if(session!=null)
				session.close();
		}
		return entity;
	}
	
	public UserEntity getByEmailId(String email) {
		Session session = null;
		SessionFactory factory;
		UserEntity entity= null;
		try{
			factory = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
	    	session = factory.openSession();
	    	Query query = session.getNamedQuery("getByEmailId");
	    	query.setParameter("email", email);
	    	entity = (UserEntity) query.uniqueResult();
		}
		finally {
			if(session!=null)
				session.close();
		}
		return entity;
	}

	public String updatePassword(UserEntity entity) {
		Session session = null;
		SessionFactory factory;
		try {
			factory = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
	    	session = factory.openSession();
	    	Transaction tx = session.beginTransaction();
	    	session.saveOrUpdate(entity);
	    	tx.commit();
		}
		catch(RollbackException e) {
			return "Save Failed";
		}
		finally {
			if(session!=null)
				session.close();
		}
		
		return "Update Successful";
	}

	public String delete(UserEntity entity) {
		Session session = null;
		SessionFactory factory;
		try {
			factory = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
	    	session = factory.openSession();
	    	Transaction tx = session.beginTransaction();
	    	session.delete(entity);
	    	tx.commit();
		}
		catch(RollbackException e) {
			return "Delete Failed";
		}
		finally {
			if(session!=null)
				session.close();
		}
		return "Deleted Successfully";
	}
}
