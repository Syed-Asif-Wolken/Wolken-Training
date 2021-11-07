package com.wolken.Planets;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.Planets.DI.PlanetNames;

public class App 
{
	public static void main( String[] args )
    {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PlanetNames s=(PlanetNames)context.getBean("satelliteConsWire");   
        s.print();
        s=(PlanetNames)context.getBean("satelliteNameWire");   
        s.print();
        s=(PlanetNames)context.getBean("satelliteProperty");   
        s.print();
    }
}
