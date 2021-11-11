package com.wolken.clothes.DI;

import org.apache.log4j.Logger;

public class ClothingCompany {
	Logger log = Logger.getLogger(this.getClass().getSimpleName());
	private String name;
	Material sp;
	public ClothingCompany(String name, Material sp) {
		System.out.println("ClothingCompany Constructor Called");
		this.name = name;
		this.sp=sp;
	}
	
	public void print() {
		log.info( "ClothingCompany [name=" + name + "]"+"\n"+sp);
	}
	
}
