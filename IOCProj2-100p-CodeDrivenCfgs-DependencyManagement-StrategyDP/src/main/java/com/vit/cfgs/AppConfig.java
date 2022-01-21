package com.vit.cfgs;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.vit.beans")
public class AppConfig {
	public AppConfig(){
		System.out.println("0-param cons :: AppConfig");
	}
}
