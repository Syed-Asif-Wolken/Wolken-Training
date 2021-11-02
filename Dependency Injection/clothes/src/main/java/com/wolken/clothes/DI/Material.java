package com.wolken.clothes.DI;

public class Material {
	private String material;
	
	public Material(String material) {
		System.out.println("Material Constructor Called");
		this.material = material;
	}

	@Override
	public String toString() {
		return "Material [material=" + material + "]";
	}
	
}
