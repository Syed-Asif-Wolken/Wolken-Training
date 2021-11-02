package com.wolken.Planets.DI;

public class Atmosphere {
	private boolean hasAtmosphere;
	
	public Atmosphere(boolean hasAtmosphere) {
		System.out.println("Atmosphere Constructor Called");
		this.hasAtmosphere = hasAtmosphere;
	}
	
	@Override
	public String toString() {
		return "Atmosphere [hasAtmosphere=" + hasAtmosphere + "]";
	}
}
