package com.wolken.markets;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.wolken.markets.entity.MarketDetails;
public class Tester 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration();
    	config.configure("hibernate.cfg.xml");
    	SessionFactory factory = config.buildSessionFactory();
    	Session session = factory.openSession();
    	MarketDetails details = (MarketDetails)session.get(MarketDetails.class, 1);
    	System.out.println(details);
    	session.close();
    	factory.close();
    }
}
