//DependencyManagementTest_StrategyDP.java
package com.vit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vit.beans.Vehicle;
import com.vit.cfgs.AppConfig;

public class DependencyManagementTest_StrategyDP_Props {
    public static void main( String[] args ) {
        
    	//IOC container creation
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	//get target class obj from IOC container
    	Vehicle veh = ctx.getBean("vehicle", Vehicle.class);
    	
    	//invoke b.logic method
    	veh.journey("Mumbai");
    	
    	//close the IOC container
    	ctx.close();
    }//main
}//class
