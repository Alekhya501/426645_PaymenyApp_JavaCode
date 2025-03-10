package com.alekhya.entities;

import java.util.Date;

public class UserAccounts {
	private static int countAccId=0;
		
	    private int userAccountId;
	    private Date accountOpenDate;
	    private double currentWalletBalance;
	    private String walletPin;
	    private int linkedBankAccountsCount;
	    private User user;
	    
	    public UserAccounts() {
			super();
		}

		public UserAccounts(Date accountOpenDate, double currentWalletBalance, String walletPin,
				int linkedBankAccountsCount, User user) {
			super();
			this.userAccountId = ++countAccId;
			this.accountOpenDate = accountOpenDate;
			this.currentWalletBalance = currentWalletBalance;
			this.walletPin = walletPin;
			this.linkedBankAccountsCount = linkedBankAccountsCount;
			this.user = user;
		}

		public int getUserAccountId() {
	        return userAccountId;
	    }

	    public void setUserAccountId(int userAccountId) {
	        this.userAccountId = userAccountId;
	    }

	    public Date getAccountOpenDate() {
	        return accountOpenDate;
	    }

	    public void setAccountOpenDate(Date accountOpenDate) {
	        this.accountOpenDate = accountOpenDate;
	    }

	    public double getCurrentWalletBalance() {
	        return currentWalletBalance;
	    }

	    public void setCurrentWalletBalance(double currentWalletBalance) {
	        this.currentWalletBalance = currentWalletBalance;
	    }

	    public String getWalletPin() {
	        return walletPin;
	    }

	    public void setWalletPin(String walletPin) {
	        this.walletPin = walletPin;
	    }

	    public int getLinkedBankAccountsCount() {
	        return linkedBankAccountsCount;
	    }

	    public void setLinkedBankAccountsCount(int linkedBankAccountsCount) {
	        this.linkedBankAccountsCount = linkedBankAccountsCount;
	    }

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
}
