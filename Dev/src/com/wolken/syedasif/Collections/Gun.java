package com.wolken.syedasif.Collections;

public class Gun {
	private String name;
	private String model;
	private int license;
	private String type;
	private float price;
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void setModel(String model) {
		this.model = model;
	}
	String getModel() {
		return model;
	}
	
	void setType(String type) {
		this.type = type;
	}
	String getType() {
		return type;
	}
	
	void setLicense(int license) {
		this.license = license;
	}
	int getLicense() {
		return license;
	}
	
	void setPrice(float price) {
		this.price = price;
	}
	float getPrice() {
		return price;
	}
}
