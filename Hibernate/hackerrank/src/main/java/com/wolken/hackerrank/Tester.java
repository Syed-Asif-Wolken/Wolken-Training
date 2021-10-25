package com.wolken.hackerrank;

import java.util.Scanner;

import com.wolken.hackerrank.dto.LoginDTO;
import com.wolken.hackerrank.dto.UserDTO;
import com.wolken.hackerrank.services.RegistrationService;
import com.wolken.hackerrank.services.RegistrationServiceImpl;

public class Tester 
{
    public static void main( String[] args )
    {
    	
    	Scanner sc = new Scanner(System.in);
    	while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Register");
			System.out.println("2. Login");
			System.out.println("3. Forgot Password");
//			System.out.println("4. Delete");
			System.out.println("Any Other Number to Quit");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				UserDTO dto = new UserDTO();
				System.out.println("Enter Id: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter User Name: ");
				String name = sc.nextLine();
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				System.out.println("Enter Date of Birth: ");
				String dob = sc.nextLine();
				System.out.println("Enter Password: ");
				String password = sc.nextLine();
				System.out.println("Confirm Password: ");
				String cnfPassword = sc.nextLine();
				System.out.println("Enter Contact Number: ");
				long contactNumber = sc.nextLong();
				dto.setId(id);
				dto.setUsername(name);
				dto.setEmail(email);
				dto.setDob(dob);
				dto.setContactNumber(contactNumber);
				dto.setPassword(password);
				dto.setCnfPassword(cnfPassword);
				RegistrationService service=new RegistrationServiceImpl();
				service.validateAndSave(dto);
			}
			else if(choice == 2) {
				sc.nextLine();
				LoginDTO dto = new LoginDTO();
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				System.out.println("Enter Password: ");
				String password = sc.nextLine();
				dto.setEmail(email);
				dto.setPassword(password);
				RegistrationService service=new RegistrationServiceImpl();
				String login = service.loginValidation(dto);
				if(login.contains("Successful"))
					System.out.println(login);
				else
					System.err.println(login);
			}
			else if(choice == 3) {
				sc.nextLine();
				UserDTO dto = new UserDTO();
				System.out.println("Enter email: ");
				String email = sc.nextLine();
				System.out.println("Enter new Password: ");
				String password = sc.nextLine();
				System.out.println("Confirm new Password: ");
				String cnfPassword = sc.nextLine();
				dto.setEmail(email);
				dto.setPassword(password);
				dto.setCnfPassword(cnfPassword);
				RegistrationService service=new RegistrationServiceImpl();
				String update = service.UpdatePassword(dto);
				if(update.contains("Successful"))
					System.out.println(update);
				else
					System.err.println(update);
			}
			else {
				break;
			}
		}
		sc.close();
    }
}
