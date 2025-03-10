package com.alekhya.entities;

public class BankAccount {

	private final String bank_account_id;
	private final String account_number;
	private final String ifsc_code;
	private AccountStatus accountStatus;
	private final String bank_name;
	private final String bank_account_branch_location;
	private final User user;
	public BankAccount() {
	    this.bank_account_id = "";
	    this.account_number = "";
	    this.ifsc_code = "";
	    this.accountStatus = AccountStatus.INACTIVE; 
	    this.bank_name = "";
	    this.bank_account_branch_location = "";
	    this.user = null;
	}
	public BankAccount(String bank_account_id, String account_number, String ifsc_code, AccountStatus actStatus,
			String bank_name, String bank_account_branch_location, User user) {
		super();
		this.bank_account_id = bank_account_id;
		this.account_number = account_number;
		this.ifsc_code = ifsc_code;
		this.accountStatus = actStatus;
		this.bank_name = bank_name;
		this.bank_account_branch_location = bank_account_branch_location;
		this.user = user;
	}
	

	
	public AccountStatus getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(AccountStatus accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getBank_account_id() {
		return bank_account_id;
	}

	public String getAccount_number() {
		return account_number;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public String getBank_name() {
		return bank_name;
	}

	public String getBank_account_branch_location() {
		return bank_account_branch_location;
	}

	public User getUser() {
		return user;
	}

	@Override
	public String toString() {
		return "BankAccounts [bank_account_id=" + bank_account_id + ", account_number=" + account_number
				+ ", ifsc_code=" + ifsc_code + ", accountStatus=" + accountStatus + ", bank_name=" + bank_name
				+ ", bank_account_branch_location=" + bank_account_branch_location + ", user=" + user + "]";
	}

}
