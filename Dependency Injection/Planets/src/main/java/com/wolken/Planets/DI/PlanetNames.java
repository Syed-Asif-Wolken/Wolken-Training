package com.wolken.Planets.DI;

public class PlanetNames {
	private String name;
	Atmosphere sp;
	public PlanetNames(String name, Atmosphere sp) {
		System.out.println("PlanetNames Constructor Called");
		this.name = name;
		this.sp=sp;
	}
	
	public void print() {
		System.out.println( "PlanetNames [name=" + name + "]"+"\n"+sp);
	}
	
}
