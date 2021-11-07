package com.wolken.disasters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wolken.disasters.DI.DisasterName;

public class App 
{
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DisasterName s=(DisasterName)context.getBean("satelliteConsWire");   
        s.print();
        s=(DisasterName)context.getBean("satelliteNameWire");   
        s.print();
        s=(DisasterName)context.getBean("satelliteProperty");   
        s.print(); 
    }
}
