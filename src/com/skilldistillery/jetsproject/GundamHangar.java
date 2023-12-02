package com.skilldistillery.jetsproject;

import java.util.ArrayList;

public class GundamHangar {
	private ArrayList<GundamBlueprint> gundams = new ArrayList<GundamBlueprint>();
	
	public GundamHangar() {
		gundams = new ArrayList<GundamBlueprint>();
	}

	public ArrayList<GundamBlueprint> getGundams() {
		return gundams;
	}

	public void setGundams(ArrayList<GundamBlueprint> gundams) {
		this.gundams = gundams;
	}
	
	
}
