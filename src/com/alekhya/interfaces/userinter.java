package com.alekhya.interfaces;

import com.alekhya.entities.User;

public interface userinter {
	public void register(User user);
	public void login(User user);
	public void display();
	public User checkuser(String username,String password);
}
