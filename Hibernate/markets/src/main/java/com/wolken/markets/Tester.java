package com.wolken.markets;
import java.util.Scanner;

import com.wolken.markets.dao.MarketDetailsDAO;
import com.wolken.markets.dao.MarketDetailsDAOImpl;
import com.wolken.markets.entity.MarketDetails;
public class Tester 
{
    public static void main( String[] args )
    {
    	MarketDetailsDAO dao = new MarketDetailsDAOImpl();
    	MarketDetails dto = new MarketDetails();
    	
    	Scanner sc = new Scanner(System.in);
    	while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert One");
			System.out.println("2. Display By Id");
			System.out.println("3. Update By Id");
			System.out.println("4. Delete");
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
				String out = dao.save(dto);
				System.out.println(out);
			}
			else if(choice == 2) {
				sc.nextLine();
				System.out.println("Enter Id to Display: ");
				int id = sc.nextInt();
				dao.getById(id);
			}
			else if(choice == 3) {
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
				String out = dao.update(dto);
				System.out.println(out);
			}
			else if(choice == 4) {
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				dto.setId(id);
				String out = dao.delete(id);
				System.out.println(out);
			}
			else {
				break;
			}
		}
		sc.close();
    }
}
