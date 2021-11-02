package com.wolken.clothes.DI;

public class ClothingCompany {
	private String name;
	Material sp;
	public ClothingCompany(String name, Material sp) {
		System.out.println("ClothingCompany Constructor Called");
		this.name = name;
		this.sp=sp;
	}
	
	public void print() {
		System.out.println( "ClothingCompany [name=" + name + "]"+"\n"+sp);
	}
	
}
