package com.alekhya.data;

import java.util.ArrayList;
import java.util.List;
import com.alekhya.entities.BankAccount;
import com.alekhya.entities.Transactions;
import com.alekhya.entities.User;
import com.alekhya.entities.UserAccounts;

public class AppData {
	private static List<User> users;
	private static List<UserAccounts> useraccs;
	private static List<BankAccount> bankaccs;
	private static List<Transactions> txns;
	private static User loggedInUser;
	private static String adminpassword="alekhya";

	public static User getLoggedInUser() {
		return loggedInUser;
	}

	public static void setLoggedInUser(User loggedInUser) {
		AppData.loggedInUser = loggedInUser;
	}

	public static List<User> initusers() {
		users = new ArrayList<>();
		return users;
	}

	public static List<UserAccounts> inituseracc() {
		useraccs = new ArrayList<>();
		return useraccs;
	}

	public static List<BankAccount> initbankacc() {
		bankaccs = new ArrayList<>();
		return bankaccs;
	}

	public static List<Transactions> inittxns() {
		txns = new ArrayList<>();
		return txns;
	}

	public static List<User> getUsers() {
		return users;
	}

	public static void setUsers(List<User> users) {
		AppData.users = users;
	}

	public static List<UserAccounts> getUseraccs() {
		return useraccs;
	}

	public static void setUseraccs(List<UserAccounts> useraccs) {
		AppData.useraccs = useraccs;
	}

	public static List<BankAccount> getBankaccs() {
		return bankaccs;
	}

	public static void setBankaccs(List<BankAccount> bankaccs) {
		AppData.bankaccs = bankaccs;
	}

	public static List<Transactions> getTxns() {
		return txns;
	}

	public static void setTxns(List<Transactions> txns) {
		AppData.txns = txns;
	}

	public static String getAdminpassword() {
		return adminpassword;
	}

	public static void setAdminpassword(String adminpassword) {
		AppData.adminpassword = adminpassword;
	}

	

	

}
