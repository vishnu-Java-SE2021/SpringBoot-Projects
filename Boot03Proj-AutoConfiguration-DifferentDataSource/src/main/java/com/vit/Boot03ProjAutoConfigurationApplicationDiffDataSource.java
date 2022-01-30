//Boot03ProjAutoConfigurationApplicationDiffDataSource.java
package com.vit;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.vit.DAO.EmployeeDAO;

@SpringBootApplication  //@Configuration + @Componentscan(-) + @EnableAutoConfiguration
public class Boot03ProjAutoConfigurationApplicationDiffDataSource {

	
	@Bean
	public DataSource createDs() throws Exception {
		ComboPooledDataSource cp = new ComboPooledDataSource();
		cp.setDriverClass("oracle.jdbc.OracleDriver");
		cp.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		cp.setUser("scott");
		cp.setPassword("tiger");
		return cp;
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println("main(-) start..");
		
		//creation of IOC container and starts auto configuration activities
		ApplicationContext ctx = SpringApplication.run(Boot03ProjAutoConfigurationApplicationDiffDataSource.class, args);
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
