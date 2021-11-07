package com.wolken.satellite.DI;

public class SolarPanels {
	private String company;
//	private int noOfPanels;
//	private float price;
	
	public SolarPanels(String company) { //, int noOfPanels, float price) {
		System.out.println("SolarPanels Constructor Called");
		this.company = company;
//		this.noOfPanels = noOfPanels;
//		this.price = price;
	}

	@Override
	public String toString() {
		return "SolarPanels [company=" + company + "]";
	}

}
