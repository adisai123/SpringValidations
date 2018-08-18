package com.aditya;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		Student theStudent = new Student();
		
		theModel.addAttribute("student", theStudent);
		
		theModel.addAttribute("theCountryOptions", countryOptions); 
		
		return "student-mapping";

	}
	
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult,Model theModel) {
		theModel.addAttribute("student", theStudent);
		if(theBindingResult.hasErrors()) {
			return "student-mapping";
		}
		else {
			return "processForm";
		}
		
	}
	
	@InitBinder
	public void initBinder(WebDataBinder wDB) {
		StringTrimmerEditor sTE= new StringTrimmerEditor(true);
		wDB.registerCustomEditor(String.class, sTE);
	}

}
