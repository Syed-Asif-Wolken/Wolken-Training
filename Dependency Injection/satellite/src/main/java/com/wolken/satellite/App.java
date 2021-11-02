package com.wolken.satellite;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.satellite.DI.SatelliteNames;
import com.wolken.satellite.DI.SolarPanels;

public class App 
{
    public static void main( String[] args )
    {
    	Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        SatelliteNames s=(SatelliteNames)factory.getBean("satellite");   
        s.print();
    }
}
