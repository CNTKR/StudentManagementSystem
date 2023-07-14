package com.example.demo.services;

import com.example.demo.entity.Registration;

public interface Reginterface {
	
	String Store(Registration reg);
	
boolean Checkemail(String email);
	
	boolean valid(String email,String password);
	
	String getuserRole(String email);
	

}
