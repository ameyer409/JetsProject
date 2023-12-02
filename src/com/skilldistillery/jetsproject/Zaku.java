package com.skilldistillery.jetsproject;

public class Zaku extends GundamBlueprint implements ZakuBazooka{

	public Zaku(String model, double speedMPH, int rangeMPG, long price) {
		super(model, speedMPH, rangeMPG, price);
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSpeedInMach() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
