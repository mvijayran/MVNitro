package com.sapient.cui.generics;

import java.io.Serializable;

public class Address implements Serializable {
	
	
	//private static final long serialVersionUID= 1L;
	
	private String street;
	private String country;
	String city;
	
	
	
	public String getStreet() {
		return street;
	}




	public void setStreet(String street) {
		this.street = street;
	}




	public String getCountry() {
		return country;
	}




	public void setCountry(String country) {
		this.country = country;
	}
	
	




	@Override
	public String toString() {
		return new StringBuffer("street : ").append(this.street).append(" country : ").append(this.country).toString();
	}




	

}
