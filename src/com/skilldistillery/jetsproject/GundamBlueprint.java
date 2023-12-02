package com.skilldistillery.jetsproject;

public abstract class GundamBlueprint {
	private String model;
	private double speedMPH;
	private int rangeMPG;
	private long price;
	
	public GundamBlueprint(String model, double speedMPH, int rangeMPG, long price) {
		super();
		this.model = model;
		this.speedMPH = speedMPH;
		this.rangeMPG = rangeMPG;
		this.price = price;
	}

	public abstract void fly();
	
	public abstract double getSpeedInMach();
}
