package com.wolken.markets.dao;

import javax.persistence.RollbackException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.wolken.hibernate.utils.HibernateUtils;
import com.wolken.markets.entity.MarketDetails;

public class MarketDetailsDAOImpl implements MarketDetailsDAO {

	@Override
	public String save(MarketDetails details) {
		Session session = null;
		SessionFactory factory;
		try {
			factory = HibernateUtils.getInstance();
	    	session = factory.openSession();
	    	Transaction tx = session.beginTransaction();
	    	session.save(details);
	    	tx.commit();
		}
		catch(RollbackException e) {
			return "Save Failed";
		}
		finally {
			if(session==null) {
				session.close();
				HibernateUtils.closeInstance();
			}
		}
		
		return "Saved Successfully";
	}

	@Override
	public void getById(int id) {
		SessionFactory factory;
		Session session = null;
		try {
			factory = HibernateUtils.getInstance();
	    	session = factory.openSession();
	    	MarketDetails details = (MarketDetails)session.get(MarketDetails.class, id);
	    	System.out.println(details);
		}
		finally {
			if(session==null) {
				session.close();
				HibernateUtils.closeInstance();
			}
		}
		
	}
	
	@Override
	public String update(MarketDetails details) {
		Session session = null;
		SessionFactory factory;
		try {
			factory = HibernateUtils.getInstance();
	    	session = factory.openSession();
	    	Transaction tx = session.beginTransaction();
	    	session.saveOrUpdate(details);
	    	tx.commit();
		}
		catch(RollbackException e) {
			return "Update Failed";
		}
		finally {
			if(session==null) {
				session.close();
				HibernateUtils.closeInstance();
			}
		}
		
		return "Updated Successfully";
	}

	@Override
	public String delete(int id) {
		Session session = null;
		SessionFactory factory;
		try {
			factory = HibernateUtils.getInstance();
	    	session = factory.openSession();
	    	Transaction tx = session.beginTransaction();
	    	MarketDetails details = (MarketDetails)session.get(MarketDetails.class, id);
	    	session.delete(details);
	    	tx.commit();
		}
		catch(RollbackException e) {
			return "Delete Failed";
		}
		finally {
			if(session==null) {
				session.close();
				HibernateUtils.closeInstance();
			}
		}
		
		return "Deleted Successfully";
	}
}
