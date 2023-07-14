package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Registration;
import com.example.demo.repository.Regrepo;



@Service
public class Regimplim implements Reginterface{
	@Autowired
	Regrepo re;
	
	@Override
	public String Store(Registration reg) {
		re.save(reg);
		return "Stored success full";
	}

	@Override
	public boolean Checkemail(String email) {
		
		return re.existsByEmail(email);
	}
	@Override
	public boolean valid(String email, String password) {
		if(re.existsByEmail(email)) {
		Registration ts = re.getByEmail(email);
		String dbpasswd=ts.getPassword();
		ts.getProfession();
		if(password.equals(dbpasswd)) {
			return true;
		}
		else {
			return false;
		}
		}
		else {
			return false;
		}
		}

	@Override
	public String getuserRole(String email) {
		 Registration ts = re.getByEmail(email);
		    return ts.getProfession();
		
	}
	
	

}
