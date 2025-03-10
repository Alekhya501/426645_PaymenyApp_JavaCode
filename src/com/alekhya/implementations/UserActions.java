package com.alekhya.implementations;

import com.alekhya.data.AppData;
import com.alekhya.entities.User;
import com.alekhya.interfaces.userinter;

public class UserActions implements userinter
{

	@Override
	public void register(User user) {
		AppData.initusers().add(user);
		
	}

	@Override
	public void login(User user) {
		AppData.setLoggedInUser(user);
	}

	@Override
	public void display() {
		if(AppData.getUsers()==null) {
			System.out.println("no users added");
		}
		else {
			for(User u:AppData.getUsers()) {
				System.out.println(u);
			}
		}
		
	}

	@Override
	public User checkuser(String username, String password) {
		for(User users:AppData.getUsers()) {
			if(users.getUserName().equals(username) && users.getPassword().equals(password)) {
				return users ;
			}
		}
		return null;
		
	}

}
