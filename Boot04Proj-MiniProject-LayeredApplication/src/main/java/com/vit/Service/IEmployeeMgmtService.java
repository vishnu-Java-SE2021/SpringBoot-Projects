//IEmployeeMgmtService.java
package com.vit.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vit.DAO.Employee;

@Service("IEmpMgService")   //@Configuration + support of TX management
public interface IEmployeeMgmtService {
	public List<Employee> fetchEmployeByDesg(String desg1,String desg2,String desg3) throws Exception;
}
