package com.alekhya.main;

import java.util.Scanner;

import com.alekhya.implementations.UserActions;
import com.alekhya.menu.WelcomeMenu;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		WelcomeMenu.welMenu(sc);
		UserActions ua1=new UserActions();
		ua1.display();
	}

}
