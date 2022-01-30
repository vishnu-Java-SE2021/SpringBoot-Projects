//IEmployeeMgmtServiceImpl.java
package com.vit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vit.DAO.Employee;
import com.vit.DAO.IEmployeeDAO;

@Service("IEmpMgServiceImpl")  // @Configuration + support of TX management
public class IEmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired								//injects DAO bean from IOC container
	IEmployeeDAO empDAO;  
	
	@Override      //fetches list of employess from DAO class
	public List<Employee> fetchEmployeByDesg(String desg1, String desg2, String desg3) throws Exception{
		List<Employee> employeeList = empDAO.getEmpByDesg(desg1, desg2, desg3); 
		return employeeList;
	}

}//class
