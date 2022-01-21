//Vehicle.java
package com.vit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("veh") //Bean id with "veh" is created and stored in IOC container
public final class Vehicle {
	
		@Autowired   //makes this property for injecting bean from IOC container(Dependency management)
		@Qualifier("DEng")  //makes this injection with a given bean id(we use this annotation, if we get ambiguity problem)
		Engine eng;
		
		//b.logic method 
		public void journey(String place) {
			eng.start();
			System.out.println("Journey started to : "+place);
			System.out.println("Reached : "+place);
			eng.stop();
		}
}
