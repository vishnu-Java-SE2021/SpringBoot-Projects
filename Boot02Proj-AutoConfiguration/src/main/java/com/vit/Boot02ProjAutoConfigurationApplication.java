//Boot02ProjAutoConfigurationApplication.java
package com.vit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.vit.DAO.EmployeeDAO;

@SpringBootApplication  //@Configuration + @Componentscan(-) + @EnableAutoConfiguration
public class Boot02ProjAutoConfigurationApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("main(-) start..");
		
		//creation of IOC container and starts auto configuration activities
		ApplicationContext ctx = SpringApplication.run(Boot02ProjAutoConfigurationApplication.class, args);
		System.out.println("IOC Container :: "+ctx.getClass());
		
		//get target bean from IOC container
		EmployeeDAO empDAO = ctx.getBean("empDAO", EmployeeDAO.class);
	
		//invoke b.logic method
		int count = empDAO.getEmpCount();
		
		//display results
		System.out.println("No. of employee's are :: "+count);
		System.out.println("main(-) end..");

		//close IOC container
		((ConfigurableApplicationContext)ctx).close();

	}//main
}//class
