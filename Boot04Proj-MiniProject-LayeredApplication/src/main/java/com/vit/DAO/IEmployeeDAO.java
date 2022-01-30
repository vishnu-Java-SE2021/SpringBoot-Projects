//IEmployeeDAO.java
package com.vit.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("empDAO")   
public interface IEmployeeDAO {
	public List<Employee> getEmpByDesg(String desg1,String desg2,String desg3) throws Exception;
}
