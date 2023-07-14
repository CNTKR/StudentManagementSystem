package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String FName;
	String LName;
	String DOB;
	String Gender;
	String Profession;
	String UserType;
	long Phoneno;
	String email;
	String Password;
	String ConfirmPasswd;
	public Registration() {
		super();
		
	}
	public Registration(String fName, String lName, String dOB, String gender, String profession,
			long phoneno, String email, String password, String confirmPasswd) {
		super();
		FName = fName;
		LName = lName;
		DOB = dOB;
		Gender = gender;
		Profession = profession;
		
		Phoneno = phoneno;
		this.email = email;
		Password = password;
		ConfirmPasswd = confirmPasswd;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public String getUserType() {
		return UserType;
	}
	
	public long getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(long phoneno) {
		Phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getConfirmPasswd() {
		return ConfirmPasswd;
	}
	public void setConfirmPasswd(String confirmPasswd) {
		ConfirmPasswd = confirmPasswd;
	}
	@Override
	public String toString() {
		return "TrainerStudent [FName=" + FName + ", LName=" + LName + ", DOB=" + DOB + ", Gender=" + Gender
				+ ", Profession=" + Profession + ",  Phoneno=" + Phoneno + ", email=" + email
				+ ", Password=" + Password + ", ConfirmPasswd=" + ConfirmPasswd + "]";
	}
	
	}

	


