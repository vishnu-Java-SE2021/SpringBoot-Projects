package com.vit.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan(basePackages="com.vit.beans")
@ImportResource("com/vit/cfgs/applicationContext.xml")
public class AppConfig {
	public AppConfig(){
		System.out.println("0-param cons :: AppConfig");
	}
}
