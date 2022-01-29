//Vehicle.java
package com.vit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle") //Bean id with "veh" is created and stored in IOC container
public final class Vehicle {
	
		@Autowired   //makes this property for injecting bean from IOC container(Dependency management)
		@Qualifier("engType")  //makes this injection with a given bean id(we use this annotation, if we get ambiguity problem)
		Engine engine;
		
		//b.logic method 
		public void journey(String place) {
			engine.start();
			System.out.println("Journey started to : "+place);
			System.out.println("Reached : "+place);
			engine.stop();
		}
}
