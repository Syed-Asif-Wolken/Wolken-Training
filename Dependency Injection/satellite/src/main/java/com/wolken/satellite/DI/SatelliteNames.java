package com.wolken.satellite.DI;

public class SatelliteNames {
	private String name;
	SolarPanels sp;

	public SatelliteNames() {
		
	}
	
	public SatelliteNames(String name, SolarPanels sp) {
		System.out.println("Satellite Constructor Called");
		this.name = name;
		this.sp=sp;
	}
	
	public void print() {
		System.out.println( "SatelliteNames [name=" + name + "]"+"\n"+sp);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SolarPanels getSp() {
		return sp;
	}

	public void setSp(SolarPanels sp) {
		this.sp = sp;
	}
	
}
