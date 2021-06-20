package com.jaym.Spring;

import org.springframework.stereotype.Component;

//executing bean property

@Component
public class Tyre {
   
	private String brand; //encapsulated variable is the property
//	
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Tyre, It's working";
	}
	
	
	
}
