package edu.upeu.acweb.web.validator;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import edu.upeu.acweb.web.form.LoginForm;

@Component
public class LoginValidator implements Validator {

	@Override
	public boolean supports(Class<?> class1) {
		return LoginForm.class.isAssignableFrom(class1);
	}

	@Override
	public void validate(Object object, Errors errors) {
		
		LoginForm form = (LoginForm)object;
		
		if (StringUtils.isEmpty(form.getLogin())) {
			errors.rejectValue("login", "loginForm.login.required");
		}
		
		if (StringUtils.isEmpty(form.getPasswd())) {
			errors.rejectValue("passwd", "loginForm.passwd.required");
		}
		
	}

}
