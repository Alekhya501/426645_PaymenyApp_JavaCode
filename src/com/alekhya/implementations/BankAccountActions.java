package com.alekhya.implementations;

import java.util.ArrayList;
import java.util.Scanner;

import com.alekhya.data.AppData;
import com.alekhya.entities.AccountStatus;
import com.alekhya.entities.BankAccount;
import com.alekhya.entities.User;
import com.alekhya.interfaces.BankAccountinter;

public class BankAccountActions implements BankAccountinter {

	public void bankActions(Scanner sc) {
		boolean flag = true;
		while (flag) {
			System.out.println(
					"Enter 1 for add bank account 2 for remove bank account 3 for display account details 4 for update bank status 5 to exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.println("Enter Bank Account ID: ");
				String bankAccountId = sc.nextLine();
				System.out.println("Enter Account Number: ");
				String accNo = sc.nextLine();
				System.out.println("Enter IFSC Code: ");
				String ifscCode = sc.nextLine();

				System.out.println("Enter Bank Name: ");
				String bankName = sc.nextLine();
				System.out.println("Enter Branch Location: ");
				String branchLocation = sc.nextLine();
				User loggedInUser = AppData.getLoggedInUser();
				if (loggedInUser == null) {
	                System.out.println("Error: No user is logged in. Please log in first.");
	                break;
	            }

				BankAccount newAccount = new BankAccount(bankAccountId, accNo, ifscCode, AccountStatus.ACTIVE, bankName,
						branchLocation, loggedInUser);
				AppData.initbankacc().add(newAccount);
				addBankAcc(newAccount);
				break;
			case 2:
				System.out.println("Enter bank name to remove: ");
				String bankToRemove = sc.nextLine();
				
				removeBankAcc(bankToRemove, AppData.getLoggedInUser());
				break;
			case 3:
				System.out.println("Enter bank name to display details: ");
				String bankToDisplay = sc.nextLine();
				displayAccDetails(bankToDisplay, AppData.getLoggedInUser());
				break;
			case 4:
				System.out.println("Enter bank name to update status: ");
				String bankToUpdate = sc.nextLine();
				System.out.println("Enter new status (ACTIVE/INACTIVE): ");
				String statusInput = sc.nextLine().toUpperCase();
				AccountStatus status = AccountStatus.valueOf(statusInput);
				updateBankAccStatus(status, bankToUpdate, AppData.getLoggedInUser());
				break;
			case 5:
				flag = false;
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}

	@Override
	public void addBankAcc(BankAccount b) {
		User loggedInUser = AppData.getLoggedInUser();

	    if (loggedInUser.getBankAccs() == null) {
	        loggedInUser.setBankAccs(new ArrayList<>());
	    }

	    loggedInUser.getBankAccs().add(b);
	    System.out.println("Account created successfully");
	}

	@Override
	public void removeBankAcc(String bankname, User user) {
		for (BankAccount ba : user.getBankAccs()) {
			if (ba.getBank_name().equals(bankname)) {
				user.getBankAccs().remove(ba);
				System.out.println("Account removed successfully");
				return;
			}
		}
		System.out.println("Bank not found");
	}

	@Override
	public void displayAccDetails(String bankname, User user) {
		for (BankAccount ba : user.getBankAccs()) {
			if (ba.getBank_name().equals(bankname)) {
				System.out.println(ba);
				return;
			}
		}
		System.out.println("Bank not found");
	}

	@Override
	public void updateBankAccStatus(AccountStatus s, String bankname, User user) {
		for (BankAccount ba : user.getBankAccs()) {
			if (ba.getBank_name().equals(bankname)) {
				ba.setAccountStatus(s);
				System.out.println("Status changed successfully");
				return;
			}
		}
		System.out.println("Bank not found");
	}
}
