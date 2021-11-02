package com.wolken.clothes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.wolken.clothes.DI.ClothingCompany;

public class App 
{
	public static void main( String[] args )
    {
    	Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
        ClothingCompany s=(ClothingCompany)factory.getBean("satellite");   
        s.print();
    }
}
