package com.springMVC.Repository;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.springMVC.Entity.Registration;

@Repository
public class RegisterDao {

	@Autowired
	private HibernateTemplate hibTemp;
	
	@Transactional
	public int saveDetails(Registration reg) {
		Integer id = (Integer) hibTemp.save(reg);
		return id;
	}
	
}
