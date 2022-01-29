//WishMessageGenerator.java
package com.vit.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")  //makes this class as spring bean with bean id "wmg"
public class WishMessageGenerator {
	
	@Autowired  //injects dependent bean retrieved from IOC container
	Calendar cal;

	//b.logic method
	public String getWishMessage(String name) {
		 int hour = cal.get(Calendar.HOUR_OF_DAY);
		 
		 if(hour<12)
			 return "Good morning :: "+name;
		 else if(hour<16)
			 return "Good afternoon :: "+name;
		 else if(hour<20)
			 return "Good evening :: "+name;
		 else
			 return "Good Night :: "+name;

	}
}//class
