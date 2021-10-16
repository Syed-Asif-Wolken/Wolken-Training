package com.wolken.syedasif.Collections;
import java.util.*;
public class AmuseParkTester {
	static Scanner sc = new Scanner(System.in);
	static Set<AmusePark> guns = new TreeSet();
	int id;
	
	void save(AmusePark gun) {
		guns.add(gun);
	}
	
	void saveAll(Set<AmusePark> al) {
		guns.addAll(al);
	}
	
	void getAll() {
		System.out.println("=============================================");
		for(AmusePark gun : guns) {
			System.out.println("Name: "+gun.getName()+"\nLocation: "+gun.getLocation()+"\nNo Of Rides: "+gun.getNoOfRides()+"\nPrice: "+gun.getPrice());
			System.out.println("=============================================");
		}	
	}
	
	void getByName(String name) {
		System.out.println("=============================================");
		for(AmusePark gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				System.out.println("Name: "+gun.getName()+"\nLocation: "+gun.getLocation()+"\nNo Of Rides: "+gun.getNoOfRides()+"\nPrice: "+gun.getPrice());
				System.out.println("=============================================");
				return;
			}
		}
		System.out.println("Data not found");
	}
	
	void getByLocation(String loc) {
		System.out.println("=============================================");
		for(AmusePark gun : guns) {
			if(gun.getLocation().equalsIgnoreCase(loc)) {
				System.out.println("Name: "+gun.getName()+"\nLocation: "+gun.getLocation()+"\nNo Of Rides: "+gun.getNoOfRides()+"\nPrice: "+gun.getPrice());
				System.out.println("=============================================");
				return;
			}
		}	
		System.out.println("Data not found");
	}
	
	boolean updateByName(String name) {
		for(AmusePark gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				guns.remove(gun);
				System.out.println("Enter Name: ");
				name = sc.nextLine();
				System.out.println("Enter Location: ");
				String loc = sc.nextLine();
				System.out.println("Enter no of rides: ");
				int noOfRides = sc.nextInt();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				
				gun.setName(name);
				gun.setLocation(loc);
				gun.setNoOfRides(noOfRides);
				gun.setPrice(price);
				guns.add(gun);
				return true;
			}
		}
		return false;
	}
	
	boolean updateByLocation(String loc) {
		for(AmusePark gun : guns) {
			if(gun.getLocation().equalsIgnoreCase(loc)) {
				guns.remove(gun);
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Location: ");
				loc = sc.nextLine();
				System.out.println("Enter no of rides: ");
				int noOfRides = sc.nextInt();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				
				gun.setName(name);
				gun.setLocation(loc);
				gun.setNoOfRides(noOfRides);
				gun.setPrice(price);
				guns.add(gun);
				return true;
			}
		}
		return false;
	}
	
	boolean delete(String name) {
		for(AmusePark gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				guns.remove(gun);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		AmuseParkTester test = new AmuseParkTester();
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert One");
			System.out.println("2. Insert Many");
			System.out.println("3. Display By Name");
			System.out.println("4. Display By Location");
			System.out.println("5. Display All");
			System.out.println("6. Update By Name");
			System.out.println("7. Update By Location");
			System.out.println("8. Delete");
			System.out.println("Any Other Number to Quit");
			int choice = sc.nextInt();
			
			if(choice==1) {
					AmusePark gun = new AmusePark();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Location: ");
					String loc = sc.nextLine();
					System.out.println("Enter no of rides: ");
					int noOfRides = sc.nextInt();
					System.out.println("Enter Price: ");
					float price = sc.nextFloat();
					
					gun.setName(name);
					gun.setLocation(loc);
					gun.setNoOfRides(noOfRides);
					gun.setPrice(price);
					test.save(gun);
			}
			else if(choice == 2) {
				Set<AmusePark> ll = new TreeSet<>();
				System.out.println("Enter number of elements:");
				int n = sc.nextInt();
				for(int i=0;i<n;i++) {
					AmusePark gun = new AmusePark();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Location: ");
					String loc = sc.nextLine();
					System.out.println("Enter no of rides: ");
					int noOfRides = sc.nextInt();
					System.out.println("Enter Price: ");
					float price = sc.nextFloat();
					
					gun.setName(name);
					gun.setLocation(loc);
					gun.setNoOfRides(noOfRides);
					gun.setPrice(price);
					ll.add(gun);
				}
				test.saveAll(ll);
			}
				
			else if (choice == 3) {
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				test.getByName(name);
			}
			
			else if (choice == 4) {
				System.out.println("Enter Location: ");
				String loc = sc.nextLine();
				test.getByLocation(loc);	
			}
			
			else if(choice == 5) {
				test.getAll();
			}
			
			else if (choice == 6) {
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				boolean flag = test.updateByName(name);
				if(flag)
					System.out.println("Updated Successfully");
				else
					System.out.println("Update Failed");
			}
			else if(choice == 7) {
				sc.nextLine();
				System.out.println("Enter Location: ");
				String loc = sc.nextLine();
				boolean flag = test.updateByLocation(loc);
				if(flag)
					System.out.println("Updated Successfully");
				else
					System.out.println("Update Failed");
			}
			else if(choice == 8) {
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				boolean flag = test.delete(name);
				if(flag)
					System.out.println("Deleted Successfully");
				else
					System.out.println("Delete Failed");
			}
			else {
				break;
			}
		}
	}
}

