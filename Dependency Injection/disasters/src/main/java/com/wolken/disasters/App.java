package com.wolken.disasters;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.disasters.DI.DisasterName;

public class App 
{
	public static void main( String[] args )
    {
    	Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        DisasterName s=(DisasterName)factory.getBean("satellite");   
        s.print();
    }
}
