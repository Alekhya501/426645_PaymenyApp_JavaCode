package com.alekhya.menu;

import java.util.Scanner;

import com.alekhya.data.AppData;

public class AdminMenu {
	
	public static void AdmMenu(Scanner sc) {

		boolean flag = true;
		while (flag) {
			System.out.println("Welcome to Admin Actions");
			System.out.println("enter 1 for Login 2 for changing password 3 for userMenu");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Admin login");
				System.out.println("enter admin password");

				String pwd = sc.nextLine();
				if (pwd.equals(AppData.getAdminpassword())) {
					System.out.println("login succesfull");
				} else {
					System.out.println("enter correct password");
					AdmMenu(sc);

				}
				break;
			case 2:
				System.out.println("Enter Old password");
				String oldpwd = sc.nextLine();
				if (oldpwd.equals(AppData.getAdminpassword())) {
					System.out.println("enter new password");
					String newpwd = sc.nextLine();
					AppData.setAdminpassword(newpwd);
					System.out.println("password changed successfully");
				} else {
					System.out.println("enter correct password");
					AdmMenu(sc);
				}
			case 3:
				UserMenu um=new UserMenu();
				um.userRegistrationForm(sc);
			default:
				System.out.println("enter correct option");
					
				
			}

		}

	}

}
