//AppConfig.java
package com.vit.cfgs;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   //makes class as configuration class
@ComponentScan(basePackages="com.vit.beans")  //scans all classes in the packages and creates objects and stores in IOC container
public class AppConfig {
	
	@Bean("sysDate")  //pre-defined class object is created and stored in IOC container
	public LocalDateTime getDate() {
		return LocalDateTime.now();
	}

}
