//DieselEngine.java
package com.vit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("DEng") //Bean id with "DEng" is created and stored in IOC container
@Primary  //makes this bean id as prior dependent class for injecting to property(@Autowired) 
public final class DieselEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Diesel engine started...");	
	}

	@Override
	public void stop() {
		System.out.println("Diesel engine stopped...");
	}
}
