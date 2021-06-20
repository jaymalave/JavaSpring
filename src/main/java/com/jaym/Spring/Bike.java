package com.jaym.Spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
     public void drive(){
    	 System.out.println("We Ride The Bike");
     }
}


