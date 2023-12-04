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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeedMPH() {
		return speedMPH;
	}

	public void setSpeedMPH(double speedMPH) {
		this.speedMPH = speedMPH;
	}

	public int getRange() {
		return rangeMPG;
	}

	public void setRangeMPG(int rangeMPG) {
		this.rangeMPG = rangeMPG;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
}
