//IEmployeeDAOImpl.java
package com.vit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("empDAOImpl")   //@Configuration + support of driving sql/jdbc exceptions to Spring exceptions
public class IEmployeeDAOImpl implements IEmployeeDAO {

	public static final String GET_EMP_BY_DESG = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?)";
	
	@Autowired  			//injects data source bean from IOC container after performing auto configuration from application.properties files
	DataSource ds;
	
	@Override   //gets employee's details from DB
	public List<Employee> getEmpByDesg(String desg1, String desg2, String desg3) throws Exception {
		
		//get connection from jdbc con pool
		Connection con = ds.getConnection();
		
		//create PreparedStatement obj
		PreparedStatement ps = con.prepareStatement(GET_EMP_BY_DESG);
		
		//add params to query
		ps.setString(1, desg1);
		ps.setString(2, desg2);
		ps.setString(3, desg3);
		
		//execute the query and gather ResultSet obj
		ResultSet rs = ps.executeQuery();
		
		//creating a list to store employee records
		List<Employee> employeeList = new ArrayList<>();
		
		//process the ResultSet
		while(rs.next()) {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setJob(rs.getString(3));
			emp.setSalary(rs.getDouble(4));
			
			employeeList.add(emp);
			}		

		return employeeList;
	}

}//class
