package com.wolken.syedasif.Collections;
import java.util.*;
public class AmusePark implements Comparable<AmusePark>{
	private String name;
	private String location;
	private int noOfRides;
	private float price;
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void setLocation(String location) {
		this.location = location;
	}
	String getLocation() {
		return location;
	}
	
	void setNoOfRides(int noOfRides) {
		this.noOfRides = noOfRides;
	}
	int getNoOfRides() {
		return noOfRides;
	}
	
	void setPrice(float price) {
		this.price = price;
	}
	float getPrice() {
		return price;
	}
	
	@Override
	public int compareTo(AmusePark apt) {
		return Integer.compare(this.noOfRides,apt.noOfRides);
	}
}
