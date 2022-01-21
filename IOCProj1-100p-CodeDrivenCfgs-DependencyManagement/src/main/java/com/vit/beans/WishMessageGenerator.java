//WishMessageGenerator.java
package com.vit.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg") //Bean id with "wmg" is created and stored in IOC container
public class WishMessageGenerator {

	@Autowired   //Injects bean, based on the type(LocalDateTime) from IOC container
	LocalDateTime ldt;
	
	//method to return wish message
	public String getMessage(String name) {
		int hour = ldt.getHour();
		
		if(hour<12)
			return "Good Morning :: "+name;
		else if(hour<16)
			return "Good Afternoon :: "+name;
		else if(hour<20)
			return "Good Evening :: "+name;
		else
			return "Good Night :: "+name;
	}
}
