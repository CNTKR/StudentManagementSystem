package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class NavController {
	@GetMapping("/ground-page")
	public String Ground() {
		return "Ground";
	}
	@GetMapping("/register-page")
	public String registration() {
		return "registration";
	}
	@GetMapping("/log-page")
	public String Login() {
		return "login";
	}
	
	@GetMapping("/")
	public String Index() {
		return "index";
	}
	
	@GetMapping("/adding-data")
	public String Create() {
		return "adding";
	}
	@GetMapping("/reading-data")
	public String Readin() {
		return "reading";
	}
	@GetMapping("/updating-data")
	public String Update() {
		return "updating";
	}
	@GetMapping("/droping-data")
	public String Delete() {
		return "droping";
	}
	@GetMapping("/viewing-data")
	public String Viewdata() {
		return "data";
	}
	@GetMapping("/databyid")
	public String databyid() {
		return "databyid";
	}
	

}
