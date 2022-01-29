//PetrolEngine.java
package com.vit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrol") //Bean id with "PEng" is created and stored in IOC container
@Primary  //makes this bean id as prior dependent class for injecting to property(@Autowired) 
public final class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Petrol engine started...");
	}

	@Override
	public void stop() {
		System.out.println("Petrol engine stopped...");
	}
}
