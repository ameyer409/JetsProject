package com.skilldistillery.jetsproject;

public class Gundam extends GundamBlueprint {
	
	public Gundam(String model, double speedMPH, int rangeMPG, long price) {
		super(model, speedMPH, rangeMPG, price);
	}

	public void fly() {
		
	}
	
	public double getSpeedInMach() {
		return 0.0;
	}
}
