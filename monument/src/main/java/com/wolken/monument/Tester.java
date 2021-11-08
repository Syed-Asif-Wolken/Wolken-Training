package com.wolken.monument;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.monument.dto.UserDTO;
import com.wolken.monument.services.RegistrationService;
import com.wolken.monument.services.RegistrationServiceImpl;

public class Tester 
{
    public static void main( String[] args )
    {
    	UserDTO dto = new UserDTO();
    	
    	Scanner sc = new Scanner(System.in);
    	while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Insert One");
//			System.out.println("2. Display By Id");
//			System.out.println("3. Update By Id");
//			System.out.println("4. Delete");
			System.out.println("Any Other Number to Quit");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				sc.nextLine();
				System.out.println("Enter Name of Monument: ");
				String name = sc.nextLine();
				System.out.println("Enter Builder Name: ");
				String builder = sc.nextLine();
				System.out.println("Enter Location: ");
				String location = sc.nextLine();
				System.out.println("Enter Year of Build: ");
				int year = sc.nextInt();
				dto.setName(name);
				dto.setBuilder(builder);
				dto.setLocation(location);
				dto.setYear(year);
				RegistrationService service= new RegistrationServiceImpl();
				service.validateAndSave(dto);
				break;
			}
			else {
				break;
			}
		}
		sc.close();
    }
}
