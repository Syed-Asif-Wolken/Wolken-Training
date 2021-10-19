package com.wolken.syedasif.jdbc;
import java.util.Scanner;
import com.wolken.syedasif.jdbc.dao.MarketDetailsDAO;
import com.wolken.syedasif.jdbc.dao.MarketDetailsDAOImpl;
import com.wolken.syedasif.jdbc.dto.MarketDetailsDTO;

public class MarketTester {

	public static void main(String[] args) {
		MarketDetailsDAO dao = new MarketDetailsDAOImpl();
		MarketDetailsDTO dto = new MarketDetailsDTO();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert One");
			System.out.println("2. Display By Location");
			System.out.println("3. Display All");
			System.out.println("4. Update By Id");
			System.out.println("5. Delete");
			System.out.println("Any Other Number to Quit");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Location: ");
				String location = sc.nextLine();
				System.out.println("Enter No Of Shops: ");
				int noOfShops = sc.nextInt();
				dto.setId(id);
				dto.setName(name);
				dto.setLocation(location);
				dto.setNoOfShops(noOfShops);
				boolean flag = dao.save(dto);
				if(flag)
					System.out.println("Data Saved Successfully");
				else
					System.out.println("Data Not Saved");
			}
			else if(choice == 2) {
				sc.nextLine();
				System.out.println("Enter Location to Display: ");
				String location = sc.nextLine();
				dto.setLocation(location);
				dao.getByLocation(dto);
			}
			else if(choice == 3) {
				dao.getAll();
			}
			else if(choice == 4) {
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				dto.setId(id);
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Location: ");
				String location = sc.nextLine();
				System.out.println("Enter No Of Shops: ");
				int noOfShops = sc.nextInt();
				dto.setName(name);
				dto.setLocation(location);
				dto.setNoOfShops(noOfShops);
				boolean flag = dao.updateById(dto);
				if(flag)
					System.out.println("Data Updated Successfully");
				else
					System.out.println("Data Update Failed");
			}
			else if(choice == 5) {
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				dto.setId(id);
				boolean flag = dao.delete(dto);
				if(flag)
					System.out.println("Data Deleted Successfully");
				else
					System.out.println("Data Delete Failed");
			}
			else {
				break;
			}
		}
		sc.close();
	}
}
