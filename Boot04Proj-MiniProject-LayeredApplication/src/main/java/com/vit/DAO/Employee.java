//Employee.java
package com.vit.DAO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	int empId;
	String name;
	String job;
	double salary;
}
