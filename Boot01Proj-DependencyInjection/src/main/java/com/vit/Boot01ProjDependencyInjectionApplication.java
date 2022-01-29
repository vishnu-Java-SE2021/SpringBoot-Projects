//Boot01ProjDependencyInjectionApplication.java
package com.vit;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.vit.beans.WishMessageGenerator;

@SpringBootApplication  //makes this class as configuration class and scans the dependent beans in current and sub packages
public class Boot01ProjDependencyInjectionApplication {
	
	@Bean("cal")  //makes the pre-defined class as spring beans
	public Calendar getTime() {
		return Calendar.getInstance();
	}
	
	public static void main(String[] args) {
		//creation of IOC container
		ApplicationContext ctx = SpringApplication.run(Boot01ProjDependencyInjectionApplication.class, args);

		//get target spring bean from IOC container
		WishMessageGenerator wmg = ctx.getBean("wmg", WishMessageGenerator.class);
		
		//invoke b.logic method
		String result = wmg.getWishMessage("Vishnu");
		
		//display the result
		System.out.println(result);
		
		//close the IOC container
		((ConfigurableApplicationContext)ctx).close();

	}//main
}//class
