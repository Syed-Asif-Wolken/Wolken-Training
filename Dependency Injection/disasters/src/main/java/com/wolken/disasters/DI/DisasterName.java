package com.wolken.disasters.DI;

public class DisasterName {
	private String name;
	Level sp;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Level getSp() {
		return sp;
	}

	public void setSp(Level sp) {
		this.sp = sp;
	}
	
	public DisasterName() {
		
	}
	
	public DisasterName(String name, Level sp) {
		System.out.println("ClothingCompany Constructor Called");
		this.name = name;
		this.sp=sp;
	}
	
	public void print() {
		System.out.println( "DisasterName [name=" + name + "]"+"\n"+sp);
	}
	
}