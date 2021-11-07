package com.wolken.unis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wolken.unis.DI.University;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        University s=(University)context.getBean("satelliteConsWire");   
        s.print();
        s=(University)context.getBean("satelliteNameWire");   
        s.print();
        s=(University)context.getBean("satelliteProperty");   
        s.print();
    }
}