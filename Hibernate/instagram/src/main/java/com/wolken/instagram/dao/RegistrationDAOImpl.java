package com.wolken.instagram.dao;

import javax.persistence.RollbackException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.wolken.instagram.entity.UserEntity;
import com.wolken.instagram.utils.HibernateUtils;

public class RegistrationDAOImpl implements RegistrationDAO{

	public String save(UserEntity entity) {
		Session session = null;
		SessionFactory factory;
		try {
			factory = HibernateUtils.getInstance();
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
