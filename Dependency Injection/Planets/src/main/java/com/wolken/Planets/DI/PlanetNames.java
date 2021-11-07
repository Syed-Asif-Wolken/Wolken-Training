package com.wolken.Planets.DI;

public class PlanetNames {
	private String name;
	Atmosphere sp;
	
	public PlanetNames() {
	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Atmosphere getSp() {
		return sp;
	}

	public void setSp(Atmosphere sp) {
		this.sp = sp;
	}

	public PlanetNames(String name, Atmosphere sp) {
		System.out.println("PlanetNames Constructor Called");
		this.name = name;
		this.sp=sp;
	}
	
	public void print() {
		System.out.println( "PlanetNames [name=" + name + "]"+"\n"+sp);
	}
	
}
