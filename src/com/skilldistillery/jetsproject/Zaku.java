package com.skilldistillery.jetsproject;

public class Zaku extends GundamBlueprint implements ZakuBazooka{

	public Zaku(String model, double speedMPH, int rangeMPG, long price) {
		super(model, speedMPH, rangeMPG, price);
	}

	@Override
	public void fly() {
		System.out.println(toString() + "\ntime before fuel runs out: " + (getRange()/getSpeedMPH()));
	}

	@Override
	public double getSpeedInMach() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void shoot() {
		
	}
	
	@Override
	public String toString() {
		return "Gundam Model: " + getModel() + "\nSpeed in MPH: " + getSpeedMPH() + "\nRange in miles: "
				+ getRange() + "\nPrice: " + getPrice();
	}
}
