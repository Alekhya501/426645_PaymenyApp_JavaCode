package com.alekhya.menu;

import java.util.Scanner;

import com.alekhya.implementations.BankAccountActions;

public class WelcomeMenu {
	Scanner sc = new Scanner(System.in);

	public static void welMenu(Scanner sc) {
		System.out.println("Welome to PAYMENT GATEWAY");
		boolean flag = true;
		while (flag) {
			System.out.println("Enter 1 for Admin 2 for user 3 for bankAccountActions");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				AdminMenu.AdmMenu(sc);
				flag=false;
				break;

			case 2:
				UserMenu um = new UserMenu();
				um.userMenu(sc);
				flag=false;
				break;
			case 3:
				BankAccountActions baa=new BankAccountActions();
				baa.bankActions(sc);

			default:
				System.out.println("enter correct option");
				welMenu(sc);
			}
		}

	}

}
