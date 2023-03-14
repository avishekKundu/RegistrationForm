package com.springMVC.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springMVC.Entity.Registration;
import com.springMVC.Service.RegService;

@Controller
public class RegistrationController {

	@Autowired
	private RegService regServ;
	
	@ModelAttribute
	public void commonView(Model mod) {
		mod.addAttribute("Title","Registration");
		mod.addAttribute("SubTitle","Fill all the details carefully");
	}
	
	@RequestMapping(path = "/home")
	public String getHome() {
		return "home";
	}
	
	@RequestMapping(path = "/register" , method = RequestMethod.POST)
	public String getRegisterForm(Model mod) {
		return "registration";
	}

	@RequestMapping(path = "/submitForm", method = RequestMethod.POST)
	public String getMessage(@ModelAttribute Registration reg,Model mod) {
		mod.addAttribute("reg",reg);
		reg.setDate(new Date());
		regServ.createRegistration(reg);
		return "registerSubmit";
	}
	

}


/*
 * @RequestMapping(path = "/submitForm", method = RequestMethod.POST) public
 * String getMessage(
 * 
 * @RequestParam("name") String name,
 * 
 * @RequestParam("email") String email, Model mod) { mod.addAttribute("name",
 * name); mod.addAttribute("email", email); return "registerSubmit"; }
 */
