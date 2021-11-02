package com.wolken.unis.DI;

public class Students {
	private int noOfStudents;
	private float price;
	
	public Students(int noOfPanels, float price) {
		System.out.println("Students Constructor Called");
		this.noOfStudents = noOfPanels;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Students [noOfStudents=" + noOfStudents + ", Fees=" + price + "]";
	}
	
}
