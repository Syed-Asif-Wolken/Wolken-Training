package com.wolken.snapchat.dao;

import javax.persistence.RollbackException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.snapchat.entity.UserEntity;



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
}
