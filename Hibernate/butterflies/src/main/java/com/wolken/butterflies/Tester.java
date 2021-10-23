package com.wolken.butterflies;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.wolken.butterflies.entity.ButterflyDetails;
public class Tester 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure();
    	SessionFactory factory = config.buildSessionFactory();
    	Session session = factory.openSession();
    	ButterflyDetails details = (ButterflyDetails)session.get(ButterflyDetails.class, 1);
    	System.out.println(details);
    	session.close();
    	factory.close();
    }
}