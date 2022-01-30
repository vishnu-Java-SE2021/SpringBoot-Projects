//PayrollSystem.java
package com.vit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.vit.DAO.Employee;
import com.vit.Service.IEmployeeMgmtServiceImpl;

@Controller("ps")			//@Configuration + ability to accept HTTP request
public class PayrollSystem {
	
	@Autowired				//injects empService bean from IOC container
	IEmployeeMgmtServiceImpl empService;
	
	//gathers employee records from service class
	public List<Employee> gatherEmployees(String desg1,String desg2,String desg3) throws Exception{
		List<Employee> employeeList = empService.fetchEmployeByDesg(desg1, desg2, desg3);
				
		return employeeList;
	}
	
}//class
