package com.alekhya.interfaces;

import java.util.Date;
import java.util.List;

import com.alekhya.entities.SourceType;
import com.alekhya.entities.Transactions;
import com.alekhya.entities.User;

public interface TransactionInter {
	public void addTransaction(Transactions t);
	public void viewTransaction();
	
	public List<Transactions> searchTransaction(Date date);
	public void sortTransactionByAmount(double amount);
	public void sortTransactionByDate(Date startDate, Date endDate);
	public void sortTransactionByType(SourceType type);
	

}
