package com.skilldistillery.jetsproject;

import java.util.Scanner;

public class GundamApp {

	private GundamHangar hangar;
	Scanner kb = new Scanner(System.in);
	private int choice;
	
	public static void main(String[] args) {
		GundamApp app = new GundamApp();
		app.run();
	}
	
	public void run() {
		hangar = new GundamHangar();
		Gundam a = new Gundam("White", 100, 10000, 20000);
		Gundam b = new Gundam("Gray", 100, 10000, 20000);
		Zaku c = new Zaku("Zaku I", 100, 10000, 20000);
		Zaku d = new Zaku("Zaku II", 100, 10000, 20000);
		MSZ006 Zeta = new MSZ006("MSZ-006", 100, 10000, 20000);
		hangar.getGundams().add(a);
		hangar.getGundams().add(b);
		hangar.getGundams().add(c);
		hangar.getGundams().add(d);
		hangar.getGundams().add(Zeta);
		
		
		boolean isQuit = false;
		while (! isQuit) {
			printMenu(kb);
			switch (choice) {
			case 1:
				for(GundamBlueprint g : hangar.getGundams()) {
					System.out.println(g);
					System.out.println();
				}
			isQuit = true;
			}
		}
	}
	
	public void printMenu(Scanner kb) {
		System.out.println();
		System.out.println("1. List out all Gundams");
		System.out.println("2. Release all Gundams");
		System.out.println("3. View Fastest Gundam");
		System.out.println("4. View Gundam with Longest Range");
		System.out.println("5. create method for this");
		System.out.println("6. create method for this");
		System.out.println("7. Load Gundam into hangar");
		System.out.println("8. Remove Gundam from hangar");
		System.out.println("9. Quit Program");
		System.out.print("Make a selection: ");
		choice = kb.nextInt();
	}

}
