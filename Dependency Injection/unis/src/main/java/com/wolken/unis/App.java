package com.wolken.unis;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.unis.DI.University;

public class App 
{
    public static void main( String[] args )
    {
    	Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        University s=(University)factory.getBean("satellite");   
        s.print();
    }
}