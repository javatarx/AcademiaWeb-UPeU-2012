package edu.pe.acweb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.pe.acweb.web.form.LoginForm;

@Controller
public class LoginController {

	@RequestMapping(value="login.htm",method=RequestMethod.GET)
	public String verLogin(Model model){
		model.addAttribute("form", new LoginForm());
		return "login";
	}
	
}
