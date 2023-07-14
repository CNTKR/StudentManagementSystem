package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Registration;
import com.example.demo.services.Regimplim;


@Controller
public class Usercontroller {
	@Autowired
	Regimplim regi;
	
	 @PostMapping("/store-data")
		public String Storedata(@RequestParam("first-name")String fname,@RequestParam("last-name")String lname,@RequestParam("dob")String dob,@RequestParam("gender")String gender,@RequestParam("profession")String profession,@RequestParam("phone")long phone,@RequestParam("email")String email,@RequestParam("password")String password,@RequestParam("confirm-password")String confirmpassword) {
			boolean emailExist=regi.Checkemail(email);
			if(emailExist==false) {
				Registration ts = new Registration(fname,lname,dob,gender,profession,phone,email,password,confirmpassword);
			regi.Store(ts);
			System.out.println("Successfully registered");
			return "login";
			}else {
				System.out.println("Already exist");
				return "registration";
			}
	    }
	 
	 @PostMapping("/valid-data")
	 public String validatedata(@RequestParam("email")String email,@RequestParam("password")String password) {
			boolean v = regi.valid(email, password);
			if(v==true) {
				if(regi.getuserRole(email).equals("student")) {
					return "index";
				}
				else {
				return "index";
			}
			}
			else {
				System.out.println("incorrect credentials , try again");
				return "login";
			}
		}
}

