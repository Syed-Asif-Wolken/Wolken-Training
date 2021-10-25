package com.wolken.hackerrank.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.wolken.hackerrank.entity.LoginEntity;
import com.wolken.hackerrank.utils.HibernateUtils;

public class LoginDAOImpl implements LoginDAO {

	public LoginEntity getByEmail(String email) {
		Session session = null;
		SessionFactory factory;
		LoginEntity entity= null;
		try{
			factory = HibernateUtils.getInstance();
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

}
