//Boot04ProjMiniProjectLayeredApplication.java
package com.vit;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.vit.Controller.PayrollSystem;
import com.vit.DAO.Employee;

@SpringBootApplication   //@Configuration + @ComponentScan + @EnableAutoConfiguration
public class Boot04ProjMiniProjectLayeredApplication {

	public static void main(String[] args) {
		//IOC container creation
		ApplicationContext ctx = SpringApplication.run(Boot04ProjMiniProjectLayeredApplication.class, args);
	
		//get Controller class bean from IOC container
		PayrollSystem ps = ctx.getBean("ps",PayrollSystem.class);
		
		//creating Scanner using tryWithResource
		try(Scanner sc = new Scanner(System.in)) {
			
			//gathering desginations from end user
			System.out.print("Enter desg 1 :: ");
			String desg1 = sc.nextLine().toUpperCase();
			
			System.out.print("Enter desg 2 :: ");
			String desg2 = sc.nextLine().toUpperCase();
			
			System.out.print("Enter desg 3 :: ");
			String desg3 = sc.nextLine().toUpperCase();
			
			//retrieve result (list of employee's)
			List<Employee> employeeList = ps.gatherEmployees(desg1, desg2, desg3);
		
			//displaying the results
			/*
			for(Employee emp : employeeList) {                                            //enhanced for loop
//				System.out.println("Employee details : "+emp);
				System.out.println(emp);
			} */
			
//			employeeList.forEach(emp->System.out.println(emp));         //java8 feature, lambda expression
			
			employeeList.forEach(System.out::println);								//java8 feature, method reference
		
		}//try
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}//catch
	
		//close the IOC container
		((ConfigurableApplicationContext)ctx).close();
		
	}//main
}//class
