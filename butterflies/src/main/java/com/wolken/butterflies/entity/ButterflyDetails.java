package com.wolken.butterflies.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "butterfly_details")
public class ButterflyDetails {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "family")
	private String family;
	@Column(name = "subfamily")
	private String subFamily;
	@Column(name = "wingspan")
	private int wingSpan;
	@Column(name = "wingcolor")
	private String wingColor;
	@Column(name = "age")
	private int age;
	@Column(name = "region")
	private String region;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	public String getSubFamily() {
		return subFamily;
	}
	public void setSubFamily(String subFamily) {
		this.subFamily = subFamily;
	}
	public int getWingSpan() {
		return wingSpan;
	}
	public void setWingSpan(int wingSpan) {
		this.wingSpan = wingSpan;
	}
	public String getWingColor() {
		return wingColor;
	}
	public void setWingColor(String wingColor) {
		this.wingColor = wingColor;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	@Override
	public String toString() {
		return "id = " + id + ", family = " + family + ", subFamily = " + subFamily + ", wingSpan = "
				+ wingSpan + "cm, wingColor = " + wingColor + ", age = " + age + "months, region = " + region;
	}
}
