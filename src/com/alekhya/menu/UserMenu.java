package com.alekhya.menu;

import java.util.Scanner;

import com.alekhya.data.AppData;
import com.alekhya.entities.User;
import com.alekhya.implementations.UserActions;

public class UserMenu {
	
	
	private UserActions ua = new UserActions();
	
	public static void userMenu(Scanner sc) {
 		UserMenu um = new UserMenu(); 
 		
 		boolean flag = true;
 		do {
 			System.out.println("Enter 1. Register 2. Login");
 			int choice = sc.nextInt();
 			sc.nextLine(); // Consume newline
 			
 			switch (choice) {
 				case 1:
 					um.userRegistrationForm(sc); 
 					flag=false;
 					break;

 				case 2:
 					um.loginForm(sc);
 					flag=false;
 					break;

 				default:
 					System.out.println("Enter correct option");
 			}
 		} while (flag);
 	}
	
	public User userRegistrationForm(Scanner sc) {
		System.out.println("Welcome to Registration");

		System.out.println("Enter username: ");
		String uname = sc.nextLine();
		sc.nextLine();
		
		System.out.println("Enter password: ");
		String upass = sc.nextLine();
		
		System.out.println("Enter First Name: ");
		String fname = sc.nextLine();
		
		System.out.println("Enter Last Name: ");
		String lname = sc.nextLine();
		
		System.out.println("Enter phone number: ");
		String phno = sc.nextLine();
		
		System.out.println("Enter email: ");
		String email = sc.nextLine();
		
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		
		
		User currentuser = new User(uname, upass, fname, lname, phno, email, address);
		ua.register(currentuser);
		
		System.out.println("Registration successful!");
		
		
		loginForm(sc);

		return currentuser;
	}
	
	 public User loginForm(Scanner sc) {
	     	System.out.println("Enter username");
	     	String uname = sc.nextLine();
	     	System.out.println("Enter password");
	     	String upass = sc.nextLine();
	     	UserActions userActions = new UserActions();
	     	User currentUser = userActions.checkuser(uname, upass);
	     	if(currentUser!=null) {
	     		System.out.println("login successfull");
	     		AppData.setLoggedInUser(currentUser);
	     		WelcomeMenu wm=new WelcomeMenu();
	     		wm.welMenu(sc);
	     	}
	     	else {
	     		System.out.println("login failed");
	     	}
	         return currentUser;
	     }
}
