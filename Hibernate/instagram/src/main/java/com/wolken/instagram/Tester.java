package com.wolken.instagram;

import java.util.Scanner;

import com.wolken.instagram.dto.UserDTO;
import com.wolken.instagram.services.RegistrationService;
import com.wolken.instagram.services.RegistrationServiceImpl;

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
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter User Name: ");
				String name = sc.nextLine();
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				System.out.println("Enter Date of Birth: ");
				String dob = sc.nextLine();
				System.out.println("Enter Gender: ");
				String gender = sc.nextLine();
				System.out.println("Enter Password: ");
				String password = sc.nextLine();
				System.out.println("Enter Contact Number: ");
				long contactNumber = sc.nextLong();
				dto.setId(id);
				dto.setUsername(name);
				dto.setEmail(email);
				dto.setDob(dob);
				dto.setContactNumber(contactNumber);
				dto.setGender(gender);
				dto.setPassword(password);
				RegistrationService service=new RegistrationServiceImpl();
				service.validateAndSave(dto);
			}
			else {
				break;
			}
		}
		sc.close();
    }
}
