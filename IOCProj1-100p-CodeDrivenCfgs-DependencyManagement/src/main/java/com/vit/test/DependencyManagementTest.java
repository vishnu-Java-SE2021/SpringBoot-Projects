//DependencyManagementTest.java
package com.vit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vit.beans.WishMessageGenerator;
import com.vit.cfgs.AppConfig;

public class DependencyManagementTest {
    public static void main( String[] args ){

    	//IOC container creation
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    	//get target class obj from IOC container
    	WishMessageGenerator wmg = ctx.getBean("wmg", WishMessageGenerator.class);
    	
    	//invoke b.logic method
    	String result = wmg.getMessage("Boss");
    	
    	//display the result
    	System.out.println(result);
    	
    	//close IOC container
    	ctx.close();
    }
}
