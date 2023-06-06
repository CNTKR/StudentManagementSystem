package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.StudentData;
import com.example.demo.services.StudentServices;
@Controller
@RequestMapping
public class DataController {
	StudentServices ss;
	public DataController(StudentServices ss) {
		super();
		this.ss = ss;
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

	
	public String Read(@RequestParam("kodid")String kodid,Model model) {
		StudentData res= ss.Read(kodid);
		model.addAttribute("Student", res);
		return "data";
	}
	@PostMapping("/posting-data")
	public String Create(@RequestParam("roll")String roll,@RequestParam("name")String name,@RequestParam("branch")String branch) {
		StudentData sd=new StudentData(roll,name,branch);
		ss.Create(sd);
		return "index";
	}
	@PutMapping("/updating-data")
	public String Update(@RequestParam("roll")String roll,@RequestParam("name")String name,@RequestParam("branch")String branch) {
		StudentData st=ss.Read(roll);
		st.setName(name);
		st.setBranch(branch);
		ss.Update(st);
		return "index";
	}
	@DeleteMapping("/delete-data")
	public String Delete(@RequestParam("kodid")String kodid) {
		 ss.Delete(kodid);
		return "index";
		
	}
}

