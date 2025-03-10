package com.alekhya.menu;

import java.security.Timestamp;
import java.util.Date;
import java.util.Scanner;

import com.alekhya.entities.Transactions;
import com.alekhya.implementations.TransactionImplementation;

public class TransactionMenu {
	public void tranMenu(Scanner sc) {
		TransactionImplementation ti=new TransactionImplementation();
		System.out.println("Enter 1 for add transaction 2 for view transactions 3 for search transaction"
				+ " 4 for sorttransaction 5 for exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			
			System.out.println("Enter txnId");
			int txnid=sc.nextInt();
//			System.out.println("Enter txnDateTime");
//			Timestamp txnDateTime=sc.next();
			System.out.println("Enter source id");
			int sourceid=sc.nextInt();
			System.out.println("Enter dest id");
			int destid=sc.nextInt();
			System.out.println("Enter amount");
			double amount=sc.nextInt();
//			Transactions t1=new Transactions(txnid,txnDateTime,sourceid,destid,"BANK_ACCOUNT", "WALLET_ACCOUNT",25000,);
			
		case 2:
			ti.viewTransaction();
			
		case 3:
//			ti.searchTransaction(Date date);
		case 4:
//			ti.sortTransactionByAmount(amount);
		case 5:
			System.out.println("exit");
			
			
			
			
			
		}
	}

}
