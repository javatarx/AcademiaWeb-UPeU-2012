package edu.upeu.acweb.web.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.upeu.acweb.web.form.LoginForm;
import edu.upeu.acweb.web.validator.LoginValidator;

@Controller
public class LoginController {

	@Resource
	private LoginValidator loginValidator;
	
	@RequestMapping(value="login.htm",method=RequestMethod.GET)
	public @ModelAttribute("login")LoginForm formulario(){
		return new LoginForm();
	}
	
	@RequestMapping(value="login.htm", method=RequestMethod.POST)
	public String validarLogin(@ModelAttribute("login")LoginForm formulario,BindingResult result){
		
		loginValidator.validate(formulario, result);
		if(result.hasErrors()){
			return "login";
		}
		
		return "redirect:menuPrincipal.htm";
	}
	
	@RequestMapping(value="menuPrincipal.htm",method=RequestMethod.GET)
	public String verMenuPrincipal(){
		return "menuPrincipal";
	}
	
}
