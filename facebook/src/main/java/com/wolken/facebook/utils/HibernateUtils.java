package com.wolken.facebook.utils;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils 
{
	private static SessionFactory factory;
	
	private HibernateUtils() {
		
	}

	public static SessionFactory getInstance() {
		if(factory == null) {
			Configuration config = new Configuration();
			config.configure();
			factory = config.buildSessionFactory();
		}
		return factory;
	}
	
	public static void closeInstance() {
		factory.close();
	}
}
