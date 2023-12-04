package com.skilldistillery.jetsproject;

public class Gundam extends GundamBlueprint {
	
	public Gundam(String model, double speedMPH, int rangeMPG, long price) {
		super(model, speedMPH, rangeMPG, price);
	}
	
	public void fly() {
		System.out.println(toString() + "\ntime before fuel runs out: " + (getRange()/getSpeedMPH()));
	}
	

	public double getSpeedInMach() {
		return 0.0;
	}
	
	@Override
	public String toString() {
		return "Gundam Model: " + getModel() + "\nSpeed in MPH: " + getSpeedMPH() + "\nRange in miles: "
				+ getRange() + "\nPrice: " + getPrice();
	}
}
