package com.wolken.unis.DI;

public class University {
	private String name;
	Students sp;
	public University(String name, Students sp) {
		System.out.println("University Constructor Called");
		this.name = name;
		this.sp=sp;
	}
	
	public void print() {
		System.out.println( "University [name=" + name + "]"+"\n"+sp);
	}
	
}
