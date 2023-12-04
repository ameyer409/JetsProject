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
		Gundam a = new Gundam("White", 3500, 10000, 200000);
		Gundam b = new Gundam("Gray", 350, 10000, 150000);
		Zaku c = new Zaku("Zaku I", 300, 80000, 100000);
		Zaku d = new Zaku("Zaku II", 300, 80000, 100000);
		MSZ006 Zeta = new MSZ006("MSZ-006", 1000, 50000, 2000000);
		hangar.getGundams().add(a);
		hangar.getGundams().add(b);
		hangar.getGundams().add(c);
		hangar.getGundams().add(d);
		hangar.getGundams().add(Zeta);

		boolean isQuit = false;
		while (!isQuit) {
			printMenu(kb);
			switch (choice) {
			case 1:
				listGundams();
				break;
			case 2:
				flyGundams();
				break;
			case 3:
				fastestGundam();
				break;
			case 4:
				longestRange();
				break;
			case 5:
				shootBazookas();
				break;
			case 6:
				saberAttack();
				break;
			case 7:	
				loadGundam();
				break;
			case 8:
				removeGundam();
				break;
			case 9:
				System.out.println("Goodbye!");
				isQuit = true;
				break;
			default:
				System.out.println("Please select a valid option!");
			}
		}
	}

	public void printMenu(Scanner kb) {
		System.out.println("1. List out all Gundams");
		System.out.println("2. Release all Gundams");
		System.out.println("3. View Fastest Gundam");
		System.out.println("4. View Gundam with Longest Range");
		System.out.println("5. Shoot Bazookas");
		System.out.println("6. Beam Saber Attack!");
		System.out.println("7. Load Gundam into hangar");
		System.out.println("8. Remove Gundam from hangar");
		System.out.println("9. Quit Program");
		System.out.print("Make a selection: ");
		choice = kb.nextInt();
		System.out.println();
	}
	
	public void listGundams() {
		for (GundamBlueprint g : hangar.getGundams()) {
			System.out.println(g);
			System.out.println();
		}
	}
	
	public void flyGundams() {
		for (GundamBlueprint g : hangar.getGundams()) {
			g.fly();
			System.out.println();
		}
	}
	
	public void fastestGundam() {
		GundamBlueprint fastest = hangar.getGundams().get(0);
		for (GundamBlueprint g : hangar.getGundams()) {
			if(g.getSpeedMPH() > fastest.getSpeedMPH()) {
				fastest = g;
			}
		}
		System.out.println("The fastest gundam is: ");
		System.out.println(fastest);
		System.out.println();
	}
	
	public void longestRange() {
		GundamBlueprint furthest = hangar.getGundams().get(0);
		for (GundamBlueprint g : hangar.getGundams()) {
			if(g.getRange() > furthest.getRange()) {
				furthest = g;
			}
		}
		System.out.println("The gundam with the longest range is:");
		System.out.println(furthest);
		System.out.println();
		
	}
	
	public void loadGundam() {
		Gundam g;
		String nextModel;
		double nextSpeed;
		int nextRange;
		long nextPrice;
		System.out.print("Please enter the Gundam Model: ");
		nextModel = kb.next();
		System.out.println("Please enter the Gundam Max speed (in miles per hour): ");
		nextSpeed = kb.nextDouble();
		System.out.println("Please enter the Gundam fuel range (in miles)");
		nextRange = kb.nextInt();
		System.out.println("Please enter the Gundam price");
		nextPrice = kb.nextLong();
		g = new Gundam(nextModel, nextSpeed, nextRange, nextPrice);
		hangar.getGundams().add(g);
		System.out.println("Gundam is now ready for combat.");
		System.out.println();
		
	}
	
	public void removeGundam() {
		int hangarIndex;
		for(int i = 0; i< hangar.getGundams().size(); i++) {
			GundamBlueprint g = hangar.getGundams().get(i);
			System.out.println((i+1) + ": " + g.getModel());
		}
		System.out.println("Select a Gundam to remove");
		hangarIndex = kb.nextInt();
		hangarIndex--;
		System.out.println(hangar.getGundams().get(hangarIndex).getModel() + " has been removed");
		hangar.getGundams().remove(hangarIndex);
		System.out.println();
	}
	
	public void shootBazookas() {
		for(GundamBlueprint g : hangar.getGundams()) {
			if(g instanceof ZakuBazooka) {
				try {
					((ZakuBazooka) g).shoot();
				}
				catch (Exception e) {
					System.out.println("Exception Caught");
					e.printStackTrace();
				}
			}
		}
	}
	
	public void saberAttack() {
		for(GundamBlueprint g : hangar.getGundams()) {
			if(g instanceof MSZ006) {
				try {
					((MSZ006) g).slash();
				}
				catch (Exception e) {
					System.out.println("Exception Caught");
					e.printStackTrace();
				}
			}
		}
	}

}
