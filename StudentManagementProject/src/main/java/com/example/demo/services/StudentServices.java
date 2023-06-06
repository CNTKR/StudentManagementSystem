package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentData;
import com.example.demo.repository.Studentrepo;

@Service
public class StudentServices implements Studentinterface {
	
	Studentrepo str;

	public StudentServices(Studentrepo str) {
		super();
		this.str = str;
	}

	@Override
	public String Create(StudentData s) {
		str.save(s);
		return "Added Successful";
	}

	@Override
	public StudentData Read(String s) {
		StudentData res=str.findById(s).get();
		return res;
	}

	@Override
	public List<StudentData> Alldata() {
		List<StudentData> res=str.findAll();
		return res;
	}

	@Override
	public String Update(StudentData s) {
		str.save(s);
		return "Updated Successful";
	}

	

	@Override
	public String Delete(String s) {
		str.deleteById(s);
		return "Deleted Successful";
	}
	
	

	
}
