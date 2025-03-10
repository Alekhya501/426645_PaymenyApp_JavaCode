package com.alekhya.implementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.alekhya.data.AppData;
import com.alekhya.entities.SourceType;
import com.alekhya.entities.Transactions;
import com.alekhya.entities.User;
import com.alekhya.interfaces.TransactionInter;

public class TransactionImplementation  implements TransactionInter {
	List<Transactions> tran=AppData.inittxns();

	@Override
	public void addTransaction(Transactions t) {
		AppData.inittxns().add(t);
		
	}

	@Override
	public void viewTransaction() {
		if(tran.isEmpty()) {
			System.out.println("no transactions");
		}
		else {
			for(Transactions tx:tran) {
				System.out.println(tx);
			}
		}
		
	
	}


	@Override
	public List<Transactions> searchTransaction(Date date) {
		List<Transactions> result=new ArrayList<>();
		for(Transactions tx:tran) {
			if(tx.getTxnDateTime().equals(date)) {
				result.add(tx);
			}
		}
		if(result.isEmpty()) {
			System.out.println("no transactions found for the givn date");
		}
		
		return result;
	}

	@Override
	public void sortTransactionByAmount(double amount) {
	    List<Transactions> sortedtransactions = AppData.inittxns();

	    if (sortedtransactions.isEmpty()) {
	        System.out.println("No transactions available to sort.");
	        return;
	    }

	    Collections.sort(sortedtransactions, new Comparator<Transactions>() {
	        @Override
	        public int compare(Transactions t1, Transactions t2) {
	            if (t1.getTxnAmount() < t2.getTxnAmount()) {
	                return -1; 
	            } else if (t1.getTxnAmount() > t2.getTxnAmount()) {
	                return 1;
	            } else {
	                return 0; 
	            }
	        }
	    });

	    System.out.println("Transactions sorted by amount:");
	    for (Transactions txn :sortedtransactions) {
	        System.out.println(txn);
	    }
	}




	

	@Override
	public void sortTransactionByType(SourceType type) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sortTransactionByDate(Date startDate, Date endDate){
		// TODO Auto-generated method stub
		
	}

	
	

}
