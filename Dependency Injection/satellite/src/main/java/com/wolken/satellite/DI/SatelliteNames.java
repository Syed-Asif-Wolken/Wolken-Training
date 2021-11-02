package com.wolken.satellite.DI;

public class SatelliteNames {
	private String name;
	SolarPanels sp;
	public SatelliteNames(String name, SolarPanels sp) {
		System.out.println("Satellite Constructor Called");
		this.name = name;
		this.sp=sp;
	}
	
	public void print() {
		System.out.println( "SatelliteNames [name=" + name + "]"+"\n"+sp);
	}
	
}
