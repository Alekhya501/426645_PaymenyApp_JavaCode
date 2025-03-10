package com.alekhya.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
private static int countId=0;
 	
 	private int userId;
 	private String userName;
 	private String password;
 	private String firstName;
 	private String lastName;
 	private String phoneNumber;
 	private String email;
 	private String address;
 	private UserAccounts userAcc;
 	private List<BankAccount> bankAccs;
 	
 	
 	public User() {
 		super();
 	}
 	public User(String userName, String password, String firstName, String lastName, String phoneNumber,
 			String email, String address, UserAccounts userAcc, List<BankAccount> bankAccs) {
 		super();
 		this.userId = ++countId;
 		this.userName = userName;
 		this.password = password;
 		this.firstName = firstName;
 		this.lastName = lastName;
 		this.phoneNumber = phoneNumber;
 		this.email = email;
 		this.address = address;
 		this.userAcc = userAcc;
 		bankAccs = new ArrayList<>();
 	}
 	
 	public User( String userName, String password, String firstName, String lastName, String phoneNumber,
			String email, String address) {
		super();
		
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}
	public int getUserId() {
 		return userId;
 	}
 	public void setUserId(int userId) {
 		this.userId = userId;
 	}
 	public String getUserName() {
 		return userName;
 	}
 	public void setUserName(String userName) {
 		this.userName = userName;
 	}
 	public String getPassword() {
 		return password;
 	}
 	public void setPassword(String password) {
 		this.password = password;
 	}
 	public String getFirstName() {
 		return firstName;
 	}
 	public void setFirstName(String firstName) {
 		this.firstName = firstName;
 	}
 	public String getLastName() {
 		return lastName;
 	}
 	public void setLastName(String lastName) {
 		this.lastName = lastName;
 	}
 	public String getPhoneNumber() {
 		return phoneNumber;
 	}
 	public void setPhoneNumber(String phoneNumber) {
 		this.phoneNumber = phoneNumber;
 	}
 	public String getEmail() {
 		return email;
 	}
 	public void setEmail(String email) {
 		this.email = email;
 	}
 	public String getAddress() {
 		return address;
 	}
 	public void setAddress(String address) {
 		this.address = address;
 	}
 	public UserAccounts getUserAcc() {
 		return userAcc;
 	}
 	public void setUserAcc(UserAccounts userAcc) {
 		this.userAcc = userAcc;
 	}
 	public List<BankAccount> getBankAccs() {
 		return bankAccs;
 	}
 	public void setBankAccs(List<BankAccount> bankAccs) {
 		this.bankAccs = bankAccs;
 	}
 
 	@Override
 	public String toString() {
 	    return "User [username=" + userName + ", firstName=" + firstName + 
 	           ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + "]";
 	}

 	
 	

}
