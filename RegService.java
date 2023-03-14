package com.springMVC.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springMVC.Entity.Registration;
import com.springMVC.Repository.RegisterDao;

@Service
public class RegService {

	@Autowired
	private RegisterDao regDao;
	
	public int createRegistration(Registration reg) {
		return regDao.saveDetails(reg);
	}
	
}
