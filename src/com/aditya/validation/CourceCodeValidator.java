package com.aditya.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourceCodeValidator implements ConstraintValidator<CourceCode, String> {

	String courcePrefix;
	@Override
	public void initialize(CourceCode constraintAnnotation) {
		this.courcePrefix=constraintAnnotation.value();
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		if(arg0 !=null && arg0.startsWith(courcePrefix)) {
			return true;
		}
		return false;
	}

}
