package com.aditya;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.aditya.validation.CourceCode;

public class Student {
	
	@CourceCode(value="Adi",message="Please start it with Adi")
	private String firstName;
	
	@NotNull(message="is Required")
	@Size(min=1 ,message="field is Required")
	private String lastName;
	private String country;
	private String favourateLanguage;
	
	@Max(value=10,message="Must be less than or equal to ten")
	@Min(value=0, message=" must be greater than or equal to zero ")
	@NotNull(message="is Required")
	private Integer freePasses;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}",message="only 5 char/digits")
	private String postalCode;
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	private String[] os;
	
	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	private LinkedHashMap<String, String> countryOptions;

	public String getFavourateLanguage() {
		return favourateLanguage;
	}

	public void setFavourateLanguage(String favourateLanguage) {
		this.favourateLanguage = favourateLanguage;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Student() {
//		countryOptions = new LinkedHashMap<String, String>();
//		countryOptions.put("IN", "INDIA");
//		countryOptions.put("BR", "Brazil");
	}

}
