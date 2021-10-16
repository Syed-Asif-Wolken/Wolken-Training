package com.wolken.syedasif.Collections;
import java.util.*;
public class GunTester {
	static Scanner sc = new Scanner(System.in);
	static List<Gun> guns = new LinkedList();
	
	void save(Gun gun) {
		guns.add(gun);
	}
	
	void saveAll(List<Gun> al) {
		guns.addAll(al);
	}
	
	void getAll() {
		System.out.println("=============================================");
		for(Gun gun : guns) {
			System.out.println("Name: "+gun.getName()+"\nModel: "+gun.getModel()+"\nType: "+gun.getType()+"\nLicense: "+gun.getLicense()+"\nPrice: "+gun.getPrice());
			System.out.println("=============================================");
		}	
	}
	
	void getByLicense(int license) {
		System.out.println("=============================================");
		for(Gun gun : guns) {
			if(gun.getLicense() == license) {
				System.out.println("Name: "+gun.getName()+"\nModel: "+gun.getModel()+"\nType: "+gun.getType()+"\nLicense: "+gun.getLicense()+"\nPrice: "+gun.getPrice());
				System.out.println("=============================================");
				return;
			}
		}
		System.out.println("Data not found");
	}
	
	void getByModel(String model) {
		System.out.println("=============================================");
		for(Gun gun : guns) {
			if(gun.getModel().equalsIgnoreCase(model)) {
				System.out.println("Name: "+gun.getName()+"\nModel: "+gun.getModel()+"\nType: "+gun.getType()+"\nLicense: "+gun.getLicense()+"\nPrice: "+gun.getPrice());
				System.out.println("=============================================");
				return;
			}
		}	
		System.out.println("Data not found");
	}
	
	boolean updateByName(String name) {
		for(Gun gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				System.out.println("Enter Name: ");
				name = sc.nextLine();
				System.out.println("Enter Model: ");
				String model = sc.nextLine();
				System.out.println("Enter Type: ");
				String type = sc.nextLine();
				System.out.println("Enter License: ");
				int license = sc.nextInt();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				
				gun.setName(name);
				gun.setModel(model);
				gun.setType(type);
				gun.setLicense(license);
				gun.setPrice(price);
				guns.set(guns.indexOf(gun), gun);
				return true;
			}
		}
		return false;
	}
	
	boolean updateByModel(String model) {
		for(Gun gun : guns) {
			if(gun.getModel().equalsIgnoreCase(model)) {
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Model: ");
				model = sc.nextLine();
				System.out.println("Enter Type: ");
				String type = sc.nextLine();
				System.out.println("Enter License: ");
				int license = sc.nextInt();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				
				gun.setName(name);
				gun.setModel(model);
				gun.setType(type);
				gun.setLicense(license);
				gun.setPrice(price);
				guns.set(guns.indexOf(gun), gun);
				return true;
			}
		}
		return false;
	}
	
	boolean delete(String name) {
		for(Gun gun : guns) {
			if(gun.getName().equalsIgnoreCase(name)) {
				guns.remove(gun);
				return true;
			}
		}
		return false;
	}
	
	public static void main(String args[]) {
		GunTester test = new GunTester();
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert One");
			System.out.println("2. Insert Many");
			System.out.println("3. Display By License");
			System.out.println("4. Display By Model");
			System.out.println("5. Display All");
			System.out.println("6. Update By Name");
			System.out.println("7. Update By Model");
			System.out.println("8. Delete");
			System.out.println("Any Other Number to Quit");
			int choice = sc.nextInt();
			
			if(choice==1) {
					Gun gun = new Gun();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Model: ");
					String model = sc.nextLine();
					System.out.println("Enter Type: ");
					String type = sc.nextLine();
					System.out.println("Enter License: ");
					int license = sc.nextInt();
					System.out.println("Enter Price: ");
					float price = sc.nextFloat();
					
					gun.setName(name);
					gun.setModel(model);
					gun.setType(type);
					gun.setLicense(license);
					gun.setPrice(price);
					test.save(gun);
			}
			else if(choice == 2) {
				List<Gun> ll = new ArrayList<>();
				System.out.println("Enter number of elements:");
				int n = sc.nextInt();
				for(int i=0;i<n;i++) {
					Gun gun = new Gun();
					sc.nextLine();
					System.out.println("Enter Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Model: ");
					String model = sc.nextLine();
					System.out.println("Enter Type: ");
					String type = sc.nextLine();
					System.out.println("Enter License: ");
					int license = sc.nextInt();
					System.out.println("Enter Price: ");
					float price = sc.nextFloat();
					
					gun.setName(name);
					gun.setModel(model);
					gun.setType(type);
					gun.setLicense(license);
					gun.setPrice(price);
					ll.add(gun);
				}
				test.saveAll(ll);
			}
				
			else if (choice == 3) {
				System.out.println("Enter License: ");
				int license = sc.nextInt();
				test.getByLicense(license);
			}
			
			else if (choice == 4) {
				sc.nextLine();
				System.out.println("Enter Model: ");
				String model = sc.nextLine();
				test.getByModel(model);	
			}
			
			else if(choice == 5) {
				test.getAll();
			}
			
			else if (choice == 6) {
				sc.nextLine();
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
				System.out.println("Enter Model: ");
				String model = sc.nextLine();
				boolean flag = test.updateByModel(model);
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
