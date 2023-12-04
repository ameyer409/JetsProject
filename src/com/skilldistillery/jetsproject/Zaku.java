package com.skilldistillery.jetsproject;

import java.util.concurrent.TimeUnit;

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

	public void shoot() throws Exception{
		System.out.println(getModel() + " takes aim");
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("Shoots bazooka");
		TimeUnit.MILLISECONDS.sleep(200);
		System.out.println("BOOM!");
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Gundam Model: " + getModel() + "\nSpeed in MPH: " + getSpeedMPH() + "\nRange in miles: "
				+ getRange() + "\nPrice: " + getPrice();
	}
}
