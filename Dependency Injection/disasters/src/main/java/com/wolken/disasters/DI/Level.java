package com.wolken.disasters.DI;

public class Level {
	private int material;
	
	public Level(int material) {
		System.out.println("Level Constructor Called");
		this.material = material;
	}

	@Override
	public String toString() {
		return "Level [Level=" + material + "]";
	}
	
}
