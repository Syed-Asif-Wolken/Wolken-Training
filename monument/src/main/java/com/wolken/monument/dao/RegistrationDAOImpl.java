package com.wolken.monument.dao;

import javax.persistence.RollbackException;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wolken.monument.entity.UserEntity;

@Component
public class RegistrationDAOImpl implements RegistrationDAO{
	
	Logger log = Logger.getLogger(this.getClass());
	@Autowired
	SessionFactory factory;

	public String save(UserEntity entity) {
		
		Session session = null;
		try {
	    	session = factory.openSession();
	    	Transaction tx = session.beginTransaction();
	    	log.info(entity);
	    	session.save(entity);
	    	tx.commit();
		}
		catch(RollbackException e) {
			log.error(e.getMessage());
		}
		finally {
			if(session!=null)
				session.close();
		}
		
		return "Saved Successfully";
	}

//	public String updatePassword(UserEntity entity) {
//		Session session = null;
//		SessionFactory factory;
//		try {
//			factory = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
//	    	session = factory.openSession();
//	    	Transaction tx = session.beginTransaction();
//	    	session.saveOrUpdate(entity);
//	    	tx.commit();
//		}
//		catch(RollbackException e) {
//			return "Save Failed";
//		}
//		finally {
//			if(session!=null)
//				session.close();
//		}
//		
//		return "Updated Successfully";
//	}
//	
//	public UserEntity getByEmailId(String email) {
//		Session session = null;
//		SessionFactory factory;
//		UserEntity entity= null;
//		try{
//			factory = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
//	    	session = factory.openSession();
//	    	Query query = session.getNamedQuery("getByEmail");
//	    	query.setParameter("email", email);
//	    	entity = (UserEntity) query.uniqueResult();
//		}
//		finally {
//			if(session!=null)
//				session.close();
//		}
//		return entity;
//	}
//
//	public String delete(UserEntity entity) {
//		Session session = null;
//        SessionFactory factory;
//
//        try {
//            factory = (SessionFactory) new ClassPathXmlApplicationContext("applicationContext.xml").getBean("factory");
//            session = factory.openSession();
//            Transaction tx= session.beginTransaction();
//            session.delete(entity);
//            tx.commit();
//        } finally {
//            if (session != null) {
//                session.close();
//            }
//        }
//        return "Data Successfully deleted";
//    }
}
