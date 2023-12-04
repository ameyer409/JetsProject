package com.skilldistillery.jetsproject;

import java.util.concurrent.TimeUnit;

public class MSZ006 extends GundamBlueprint implements BeamSaber{

	public MSZ006(String model, double speedMPH, int rangeMPG, long price) {
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

	public void slash() throws InterruptedException {
		System.out.println(getModel() + " Engages thrusters!");
		TimeUnit.MILLISECONDS.sleep(750);
		System.out.println("ZUUUUU");
		TimeUnit.MILLISECONDS.sleep(250);
		System.out.println("ZUUUUU");
		TimeUnit.MILLISECONDS.sleep(250);
		System.out.println("ZUUUUU");
		TimeUnit.MILLISECONDS.sleep(250);
		System.out.println("ZUUUUU");
		TimeUnit.MILLISECONDS.sleep(250);
		System.out.println(getModel() + " attacks!");
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("*Schink!*");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("KABOOM!");
		TimeUnit.MILLISECONDS.sleep(1000);
		System.out.println("Enemy Destroyed!");
		TimeUnit.MILLISECONDS.sleep(2000);
		System.out.println();
	}
	
	@Override
	public String toString() {
		return "Gundam Model: " + getModel() + "\nSpeed in MPH: " + getSpeedMPH() + "\nRange in miles: "
				+ getRange() + "\nPrice: " + getPrice();
	}
}
