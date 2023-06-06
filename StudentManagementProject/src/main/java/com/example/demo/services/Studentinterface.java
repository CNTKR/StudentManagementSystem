package com.example.demo.services;


import java.util.List;

import com.example.demo.entity.StudentData;

public interface Studentinterface {
	
	String Create(StudentData s);
	StudentData Read(String  s);
	List<StudentData> Alldata();
	String  Update(StudentData s);
	String Delete(String s);

}
