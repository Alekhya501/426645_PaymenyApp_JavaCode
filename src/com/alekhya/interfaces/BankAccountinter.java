package com.alekhya.interfaces;

import com.alekhya.entities.AccountStatus;
import com.alekhya.entities.BankAccount;
import com.alekhya.entities.User;

public interface BankAccountinter {
	public void addBankAcc(BankAccount b);
	public void removeBankAcc(String bankname,User user);
	public void displayAccDetails(String bankname,User user);
	public void updateBankAccStatus(AccountStatus s,String bankname,User user);
	
	
}
