//EmployeeDAO.java
package com.vit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("empDAO") 
public class EmployeeDAO {
	
	//query to fetch total count of employee in "EMP" table from DB
	public static final String GET_EMP_COUNT = "SELECT COUNT(*) FROM EMP";
	
	@Autowired
	DataSource ds;
	
	//b.logic method
	public int getEmpCount() throws Exception {
		
		System.out.println("Datasource obj class :: "+ds.getClass());
		
		//get connection using datasource obj
		Connection con = ds.getConnection();
		System.out.println("Connection obj class :: "+con.getClass());
		
		//create preparedstatement obj
		PreparedStatement ps = con.prepareStatement(GET_EMP_COUNT);
		System.out.println("PreparedStatement obj class :: "+ps.getClass());
		
		//execute the query
		ResultSet rs = ps.executeQuery();
		System.out.println("ResultSet obj class :: "+rs.getClass());
	
		//process the result
		rs.next();
		int count = rs.getInt(1);
		
		return count;
	
	}
}//class
