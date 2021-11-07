package com.wolken.satellite;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.wolken.satellite.DI.SatelliteNames;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");   
        SatelliteNames s=(SatelliteNames)context.getBean("satelliteConsWire");   
        s.print();
        SatelliteNames t=(SatelliteNames)context.getBean("satelliteNameWire");   
        t.print();
        SatelliteNames u=(SatelliteNames)context.getBean("satelliteProperty");   
        u.print();
        
    }
}
